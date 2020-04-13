package com.zty.smart_site.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zty.smart_site.entity.*;
import com.zty.smart_site.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Api(description = "测试")
@RestController
@RequestMapping("test")
@CrossOrigin
public class Test {
    @Autowired
    private PositionTitleService positionTitleService;

    @Autowired
    private TitleService titleService;

    @Autowired
    private TrainTypeService trainTypeService;

    @Autowired
    private TrainService trainService;

    @ApiOperation(value = "测试",notes = "")
    @GetMapping("/test")
    public String Test(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        System.out.println("当前时间：" + sdf.format(now));
        Date afterDate = new Date(now .getTime() + 300000);
        System.out.println(sdf.format(afterDate ));
        return "aaa";
    }

    @ApiOperation(value = "测试ww",notes = "")
    @PostMapping("/testww")
    public String Testww(@RequestBody Map map) throws ParseException {
        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd");
        String time= (String) map.get("time");
        Date date = format.parse(time);
        //日期转时间戳（毫秒）
        long times=date.getTime();
        System.out.print("Format To times:"+times);
        return "aaa";
    }


    @ApiOperation(value = "测试",notes = "")
    @PostMapping("/test1")
    public String FindByPositionId(@RequestBody Map map){
        List<Long> longs= positionTitleService.FindByPositionId(map);
        List list =new ArrayList();
        for (Long l:longs){
            Title title = titleService.FindById(l);
            list.add(title);
            System.out.println(title);
            }
            System.out.println(list);
            return "asd";
        }


    @ApiOperation(value = "测试",notes = "")
    @PostMapping("/test2")
    public List<TestData> FindByPositionId1(@RequestBody Map map){

        List<TestData> testDataList=new ArrayList<>();
        List<Train> dataIns=new ArrayList<>();

        int section_id= (int) map.get("section_id");
        List<Long> longs= trainTypeService.FindTrainTypeBySectionId(map);
        System.out.println("longs:"+longs);
        List list =new ArrayList();
        for (Long l:longs){
            Train train1= new Train();
            train1.setSection_id(section_id);
            int i= Math.toIntExact(l);
            train1.setType_id(i);

            TestData testData=new TestData();
            TrainType trainType=trainTypeService.FindTrainTypeById(l);
            testData.setId(i);
            testData.setType_name(trainType.getType_name());
            List<Long> longs1 = trainService.FindTrainByTypeId_S(train1);

            System.out.println("longs1:"+longs1);
            for (Long l1:longs1){

                System.out.println(l1);
                Train train = trainService.FindTrainById(l1);
                list.add(train);
                dataIns.add(train);
                System.out.println(train);
            }

            testData.setDataIn(dataIns);

            testDataList.add(testData);
        }
        System.out.println(testDataList.toString());
        System.out.println("testDataList"+testDataList);
        return testDataList;
    }

}
