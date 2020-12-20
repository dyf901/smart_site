package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.PartyPerson;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.PartyPersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "党建人员信息接口")
@RestController
@RequestMapping("PartyPerson")
@CrossOrigin
public class PartyPersonController {
    @Autowired
    private PartyPersonService partyPersonService;

    @ApiOperation(value = "增加党建人员信息",notes = "")
    @PostMapping("/InsertPartyPerson")
    public JsonResult InsertPartyPerson(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =partyPersonService.InsertPartyPerson(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("增加成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "删除党建人员信息",notes = "")
    @PostMapping("/DeletePartyPerson")
    public JsonResult DeletePartyPerson(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =partyPersonService.DeletePartyPerson(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("删除成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("删除失败!");
        }
        return jsonResult;
    }


    @ApiOperation(value = "修改党建人员信息",notes = "")
    @PostMapping("/UpdatePartyPerson")
    public JsonResult UpdatePartyPerson(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =partyPersonService.UpdatePartyPerson(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("修改成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("修改失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "分页查询党建人员信息",notes = "")
    @PostMapping("/FindPartyPerson")
    public Page FindPartyPerson(@RequestBody Map map){
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(partyPersonService.Total(map));
        page.setItems(partyPersonService.FindPartyPerson(map));
        return page;
    }

    @ApiOperation(value = "大屏_党建人员信息",notes = "")
    @PostMapping("/SelectPartyPerson")
    public List<PartyPerson> SelectPartyPerson(@RequestBody Map map){
        return partyPersonService.SelectPartyPerson(map);
    }

    @ApiOperation(value = "大屏_学习强国排行榜",notes = "")
    @PostMapping("/SelectPartyPersonByIntegral")
    public List<PartyPerson> SelectPartyPersonByIntegral(@RequestBody Map map){
        return partyPersonService.SelectPartyPersonByIntegral(map);
    }

    @ApiOperation(value = "项目部成员-政治面貌",notes = "")
    @PostMapping("/CountPartyPersonByState")
    public List<PartyPerson> CountPartyPersonByState(@RequestBody Map map){
        return partyPersonService.CountPartyPersonByState(map);
    }

    @ApiOperation(value = "支部党员构成-学历",notes = "")
    @PostMapping("/CountPartyPersonByEducation")
    public List<PartyPerson> CountPartyPersonByEducation(@RequestBody Map map){
        return partyPersonService.CountPartyPersonByEducation(map);
    }
}
