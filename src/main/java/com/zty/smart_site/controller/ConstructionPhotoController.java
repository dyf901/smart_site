package com.zty.smart_site.controller;

import com.zty.smart_site.entity.ConstructionPhoto;
import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.ConstructionPhotoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "施工相册接口")
@RestController
@RequestMapping("ConstructionPhoto")
@CrossOrigin
public class ConstructionPhotoController {
    @Autowired
    private ConstructionPhotoService constructionPhotoService;

    @ApiOperation(value = "增加施工相册",notes = "")
    @PostMapping("/InsertConstructionPhoto")
    public JsonResult InsertConstructionPhoto(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =constructionPhotoService.InsertConstructionPhoto(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("增加成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "删除施工相册",notes = "")
    @PostMapping("/DeleteConstructionPhoto")
    public JsonResult DeleteConstructionPhoto(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =constructionPhotoService.DeleteConstructionPhoto(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("删除成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("删除失败!");
        }
        return jsonResult;
    }


    @ApiOperation(value = "修改施工相册",notes = "")
    @PostMapping("/UpdateConstructionPhoto")
    public JsonResult UpdateConstructionPhoto(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =constructionPhotoService.UpdateConstructionPhoto(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("修改成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("修改失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "分页查询施工相册信息",notes = "")
    @PostMapping("/FindConstructionPhoto")
    public Page FindConstructionPhoto(@RequestBody Map map){
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(constructionPhotoService.Total(map));
        page.setItems(constructionPhotoService.FindConstructionPhoto(map));
        return page;
    }

    @ApiOperation(value = "大屏_施工相册",notes = "")
    @PostMapping("/SelectConstructionPhoto")
    public List<ConstructionPhoto> SelectConstructionPhoto(@RequestBody Map map){
        return constructionPhotoService.SelectConstructionPhoto(map);
    }
}
