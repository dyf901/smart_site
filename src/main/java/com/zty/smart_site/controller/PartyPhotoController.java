package com.zty.smart_site.controller;

import com.zty.smart_site.entity.ConstructionPhoto;
import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.PartyPhoto;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.ConstructionPhotoService;
import com.zty.smart_site.service.PartyPhotoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "党建相册接口")
@RestController
@RequestMapping("PartyPhoto")
@CrossOrigin
public class PartyPhotoController {
    @Autowired
    private PartyPhotoService PartyPhotoService;

    @ApiOperation(value = "增加党建相册",notes = "")
    @PostMapping("/InsertPartyPhoto")
    public JsonResult InsertPartyPhoto(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =PartyPhotoService.InsertPartyPhoto(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("增加成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "删除党建相册",notes = "")
    @PostMapping("/DeletePartyPhoto")
    public JsonResult DeletePartyPhoto(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =PartyPhotoService.DeletePartyPhoto(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("删除成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("删除失败!");
        }
        return jsonResult;
    }


    @ApiOperation(value = "修改党建相册",notes = "")
    @PostMapping("/UpdatePartyPhoto")
    public JsonResult UpdatePartyPhoto(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =PartyPhotoService.UpdatePartyPhoto(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("修改成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("修改失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "分页查询党建相册",notes = "")
    @PostMapping("/FindPartyPhoto")
    public Page FindPartyPhoto(@RequestBody Map map){
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(PartyPhotoService.Total(map));
        page.setItems(PartyPhotoService.FindPartyPhoto(map));
        return page;
    }

    @ApiOperation(value = "大屏_党建相册",notes = "")
    @PostMapping("/SelectPartyPhoto")
    public List<PartyPhoto> SelectPartyPhoto(@RequestBody Map map){
        return PartyPhotoService.SelectPartyPhoto(map);
    }
}
