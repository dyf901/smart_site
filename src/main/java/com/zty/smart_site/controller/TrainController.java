package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.TestData;
import com.zty.smart_site.entity.Train;
import com.zty.smart_site.entity.TrainType;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.TrainService;
import com.zty.smart_site.service.TrainTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Api(description = "培训内容")
@RestController
@RequestMapping("train")
@CrossOrigin
public class TrainController {
    @Autowired
    private TrainTypeService trainTypeService;

    @Autowired
    private TrainService trainService;

    @ApiOperation(value = "增加培训内容" , notes = "传参:")
    @PostMapping("/InsertTrain")
    public boolean InsertTrain(@RequestBody Map map) {
        System.out.println(map);
        map.put("train_name" , map.get("commonality_name"));
        return trainService.InsertTrain(map) == 1;
    }

    @ApiOperation(value = "删除培训内容" , notes = "传参:")
    @PostMapping("/DeleteTrain")
    public boolean DeleteTrain(@RequestBody Map map) {
        return trainService.DeleteTrain(map) == 1;
    }

    @ApiOperation(value = "修改培训内容" , notes = "传参:")
    @PostMapping("/UpdateTrain")
    public boolean UpdateTrain(@RequestBody Map map) {
        return trainService.UpdateTrain(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询" , notes = "")
    @PostMapping("/FindTrain")
    public Page<Train> FindTrain(@RequestBody Map map) {
        Page<Train> page = new Page<Train>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(trainService.Total(map));
        page.setItems(trainService.FindTrain(map));
        return page;
    }

    @ApiOperation(value = "培训内容App" , notes = "")
    @PostMapping("/FindTrainAll")
    public JsonResult FindTrainAll(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(trainService.FindTrainAll(map));
        return jsonResult;
    }

    @ApiOperation(value = "菜单" , notes = "")
    @PostMapping("/Train_Menu")
    public List<TestData> FindByPositionId1(@RequestBody Map<String, Object> map) {

        List<TestData> testDataList = new ArrayList<>();
        List<Train> dataIns;

        int section_id = (int) map.get("section_id");
        List<Long> longs = trainTypeService.FindTrainTypeBySectionId(map);
        System.out.println("longs:" + longs);
        for (Long l : longs) {
            Train train1 = new Train();
            train1.setSection_id(section_id);
            int i = Math.toIntExact(l);
            train1.setType_id(i);

            TestData testData = new TestData();
            TrainType trainType = trainTypeService.FindTrainTypeById(l);
            testData.setId(i);
            testData.setType_name(trainType.getType_name());
            List<Long> longs1 = trainService.FindTrainByTypeId_S(train1);

            System.out.println("longs1:---------------" + l);

            System.out.println("asdasdasd");

            dataIns = new ArrayList<>();
            for (Long l1 : longs1) {


                Train train = trainService.FindTrainById(l1);
//                System.out.println("l1:"+l1);
                System.out.println("train:" + l1 + ":asd:" + train.toString());

                dataIns.add(train);


            }
            testData.setDataIn(dataIns);
            System.out.println("testData:" + testData);

            testDataList.add(testData);
        }

        System.out.println(testDataList.toString());
        System.out.println("testDataList" + testDataList);
        return testDataList;
    }

    @ApiOperation(value = "根据id查询培训内容" , notes = "传参:id(内容id)")
    @PostMapping("/FindTrainByIdX")
    public JsonResult FindTrainByIdX(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        Train train = trainService.FindTrainByIdX(map);
        if (train == null) {
            jsonResult.setCode(20006);
            return jsonResult;
        } else {
            jsonResult.setCode(200);
            jsonResult.setData(train);
            return jsonResult;
        }
    }
}
