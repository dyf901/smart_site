package com.zty.smart_site.controller;

import com.zty.smart_site.entity.*;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.CodeService;
import com.zty.smart_site.service.DepartmentService;
import com.zty.smart_site.service.StaffService;
import com.zty.smart_site.service.WorktypeService;
import com.zty.smart_site.util.ProvinceUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Api(description = "员工接口")
@RestController
@RequestMapping("staff")
@CrossOrigin
public class StaffController {
    @Autowired
    private StaffService staffService;//员工

    @Autowired
    private WorktypeService worktypeService;//工种

    @Autowired
    private CodeService codeService;//验证码

    @ApiOperation(value = "增加员工信息",notes = "{\"staff_name\":\"ssw\",\"staff_age\":24,\"staff_img\":\"1.png\",\"staff_sex\":\"男\",\"staff_nation\":\"汉\",\"staff_card\":\"341100000000000011\",\"staff_address\":\"河南省西平县\",\"staff_phone\":\"13100000000\",\"sos_name\":\"ssw\",\"sos_ship\":\"亲戚\",\"sos_phone\":\"13000000000\",\"section_id\":1,\"station_id\":1,\"sub_id\":1,\"worktype_id\":2,\"type\":\"管理员\"}")
    @PostMapping("/InsertStaff")
    public JsonResult InsertStaff(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        Staff staff = staffService.FindStaffByStaff_card(map);
        if(staff==null){
            map.put("staff_province",ProvinceUtil.Province((String) map.get("staff_address")));
            Worktype worktype = worktypeService.FindWorktypeByWorktypeId(map);
            map.put("person_count",worktype.getPerson_count());
            staffService.InsertStaff(map);
            worktypeService.UpdateWorktypePerson_count(map);
            jsonResult.setMessage("增加成功!");
            return jsonResult;
        }else {
            jsonResult.setMessage("员工已存在或信息有误,增加失败!");
            return jsonResult;
        }


    }

    @ApiOperation(value = "删除员工信息",notes = "{\"id\":2}")
    @PostMapping("/DeleteStaff")
    public boolean DeleteStaff(@RequestBody Map map){
        return staffService.DeleteStaff(map)==1;
    }

    @ApiOperation(value = "修改员工信息",notes = "{\"staff_name\":\"ssw1\",\"staff_age\":24,\"staff_img\":\"1.png\",\"staff_sex\":\"男\",\"staff_nation\":\"汉\",\"staff_card\":\"341000000000000000\",\"staff_address\":\"河南省西平县\",\"staff_province\":\"河南省\",\"staff_phone\":\"13100000000\",\"sos_name\":\"ssw\",\"sos_ship\":\"亲戚\",\"sos_phone\":\"13000000000\",\"section_id\":1,\"sub_id\":1,\"worktype_id\":1,\"type\":\"管理员\",\"id\":2}")
    @PostMapping("/UpdateStaff")
    public boolean UpdateStaff(@RequestBody Map map){
        return staffService.UpdateStaff(map)==1;
    }

    @ApiOperation(value = "修改App头像",notes = "{\"id\":2,\"picture\":\"1.png\"}")
    @PostMapping("/UpdateStaffPicture")
    public boolean UpdateStaffPicture(@RequestBody Map map){
        return staffService.UpdateStaffPicture(map)==1;
    }

    @ApiOperation(value = "修改App登录密码",notes = "{\"id\":2,\"password\":\"111111\"}")
    @PostMapping("/UpdateStaffPassword")
    public JsonResult UpdateStaffPassword(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        Staff staff = staffService.FindStaffByStaff_phone(map);
        if(staff.getPassword().equals(map.get("old_password"))){
            staffService.UpdateStaffPassword(map);
            jsonResult.setCode(200);
            jsonResult.setMessage("修改成功!");
            return jsonResult;
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("旧密码错误,修改失败!");
            return jsonResult;
        }

    }

    @ApiOperation(value = "忘记密码",notes = "测试数据:{\"id\":1,\"password\":\"960901\",\"code\":\"123456\",\"staff_phone\":\"13100000000\"}")
    @PostMapping("/ForgetPassword")
    public JsonResult ForgetPassword(@RequestBody Map map) throws ParseException {
        JsonResult jsonResult = new JsonResult();
        map.put("phone",map.get("staff_phone"));
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
                staffService.UpdateStaffPassword(map);
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

    @ApiOperation(value = "修改员工在职/离职状态",notes = "{\"id\":2}")
    @PostMapping("/UpdateStaffState")
    public boolean UpdateStaffState(@RequestBody Map map){
        return staffService.UpdateStaffState(map)==1;
    }

    @ApiOperation(value = "修改员工培训状态",notes = "{\"id\":2}")
    @PostMapping("/UpdateStaffTrain")
    public boolean UpdateStaffTrain(@RequestBody Map map){
        return staffService.UpdateStaffTrain(map)==1;
    }

    @ApiOperation(value = "分页模糊查询员工信息",notes = "{\"pageNo\":1,\"pageSize\":10,\"section_id\":1}")
    @PostMapping("/FindStaff")
    public Page<Staff> FindStaff(@RequestBody Map map){
        Page<Staff> page = new Page<Staff>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(staffService.Total(map));
        page.setItems(staffService.FindStaff(map));
        return page;
    }


}
