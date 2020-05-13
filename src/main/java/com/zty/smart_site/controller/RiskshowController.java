package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.Riskshow;
import com.zty.smart_site.page.Page;

import com.zty.smart_site.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.time.OffsetDateTime.now;

@Api(description = "安全隐患记录接口")
@RestController
@RequestMapping("riskshow")
@CrossOrigin
public class RiskshowController {
    @Autowired
    private RiskshowService riskshowService;//安全隐患

    @Autowired
    private StaffService staffService;//人员

    @Autowired
    private AnintegralService anintegralService;//积分明细

    @Autowired
    private MessageService messageService;//我的信息

    @Autowired
    private RiskrectifyService riskrectifyService;//整改通知单

    @ApiOperation(value = "增加安全隐患记录" , notes = "传参:`title`(标题),`risk_id`(安全隐患类id,安全隐患类型下拉框), `staff_name`(员工姓名,登录时返回), `section_id`(标段id), `station_id`(站点id,下拉框查询),`sub_id`(分包单位id) `description`(详细说明), `url1`(图片地址数组), `staff_id(劳务人员id,管理人员不需要传,登录返回)`,  `process_id`(工序id,下拉框返回)")
    @PostMapping("/InsertRiskshow")
    public JsonResult InsertRiskshow(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        System.out.println(map);
        /*List list = (List) map.get("url1");
        System.out.println("list:"+list);
        //String url = StringUtils.join(list, ",");
        String url=list.toString();
        System.out.println(url);
        map.put("url",url);*/
        /*String url= (String) map.get("url1");
        map.put("url",url);*/
        int i = riskshowService.InsertRiskshow(map);
        if (i == 1) {
            jsonResult.setMessage("增加成功!");
            jsonResult.setCode(200);
            return jsonResult;
        } else {
            jsonResult.setMessage("添加失败!");
            jsonResult.setCode(20006);
            return jsonResult;
        }
    }

    @ApiOperation(value = "删除安全隐患记录" , notes = "测试数据:{\"id\":1}")
    @PostMapping("/DeleteRiskshow")
    public boolean DeleteRiskshow(@RequestBody Map map) {
        return riskshowService.DeleteRiskshow(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询安全隐患记录" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":1}")
    @PostMapping("/FindRiskshow")
    public Page<Riskshow> FindRiskshow(@RequestBody Map map) {
        Page<Riskshow> page = new Page<Riskshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(riskshowService.Total(map));
        page.setItems(riskshowService.FindRiskshow(map));
        return page;
    }

    @ApiOperation(value = "分页模糊查询安全隐患记录_检查记录" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":2,\"station_id\":1}")
    @PostMapping("/FindRiskshow_JCJL")
    public Page<Riskshow> FindRiskshow_JCJL(@RequestBody Map map) {
        Page<Riskshow> page = new Page<Riskshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(riskshowService.Total_JCJL(map));
        page.setItems(riskshowService.FindRiskshow_JCJL(map));
        return page;
    }

    @ApiOperation(value = "分页模糊查询安全隐患记录_无效记录" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":2,\"station_id\":1}")
    @PostMapping("/FindRiskshow_WXJL")
    public Page<Riskshow> FindRiskshow_WXJL(@RequestBody Map map) {
        Page<Riskshow> page = new Page<Riskshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(riskshowService.Total_WXJL(map));
        page.setItems(riskshowService.FindRiskshow_WXJL(map));
        return page;
    }

    @ApiOperation(value = "分页模糊查询安全隐患记录_待整改" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":2,\"station_id\":1}")
    @PostMapping("/FindRiskshow_DZG")
    public Page<Riskshow> FindRiskshow_DZG(@RequestBody Map map) {
        Page<Riskshow> page = new Page<Riskshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(riskshowService.Total_DZG(map));
        page.setItems(riskshowService.FindRiskshow_DZG(map));
        return page;
    }

    @ApiOperation(value = "分页模糊查询安全隐患记录_整改复查" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":2,\"station_id\":1}")
    @PostMapping("/FindRiskshow_ZGFC")
    public Page<Riskshow> FindRiskshow_ZGFC(@RequestBody Map map) {
        Page<Riskshow> page = new Page<Riskshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(riskshowService.Total_ZGFC(map));
        page.setItems(riskshowService.FindRiskshow_ZGFC(map));
        return page;
    }

    @ApiOperation(value = "分页模糊查询隐患记录_检查记录_PC" , notes = "")
    @PostMapping("/FindRiskshow_JCJL_PC")
    public Page<Riskshow> FindRiskshow_JCJL_PC(@RequestBody Map map) {
        Page<Riskshow> page = new Page<Riskshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(riskshowService.Total_JCJL_PC(map));
        page.setItems(riskshowService.FindRiskshow_JCJL_PC(map));
        return page;
    }

    @ApiOperation(value = "分页模糊查询隐患记录_待整改_PC" , notes = "")
    @PostMapping("/FindRiskshow_DZG_PC")
    public Page<Riskshow> FindRiskshow_DZG_PC(@RequestBody Map map) {
        Page<Riskshow> page = new Page<Riskshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(riskshowService.Total_DGZ_PC(map));
        page.setItems(riskshowService.FindRiskshow_DZG_PC(map));
        return page;
    }

    @ApiOperation(value = "分页模糊查询隐患记录_已整改_PC" , notes = "")
    @PostMapping("/FindRiskshow_YZG_PC")
    public Page<Riskshow> FindRiskshow_YZG_PC(@RequestBody Map map) {
        Page<Riskshow> page = new Page<Riskshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(riskshowService.Total_YZG_PC(map));
        page.setItems(riskshowService.FindRiskshow_YZG_PC(map));
        return page;
    }

    @ApiOperation(value = "分页模糊查询隐患记录_整改待验_PC" , notes = "")
    @PostMapping("/FindRiskshow_ZGDY_PC")
    public Page<Riskshow> FindRiskshow_ZGDY_PC(@RequestBody Map map) {
        Page<Riskshow> page = new Page<Riskshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(riskshowService.Total_ZGDY_PC(map));
        page.setItems(riskshowService.FindRiskshow_ZGDY_PC(map));
        return page;
    }

    @ApiOperation(value = "审核安全隐患记录" , notes = "传参:id(隐患数据id,数据类型:int),integral(积分,数据类型:String),state(有效/无效,数据类型:String),staff_id(员工id安全隐患记录返回的数据,数据类型:int)")
    @PostMapping("/UpdateActive")
    public JsonResult UpdateActive(@RequestBody Map map) throws ParseException {
        JsonResult jsonResult = new JsonResult();
        if (map.get("state").equals("有效")) {
            int i = riskshowService.UpdateActiveY(map);
            Riskshow riskshow = riskshowService.FindRiskshowById(map);//根据id查询安全隐患记录
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date currdate = format.parse(riskshow.getUptime());
            System.out.println("现在的日期是：" + currdate);
            Calendar ca = Calendar.getInstance();
            ca.add(Calendar.DATE, 3);// num为增加的天数，可以改变的
            currdate = ca.getTime();
            String enddate = format.format(currdate);
            System.out.println("增加天数以后的日期：" + enddate);
            map.put("plan_time" , enddate);
            riskshowService.UpdatePlanTime(map);//修改安全隐患计划整改时间

            if (i == 1) {
                Date now = new Date();
                staffService.UpdateStaffHistory_integral(map);//修改历史积分
                staffService.UpdateStaffEnd_integralJ(map);//修改剩余积分
                map.put("content" , "安全隐患上传");
                anintegralService.InsertAnintegral(map);//生成积分明细
                map.put("station_id" , riskshow.getStation_id());
                map.put("uptime" , riskshow.getUptime());
                map.put("noC" , System.currentTimeMillis());


                messageService.InsertMessage(map);
                Riskshow riskshow1 = riskshowService.FindRiskshowById(map);
                System.out.println(riskshow1);
                map.put("title" , riskshow1.getTitle());
                map.put("section_id" , riskshow1.getSection_id());
                map.put("station_id" , riskshow1.getStation_id());
                map.put("sub_id" , riskshow1.getSub_id());
                map.put("process_id" , riskshow1.getProcess_id());
                map.put("staff_name" , riskshow1.getStaff_name());
                map.put("up_time" , riskshow1.getUptime());
                map.put("plan_time" , riskshow1.getPlan_time());
                map.put("description" , riskshow1.getDescription());
                map.put("responsible" , riskshow1.getResponsible());
                map.put("riskshow_id" , riskshow1.getId());
                riskrectifyService.InsertRiskrectify(map);//增加整改通知单信息
                jsonResult.setCode(200);
                jsonResult.setMessage("审核成功!");
                return jsonResult;
            } else {
                jsonResult.setCode(20006);
                jsonResult.setMessage("审核失败!");
                return jsonResult;
            }
        } else {
            int i = riskshowService.UpdateActiveW(map);
            if (i == 1) {
                jsonResult.setCode(200);
                jsonResult.setMessage("审核成功!");
                return jsonResult;
            } else {
                jsonResult.setCode(20006);
                jsonResult.setMessage("审核失败!");
                return jsonResult;
            }
        }
    }

    @ApiOperation(value = "整改上报" , notes = "传参:id(安全隐患id),zg_url1(地址数组),zg_description(整改说明)")
    @PostMapping("/UpdateZgUrl")
    public JsonResult UpdateZgUrl(@RequestBody Map map) throws Exception {
        JsonResult jsonResult = new JsonResult();
        System.out.println(map);
        String qq = (String) map.get("zg_url1");
        //System.out.println("list:"+list);
        //String url = StringUtils.join(list, ",");
        //String url=list.toString();
        //System.out.println(url);
        map.put("zg_url" , qq);
        Riskshow riskshow = riskshowService.FindRiskshowById(map);
        System.out.println(riskshow);
        // 获取当前时间d
        Date date = new Date();
        //如果想比较日期则写成"yyyy-MM-dd"就可以了
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //将字符串形式的时间转化为Date类型的时间
        Date a = sdf.parse(riskshow.getPlan_time());
        Date b = sdf.parse(sdf.format(date));
        if (a.getTime() - b.getTime() >= 0) {
            int i = riskshowService.UpdateZgUrl(map);
            if (i == 1) {
                riskshowService.UpdateActiveYZG(map);
                jsonResult.setCode(200);
                jsonResult.setMessage("上报成功!");
                return jsonResult;
            } else {
                jsonResult.setCode(20006);
                jsonResult.setMessage("信息错误,上报失败!");
                return jsonResult;
            }
        } else {
            riskshowService.UpdateActiveCQWZG(map);
            jsonResult.setCode(20006);
            jsonResult.setMessage("超过整改日期,上报失败!");
            return jsonResult;
        }
    }

    @ApiOperation(value = "整改复查" , notes = "传参:传参:id(隐患数据id,数据类型:int),status(合格/不合效,数据类型:String),fc_description(整改描述)")
    @PostMapping("/UpdateStatus")
    public JsonResult UpdateStatus(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        if (map.get("status").equals("合格")) {
            int i = riskshowService.UpdateStatusH(map);
            if (i == 1) {
                jsonResult.setCode(200);
                jsonResult.setMessage("审核成功!");
                return jsonResult;
            } else {
                jsonResult.setCode(20006);
                jsonResult.setMessage("审核失败!");
                return jsonResult;
            }
        } else {
            int i = riskshowService.UpdateStatusB(map);
            if (i == 1) {
                jsonResult.setCode(200);
                jsonResult.setMessage("审核成功!");
                return jsonResult;
            } else {
                jsonResult.setCode(20006);
                jsonResult.setMessage("审核失败!");
                return jsonResult;
            }
        }
    }
}
