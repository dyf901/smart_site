package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.PartyNews;
import com.zty.smart_site.entity.PartyPhoto;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.PartyNewsService;
import com.zty.smart_site.service.PartyPhotoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "党建新闻接口")
@RestController
@RequestMapping("PartyNews")
@CrossOrigin
public class PartyNewsController {
    @Autowired
    private PartyNewsService partyNewsService;

    @ApiOperation(value = "增加党建新闻",notes = "")
    @PostMapping("/InsertPartyNews")
    public JsonResult InsertPartyNews(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =partyNewsService.InsertPartyNews(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("增加成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "删除党建新闻",notes = "")
    @PostMapping("/DeletePartyNews")
    public JsonResult DeletePartyNews(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =partyNewsService.DeletePartyNews(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("删除成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("删除失败!");
        }
        return jsonResult;
    }


    @ApiOperation(value = "修改党建新闻",notes = "")
    @PostMapping("/UpdatePartyNews")
    public JsonResult UpdatePartyNews(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =partyNewsService.UpdatePartyNews(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("修改成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("修改失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "分页查询党建新闻",notes = "")
    @PostMapping("/FindPartyNews")
    public Page FindPartyNews(@RequestBody Map map){
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(partyNewsService.Total(map));
        page.setItems(partyNewsService.FindPartyNews(map));
        return page;
    }

    @ApiOperation(value = "大屏_党建新闻",notes = "")
    @PostMapping("/SelectPartyNews")
    public PartyNews SelectPartyNews(@RequestBody Map map){
        return partyNewsService.SelectPartyNews(map);
    }
}
