package com.zty.smart_site.controller;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.Staff;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static com.zty.smart_site.util.AliyunSmsUtils.sendSms;
import static com.zty.smart_site.util.CodeUtil.getNewcode;
import static com.zty.smart_site.util.CodeUtil.setNewcode;

@Api(description = "验证码接口")
@RestController
@RequestMapping("code")
@CrossOrigin
public class CodeController {
    @ApiOperation(value = "获取验证码",notes = "")
    @PostMapping("/gain_code")
    public JsonResult add_userapp(@RequestBody Map map) throws ClientException {
        JsonResult jsonResult = new JsonResult();
        setNewcode();
        String code = Integer.toString(getNewcode());
        String phone=(String) map.get("username");
        SendSmsResponse response =sendSms(phone,code);
        System.out.println(response.getCode());
        map.put("code",code);
        /*Staff staff=userAppDao.findByUsername(map);
        System.out.println("1:"+staff);
        //判断账号是否存在
        if (staff==null){
            userAppDao.add_userapp(map);//不存在创建
        }else {
            userAppDao.upd_code(map);//存在修改code
        }*/
        //根据短信返回的Code判断短信发送结果
        if (response.getCode().equals("OK")){
            jsonResult.setMessage("验证码已发送");
            jsonResult.setCode(200);
            return jsonResult;
        }else if(response.getCode().equals("isv.MOBILE_NUMBER_ILLEGAL")){
            jsonResult.setMessage("无效号码");
            jsonResult.setCode(20005);
            return jsonResult;
        }else {
            jsonResult.setMessage("未知错误");
            jsonResult.setCode(70001);
            return jsonResult;
        }


    }
}
