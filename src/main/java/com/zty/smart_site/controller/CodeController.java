package com.zty.smart_site.controller;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.zty.smart_site.entity.Code;
import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.Staff;
import com.zty.smart_site.service.CodeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.zty.smart_site.util.AliyunSmsUtils.sendSms;
import static com.zty.smart_site.util.CodeUtil.getNewcode;
import static com.zty.smart_site.util.CodeUtil.setNewcode;

@Api(description = "验证码接口")
@RestController
@RequestMapping("code")
@CrossOrigin
public class CodeController {
    @Autowired
    private CodeService codeService;//验证码

    @ApiOperation(value = "获取验证码" , notes = "传参:`staff_phone`(手机号码)")
    @PostMapping("/gain_code")
    public JsonResult add_userapp(@RequestBody Map map) throws ClientException {
        JsonResult jsonResult = new JsonResult();
        //System.out.println(map);
        setNewcode();//通过随机数生成验证码
        String code = Integer.toString(getNewcode());
        String phone = (String) map.get("staff_phone");//获取前端手机号
        boolean flag = true;

            Pattern p = Pattern.compile("^1[0-9]{10}$");
        Matcher m = p.matcher(phone);
        flag = m.matches();
            System.out.println(flag);
            if(flag==false){
                jsonResult.setMessage("无效号码");
                jsonResult.setCode(20005);
                return jsonResult;
            }

        map.put("phone" , phone);
        map.put("code" , code);
        SendSmsResponse response = sendSms(phone, code);//发送短信
        Code code1 = codeService.FindCodeByPhone(map);//根据号码查询表内有无对应验证码
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        System.out.println("当前时间：" + sdf.format(now));
        Date afterDate = new Date(now.getTime() + 300000);
        map.put("uptime" , sdf.format(afterDate));//把验证码有效时间存入数据库
        System.out.println(sdf.format(afterDate));
        //根据短信返回的Code判断短信发送结果
        if (response.getCode().equals("OK")) {
            if (code1 == null) {
                codeService.InsertCode(map);//验证码表内无对应号码,添加验证码
            } else {
                codeService.UpdateCode(map);//验证码表内有对应号码,修改验证码
            }
            jsonResult.setMessage("验证码已发送");
            jsonResult.setCode(200);
            return jsonResult;
        } else if (response.getCode().equals("isv.MOBILE_NUMBER_ILLEGAL")) {
            jsonResult.setMessage("无效号码");
            jsonResult.setCode(20005);
            return jsonResult;
        } else {
            jsonResult.setMessage("未知错误");
            jsonResult.setCode(70001);
            return jsonResult;
        }


    }
}
