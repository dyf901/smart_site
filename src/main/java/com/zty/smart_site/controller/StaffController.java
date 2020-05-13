package com.zty.smart_site.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
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

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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

    @ApiOperation(value = "增加员工信息" , notes = "{\"staff_name\":\"ssw\",\"staff_age\":24,\"staff_img\":\"1.png\",\"staff_sex\":\"男\",\"staff_nation\":\"汉\",\"staff_card\":\"341100000000000011\",\"staff_address\":\"河南省西平县\",\"staff_phone\":\"13100000000\",\"sos_name\":\"ssw\",\"sos_ship\":\"亲戚\",\"sos_phone\":\"13000000000\",\"section_id\":1,\"station_id\":1,\"sub_id\":1,\"worktype_id\":2,\"type\":\"管理员\"}")
    @PostMapping("/InsertStaff")
    public JsonResult InsertStaff(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        Staff staff = staffService.FindStaffByStaff_card(map);
        if (staff == null) {
            map.put("staff_province" , ProvinceUtil.Province((String) map.get("staff_address")));
            Worktype worktype = worktypeService.FindWorktypeByWorktypeId(map);
            map.put("person_count" , worktype.getPerson_count());
            staffService.InsertStaff(map);
            worktypeService.UpdateWorktypePerson_count(map);
            jsonResult.setMessage("增加成功!");
            return jsonResult;
        } else {
            jsonResult.setMessage("员工已存在或信息有误,增加失败!");
            return jsonResult;
        }


    }

    @ApiOperation(value = "删除员工信息" , notes = "{\"id\":2}")
    @PostMapping("/DeleteStaff")
    public boolean DeleteStaff(@RequestBody Map map) {
        return staffService.DeleteStaff(map) == 1;
    }

    @ApiOperation(value = "修改员工信息" , notes = "{\"staff_name\":\"ssw1\",\"staff_age\":24,\"staff_img\":\"1.png\",\"staff_sex\":\"男\",\"staff_nation\":\"汉\",\"staff_card\":\"341000000000000000\",\"staff_address\":\"河南省西平县\",\"staff_province\":\"河南省\",\"staff_phone\":\"13100000000\",\"sos_name\":\"ssw\",\"sos_ship\":\"亲戚\",\"sos_phone\":\"13000000000\",\"section_id\":1,\"sub_id\":1,\"worktype_id\":1,\"type\":\"管理员\",\"id\":2}")
    @PostMapping("/UpdateStaff")
    public boolean UpdateStaff(@RequestBody Map map) {
        return staffService.UpdateStaff(map) == 1;
    }

    @ApiOperation(value = "修改员工信息App" , notes = "{\"id\":2,\"picture\":\"1.png\"}")
    @PostMapping("/UpdateStaffApp")
    public JsonResult UpdateStaffApp(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        int i = staffService.UpdateStaffApp(map);
        if (i == 1) {
            jsonResult.setCode(200);
            jsonResult.setMessage("修改成功!");
            return jsonResult;
        } else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("修改失败!");
            return jsonResult;
        }
    }

    @ApiOperation(value = "修改App登录密码" , notes = "{\"id\":2,\"password\":\"111111\"}")
    @PostMapping("/UpdateStaffPassword")
    public JsonResult UpdateStaffPassword(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        Staff staff = staffService.FindStaffByStaff_phone(map);
        if (staff.getPassword().equals(map.get("old_password"))) {
            staffService.UpdateStaffPassword(map);
            jsonResult.setCode(200);
            jsonResult.setMessage("修改成功!");
            return jsonResult;
        } else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("旧密码错误,修改失败!");
            return jsonResult;
        }

    }

    @ApiOperation(value = "忘记密码" , notes = "测试数据:{\"password\":\"960901\",\"code\":\"123456\",\"staff_phone\":\"13100000000\"}")
    @PostMapping("/ForgetPassword")
    public JsonResult ForgetPassword(@RequestBody Map map) throws ParseException {
        JsonResult jsonResult = new JsonResult();
        Staff staff = staffService.FindStaffByStaff_phone(map);
        map.put("id" , staff.getId());
        map.put("phone" , map.get("staff_phone"));
        Code code = codeService.FindCodeByPhone(map);
        int c = code.getCode();
        int d = (int) map.get("code");
        if (d == c) {
            // 获取当前时间d
            Date date = new Date();
            //如果想比较日期则写成"yyyy-MM-dd"就可以了
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //将字符串形式的时间转化为Date类型的时间
            Date a = sdf.parse(code.getUptime());
            Date b = sdf.parse(sdf.format(date));
            if (a.getTime() - b.getTime() >= 0) {
                staffService.UpdateStaffPassword(map);
                jsonResult.setCode(200);
                jsonResult.setMessage("修改成功!");
                return jsonResult;
            } else {
                jsonResult.setCode(20006);
                jsonResult.setMessage("验证码失效,请重新申请!");
                return jsonResult;
            }

        } else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("验证码错误,修改失败!");
            return jsonResult;
        }
    }

    @ApiOperation(value = "修改员工在职/离职状态" , notes = "{\"id\":2}")
    @PostMapping("/UpdateStaffState")
    public boolean UpdateStaffState(@RequestBody Map map) {
        return staffService.UpdateStaffState(map) == 1;
    }

    @ApiOperation(value = "修改员工培训状态" , notes = "{\"id\":2}")
    @PostMapping("/UpdateStaffTrain")
    public boolean UpdateStaffTrain(@RequestBody Map map) {
        return staffService.UpdateStaffTrain(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询员工信息" , notes = "{\"pageNo\":1,\"pageSize\":10,\"section_id\":1}")
    @PostMapping("/FindStaff")
    public Page<Staff> FindStaff(@RequestBody Map map) {
        Page<Staff> page = new Page<Staff>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(staffService.Total(map));
        page.setItems(staffService.FindStaff(map));
        return page;
    }

    @ApiOperation(value = "根据id查询员工信息" , notes = "传参:id")
    @PostMapping("/FindStaffById")
    public JsonResult FindStaffById(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(200);
        jsonResult.setData(staffService.FindStaffById(map));
        return jsonResult;
    }

    @ApiOperation(value = "生成员工信息二维码" , notes = "")
    @PostMapping("/StaffSm")
    public void StaffSm(@RequestBody Map map) {
        try {
            /*JSONObject json = new JSONObject();
            json.put("id", 1);
            json.put("type", "peixun");*/
            map.put("staff_id" , map.get("id"));
            map.put("type" , 2);

            JSONObject json = new JSONObject(map);

            String s = json.toJSONString();
            //二维码表示的内容
            String content = "http://www.baidu.com";

            //存放logo的文件夹
            //String path = "D:/ceshi/";  //本地
            String path = "/root/img/";   //服务器

            MultiFormatWriter
                    multiFormatWriter = new MultiFormatWriter();

            @SuppressWarnings("rawtypes")
            Map hints = new HashMap();

            //设置UTF-8， 防止中文乱码
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            //设置二维码四周白色区域的大小
            hints.put(EncodeHintType.MARGIN, 0);
            //设置二维码的容错性
            hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);

            //width:图片完整的宽;height:图片完整的高
            //因为要在二维码下方附上文字，所以把图片设置为长方形（高大于宽）
            int width = 400;
            int height = 460;

            //画二维码，记得调用multiFormatWriter.encode()时最后要带上hints参数，不然上面设置无效
            BitMatrix bitMatrix = multiFormatWriter.encode(s, BarcodeFormat.QR_CODE, width, height, hints);

            String uuid = UUID.randomUUID().toString().replaceAll("-" , "");
            String tempFileName = uuid + ".jpg";
            map.put("staff_code" , tempFileName);
            //qrcFile用来存放生成的二维码图片（无logo，无文字）
            File qrcFile = new File(path, tempFileName);

            staffService.InsertStaffCode(map);
            //logoFile准备放在二维码中的图片(path:图片路径,图片名称)
            File logoFile = new File(path, "shilinwei.jpg");

            //开始画二维码
            MatrixToImageWriter.writeToFile(bitMatrix, "jpg" , qrcFile);

            /*//在二维码中加入图片
            CreatrQrCode creatrQrCode = new CreatrQrCode(); //LogoConfig中设置Logo的属性
            addLogo_QRCode(qrcFile, logoFile, creatrQrCode);


            int font = 20; //字体大小
            int fontStyle = 4; //字体风格

            //用来存放的带有logo+文字的二维码图片
            String newImageWithText = "D:/ceshi/456.jpg";
            //带有logo二维码图片
            String targetImage = "D:/ceshi/789.png";
            //附加在图片上的文字信息
            String text = "my name is Shi Linwei";

            //在二维码下方添加文字（文字居中）
            pressText(text, newImageWithText, targetImage, fontStyle, Color.red, font,  width,  height) ;*/

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
