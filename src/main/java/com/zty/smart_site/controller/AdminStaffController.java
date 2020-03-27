package com.zty.smart_site.controller;

import com.zty.smart_site.entity.AdminStaff;
import com.zty.smart_site.entity.Code;
import com.zty.smart_site.entity.Department;
import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.AdminStaffService;
import com.zty.smart_site.service.CodeService;
import com.zty.smart_site.service.DepartmentService;
import com.zty.smart_site.util.ProvinceUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Api(description = "标段管理人员接口")
@RestController
@RequestMapping("sectionStaff")
@CrossOrigin
public class AdminStaffController {
    @Autowired
    private AdminStaffService adminStaffService;//管理人员

    @Autowired
    private DepartmentService departmentService;//部门

    @Autowired
    private CodeService codeService;//验证码

    @ApiOperation(value = "增加管理人员",notes = "测试数据:{\"admin_name\":\"ssw\",\"admin_age\":24,\"admin_img\":\"1.png\",\"admin_sex\":\"男\",\"admin_nation\":\"汉\",\"admin_card\":\"341100000000000000\",\"admin_address\":\"河南省西平县\",\"admin_province\":\"河南省\",\"admin_phone\":\"13100000000\",\"sos_name\":\"ssw\",\"sos_ship\":\"亲戚\",\"sos_phone\":\"13000000000\",\"section_id\":1,\"department_id\":1,\"password\":\"123456\",\"picture\":\"boy.jpg\",\"type\":\"管理员\"}")
    @PostMapping("/InsertAdminStaff")
    public JsonResult InsertAdminStaff(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        AdminStaff adminStaff = adminStaffService.FindAdminStaffByStaff_card(map);
        AdminStaff adminStaff1= adminStaffService.FindAdminStaffByStaff_phone(map);
        if (adminStaff==null && adminStaff1==null){
            map.put("admin_province", ProvinceUtil.Province((String) map.get("admin_address")));
            Department department = departmentService.FindDepartmentByDepartmentId(map);
            map.put("percount",department.getPercount());
            adminStaffService.InsertAdminStaff(map);
            departmentService.UpdateDepartmentPercount(map);
            jsonResult.setMessage("增加成功!");
            return jsonResult;
        }else {
            jsonResult.setMessage("员工已存在或信息有误,增加失败!");
            return jsonResult;
        }

    }

    @ApiOperation(value = "删除管理人员",notes = "测试数据:{\"id\":1}")
    @PostMapping("/DeleteAdminStaff")
    public boolean DeleteAdminStaff(@RequestBody Map map){
        return adminStaffService.DeleteAdminStaff(map)==1;
    }

    @ApiOperation(value = "修改管理人员",notes = "测试数据:{\"admin_name\":\"ssw\",\"admin_age\":24,\"admin_img\":\"1.png\",\"admin_sex\":\"男\",\"admin_nation\":\"汉\",\"admin_card\":\"341100000000000000\",\"admin_address\":\"河南省西平县\",\"admin_province\":\"河南省\",\"admin_phone\":\"13100000000\",\"sos_name\":\"ssw\",\"sos_ship\":\"亲戚\",\"sos_phone\":\"13000000000\",\"section_id\":1,\"department_id\":1,\"password\":\"123456\",\"picture\":\"boy.jpg\",\"type\":\"管理员\"}")
    @PostMapping("/UpdateAdminStaff")
    public boolean UpdateAdminStaff(@RequestBody Map map){
        return adminStaffService.UpdateAdminStaff(map)==1;
    }

    @ApiOperation(value = "修改App密码(无验证码)",notes = "测试数据:{\"id\":1,\"password\":\"960901\",\"old_password\":\"123456\",\"admin_phone\":\"13100000000\"}")
    @PostMapping("/UpdateAdminStaffPassword")
    public JsonResult UpdateAdminStaffPassword(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        AdminStaff adminStaff = adminStaffService.FindAdminStaffByStaff_phone(map);
        if (adminStaff.getPassword().equals(map.get("old_password"))){
            adminStaffService.UpdateAdminStaffPassword(map);
            jsonResult.setCode(200);
            jsonResult.setMessage("修改成功!");
            return jsonResult;
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("旧密码错误,修改失败!");
            return jsonResult;
        }
    }

    @ApiOperation(value = "忘记密码",notes = "测试数据:{\"id\":1,\"password\":\"960901\",\"code\":\"123456\",\"admin_phone\":\"13100000000\"}")
    @PostMapping("/ForgetPassword")
    public JsonResult ForgetPassword(@RequestBody Map map) throws ParseException {
        JsonResult jsonResult = new JsonResult();
        map.put("phone",map.get("admin_phone"));
        Code code = codeService.FindCodeByPhone(map);
        int c=code.getCode();
        int d= (int) map.get("code");
        if (d==c){
            // 获取当前时间d
            Date date = new Date();
            //如果想比较日期则写成"yyyy-MM-dd"就可以了
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //将字符串形式的时间转化为Date类型的时间
            Date a=sdf.parse(code.getUptime());
            Date b= sdf.parse(sdf.format(date));
            if(a.getTime()-b.getTime()>=0) {
                adminStaffService.UpdateAdminStaffPassword(map);
                jsonResult.setCode(200);
                jsonResult.setMessage("修改成功!");
                return jsonResult;
            }else {
                jsonResult.setCode(20006);
                jsonResult.setMessage("验证码失效,请重新申请!");
                return jsonResult;
            }

        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("旧密码错误,修改失败!");
            return jsonResult;
        }
    }

    @ApiOperation(value = "分页模糊查询管理人员",notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":1}")
    @PostMapping("/FindAdminStaff")
    public Page<AdminStaff> FindAdminStaff(@RequestBody Map map){
        Page<AdminStaff> page = new Page<AdminStaff>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(adminStaffService.Total(map));
        page.setItems(adminStaffService.FindAdminStaff(map));
        return page;
    }
}
