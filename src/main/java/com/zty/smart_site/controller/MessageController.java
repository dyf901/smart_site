package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Message;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.MessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "我的信息接口")
@RestController
@RequestMapping("message")
@CrossOrigin
public class MessageController {
    @Autowired
    private MessageService messageService;//我的信息

    @ApiOperation(value = "分页模糊查询" , notes = "测试数据:")
    @PostMapping("/FindMessage")
    public Page<Message> FindMessage(@RequestBody Map map) {
        Page<Message> page = new Page<Message>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(messageService.Total(map));
        page.setItems(messageService.FindMessage(map));
        return page;
    }
}
