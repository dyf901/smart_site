package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.Qualityshow;
import com.zty.smart_site.entity.Riskshow;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Api(description = "质量隐患记录接口")
@RestController
@RequestMapping("qualityshow")
@CrossOrigin
public class QualityshowController {
    @Autowired
    private QualityshowService qualityshowService;

    @Autowired
    private StaffService staffService;//人员

    @Autowired
    private AnintegralService anintegralService;//积分明细

    @Autowired
    private MessageService messageService;//我的信息

    @Autowired
    private QualityrectifyService qualityrectifyService;//整改通知单

    @ApiOperation(value = "增加质量隐患记录" , notes = "传参:`title`(标题),`quality_id`(安全隐患类id,安全隐患类型下拉框), `staff_name`(员工姓名,登录时返回), `section_id`(标段id), `station_id`(站点id,下拉框查询),`sub_id`(分包单位id) `description`(详细说明), `url1`(图片地址数组), `staff_id(劳务人员id,管理人员不需要传,登录返回)`,  `process_id`(工序id,下拉框返回)")
    @PostMapping("/InsertQualityshow")
    public JsonResult InsertQualityshow(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        System.out.println(map);
        /*List list = (List) map.get("url1");
        System.out.println("list:"+list);
        //String url = StringUtils.join(list, ",");
        String url=list.toString();
        System.out.println(url);
        map.put("url",map.get("url1"));*/
        int i = qualityshowService.InsertQualityshow(map);
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

    @ApiOperation(value = "删除质量隐患记录" , notes = "测试数据:{\"id\":1}")
    @PostMapping("/DeleteQualityshow")
    public boolean DeleteQualityshow(@RequestBody Map map) {
        return qualityshowService.DeleteQualityshow(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询安全隐患记录" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":1}")
    @PostMapping("/FindQualityshow")
    public Page<Qualityshow> FindQualityshow(@RequestBody Map map) {
        Page<Qualityshow> page = new Page<Qualityshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(qualityshowService.Total(map));
        page.setItems(qualityshowService.FindQualityshow(map));
        return page;
    }

    @ApiOperation(value = "分页模糊查询安全隐患记录_检查记录" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":2,\"station_id\":1}")
    @PostMapping("/FindQualityshow_JCJL")
    public Page<Qualityshow> FindQualityshow_JCJL(@RequestBody Map map) {
        Page<Qualityshow> page = new Page<Qualityshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(qualityshowService.Total_JCJL(map));
        page.setItems(qualityshowService.FindQualityshow_JCJL(map));
        return page;
    }

    @ApiOperation(value = "分页模糊查询安全隐患记录_无效记录" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":2,\"station_id\":1}")
    @PostMapping("/FindQualityshow_WXJL")
    public Page<Qualityshow> FindQualityshow_WXJL(@RequestBody Map map) {
        Page<Qualityshow> page = new Page<Qualityshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(qualityshowService.Total_WXJL(map));
        page.setItems(qualityshowService.FindQualityshow_WXJL(map));
        return page;
    }

    @ApiOperation(value = "分页模糊查询安全隐患记录_待整改" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":2,\"station_id\":1}")
    @PostMapping("/FindQualityshow_DZG")
    public Page<Qualityshow> FindQualityshow_DZG(@RequestBody Map map) {
        Page<Qualityshow> page = new Page<Qualityshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(qualityshowService.Total_DZG(map));
        page.setItems(qualityshowService.FindQualityshow_DZG(map));
        return page;
    }

    @ApiOperation(value = "分页模糊查询安全隐患记录_整改复查" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":2,\"station_id\":1}")
    @PostMapping("/FindQualityshow_ZGFC")
    public Page<Qualityshow> FindQualityshow_ZGFC(@RequestBody Map map) {
        Page<Qualityshow> page = new Page<Qualityshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(qualityshowService.Total_ZGFC(map));
        page.setItems(qualityshowService.FindQualityshow_ZGFC(map));
        return page;
    }

    @ApiOperation(value = "分页模糊查询隐患记录_检查记录_PC" , notes = "")
    @PostMapping("/FindQualityshow_JCJL_PC")
    public Page<Qualityshow> FindQualityshow_JCJL_PC(@RequestBody Map map) {
        Page<Qualityshow> page = new Page<Qualityshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(qualityshowService.Total_JCJL_PC(map));
        page.setItems(qualityshowService.FindQualityshow_JCJL_PC(map));
        return page;
    }

    @ApiOperation(value = "分页模糊查询隐患记录_待整改_PC" , notes = "")
    @PostMapping("/FindQualityshow_DZG_PC")
    public Page<Qualityshow> FindQualityshow_DZG_PC(@RequestBody Map map) {
        Page<Qualityshow> page = new Page<Qualityshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(qualityshowService.Total_DGZ_PC(map));
        page.setItems(qualityshowService.FindQualityshow_DZG_PC(map));
        return page;
    }

    @ApiOperation(value = "分页模糊查询隐患记录_已整改_PC" , notes = "")
    @PostMapping("/FindQualityshow_YZG_PC")
    public Page<Qualityshow> FindQualityshow_YZG_PC(@RequestBody Map map) {
        Page<Qualityshow> page = new Page<Qualityshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(qualityshowService.Total_YZG_PC(map));
        page.setItems(qualityshowService.FindQualityshow_YZG_PC(map));
        return page;
    }

    @ApiOperation(value = "分页模糊查询隐患记录_整改待验_PC" , notes = "")
    @PostMapping("/FindQualityshow_ZGDY_PC")
    public Page<Qualityshow> FindQualityshow_ZGDY_PC(@RequestBody Map map) {
        Page<Qualityshow> page = new Page<Qualityshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(qualityshowService.Total_ZGDY_PC(map));
        page.setItems(qualityshowService.FindQualityshow_ZGDY_PC(map));
        return page;
    }

    @ApiOperation(value = "审核质量隐患记录" , notes = "传参:id(隐患数据id,数据类型:int),integral(积分,数据类型:String),state(有效/无效,数据类型:String),staff_id(员工id安全隐患记录返回的数据,数据类型:int)")
    @PostMapping("/UpdateActive")
    public JsonResult UpdateActive(@RequestBody Map map) throws ParseException {
        JsonResult jsonResult = new JsonResult();
        if (map.get("state").equals("有效")) {
            int i = qualityshowService.UpdateActiveY(map);
            Qualityshow qualityshow = qualityshowService.FindQualityshowById(map);//根据id查询安全隐患记录
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date currdate = format.parse(qualityshow.getUptime());
            System.out.println("现在的日期是：" + currdate);
            Calendar ca = Calendar.getInstance();
            ca.add(Calendar.DATE, 3);// num为增加的天数，可以改变的
            currdate = ca.getTime();
            String enddate = format.format(currdate);
            System.out.println("增加天数以后的日期：" + enddate);
            map.put("plan_time" , enddate);
            qualityshowService.UpdatePlanTime(map);//修改安全隐患计划整改时间

            if (i == 1) {
                Date now = new Date();
                staffService.UpdateStaffHistory_integral(map);//修改历史积分
                staffService.UpdateStaffEnd_integralJ(map);//修改剩余积分
                map.put("content" , "安全隐患上传");
                anintegralService.InsertAnintegral(map);//生成积分明细
                map.put("station_id" , qualityshow.getStation_id());
                map.put("uptime" , qualityshow.getUptime());
                map.put("noC" , System.currentTimeMillis());


                messageService.InsertMessage(map);
                Qualityshow qualityshow1 = qualityshowService.FindQualityshowById(map);
                System.out.println(qualityshow1);
                map.put("title" , qualityshow1.getTitle());
                map.put("section_id" , qualityshow1.getSection_id());
                map.put("station_id" , qualityshow1.getStation_id());
                map.put("sub_id" , qualityshow1.getSub_id());
                map.put("process_id" , qualityshow1.getProcess_id());
                map.put("staff_name" , qualityshow1.getStaff_name());
                map.put("up_time" , qualityshow1.getUptime());
                map.put("plan_time" , qualityshow1.getPlan_time());
                map.put("description" , qualityshow1.getDescription());
                map.put("responsible" , qualityshow1.getResponsible());
                map.put("qualityshow_id" , qualityshow1.getId());
                qualityrectifyService.InsertQualityrectify(map);//增加整改通知单信息
                jsonResult.setCode(200);
                jsonResult.setMessage("审核成功!");
                return jsonResult;
            } else {
                jsonResult.setCode(20006);
                jsonResult.setMessage("审核失败!");
                return jsonResult;
            }
        } else {
            int i = qualityshowService.UpdateActiveW(map);
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
        Qualityshow qualityshow = qualityshowService.FindQualityshowById(map);
        System.out.println(qualityshow);
        // 获取当前时间d
        Date date = new Date();
        //如果想比较日期则写成"yyyy-MM-dd"就可以了
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //将字符串形式的时间转化为Date类型的时间
        Date a = sdf.parse(qualityshow.getPlan_time());
        Date b = sdf.parse(sdf.format(date));
        if (a.getTime() - b.getTime() >= 0) {
            int i = qualityshowService.UpdateZgUrl(map);
            if (i == 1) {
                qualityshowService.UpdateActiveYZG(map);
                jsonResult.setCode(200);
                jsonResult.setMessage("上报成功!");
                return jsonResult;
            } else {
                jsonResult.setCode(20006);
                jsonResult.setMessage("信息错误,上报失败!");
                return jsonResult;
            }
        } else {
            qualityshowService.UpdateActiveCQWZG(map);
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
            int i = qualityshowService.UpdateStatusH(map);
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
            int i = qualityshowService.UpdateStatusB(map);
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
