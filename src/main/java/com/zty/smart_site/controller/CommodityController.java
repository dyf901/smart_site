package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Commodity;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.CommodityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "商品接口")
@RestController
@RequestMapping("commodity")
@CrossOrigin
public class CommodityController {
    @Autowired
    private CommodityService commodityService;//商品

    @ApiOperation(value = "增加商品信息" , notes = "测试数据:{\"section_id\":1,\"commodity_name\":\"彩色简约纯棉洗脸毛巾\",\"commodity_price\":100,\"commodity_img\":\"彩色简约纯棉洗脸毛巾.png\"}")
    @PostMapping("/InsertCommodity")
    public boolean InsertCommodity(@RequestBody Map map) {
        return commodityService.InsertCommodity(map) == 1;
    }

    @ApiOperation(value = "删除商品信息" , notes = "测试数据:{\"id\":1}")
    @PostMapping("/DeleteCommodity")
    public boolean DeleteCommodity(@RequestBody Map map) {
        return commodityService.DeleteCommodity(map) == 1;
    }

    @ApiOperation(value = "修改商品信息" , notes = "测试数据:{\"id\":1,\"commodity_name\":\"彩色简约纯棉洗脸毛巾\",\"commodity_price\":101,\"commodity_img\":\"彩色简约纯棉洗脸毛巾.png\"}")
    @PostMapping("/UpdateCommodity")
    public boolean UpdateCommodity(@RequestBody Map map) {
        return commodityService.UpdateCommodity(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询商品信息" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":2}")
    @PostMapping("/FindCommodity")
    public Page<Commodity> FindCommodity(@RequestBody Map map) {
        Page<Commodity> page = new Page<Commodity>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(commodityService.Total(map));
        page.setItems(commodityService.FindCommodity(map));
        return page;
    }
}
