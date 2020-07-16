package com.zty.smart_site.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zty.smart_site.entity.*;
import com.zty.smart_site.page.Tree;
import com.zty.smart_site.service.*;
import com.zty.smart_site.util.ExportWordUtils;
import com.zty.smart_site.util.MenuTreeUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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

    @Autowired
    private BehaviorRecordService behaviorRecordService;

    @Autowired
    private ProgressStaffingService progressStaffingService;


    @ApiOperation(value = "测试" , notes = "")
    @GetMapping("/test")
    public String Test() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        System.out.println("当前时间：" + sdf.format(now));
        Date afterDate = new Date(now.getTime() + 300000);
        System.out.println(sdf.format(afterDate));
        return "aaa";
    }

    @ApiOperation(value = "时间戳" , notes = "")
    @PostMapping("/testww")
    public String Testww(@RequestBody Map map) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String time = (String) map.get("time");
        Date date = format.parse(time);
        //日期转时间戳（毫秒）
        long times = date.getTime();
        System.out.print("Format To times:" + times);
        return "aaa";
    }


    @ApiOperation(value = "测试" , notes = "")
    @PostMapping("/test1")
    public String FindByPositionId(@RequestBody Map map) {
        List<Long> longs = positionTitleService.FindByPositionId(map);
        List list = new ArrayList();
        for (Long l : longs) {
            Title title = titleService.FindById(l);
            list.add(title);
            System.out.println(title);
        }
        System.out.println(list);
        return "asd";
    }


    @ApiOperation(value = "测试" , notes = "")
    @PostMapping("/test2")
    public List<TestData> FindByPositionId1(@RequestBody Map map) {

        List<TestData> testDataList = new ArrayList<>();
        List<Train> dataIns = new ArrayList<>();

        int section_id = (int) map.get("section_id");
        List<Long> longs = trainTypeService.FindTrainTypeBySectionId(map);
        System.out.println("longs:" + longs);
        List list = new ArrayList();
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

            System.out.println("longs1:" + longs1);
            for (Long l1 : longs1) {

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
        System.out.println("testDataList" + testDataList);
        return testDataList;
    }


    @ApiOperation(value = "导出excel" , notes = "")
    @GetMapping("/testE")
    public void downloadAllClassmate(HttpServletResponse response) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("信息表");

        Map map = new HashMap();
        map.put("staff_id" , 5);
        //List<Teacher> classmateList = teacherservice.teacherinfor();
        List<BehaviorRecord> list = behaviorRecordService.ceshi(map);
        String fileName = "userinf" + ".xls";//设置要导出的文件的名字
        //新增数据行，并且设置单元格数据

        int rowNum = 1;

        String[] headers = {"行为记录id" , "员工id" , "行为id" , "标段id" , "站点id" , "上传时间"};
        //headers表示excel表中第一行的表头

        HSSFRow row = sheet.createRow(0);
        //在excel表中添加表头

        for (int i = 0; i < headers.length; i++) {
            HSSFCell cell = row.createCell(i);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }

        //在表中存放查询到的数据放入对应的列
        for (BehaviorRecord behaviorRecord : list) {
            HSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell(0).setCellValue(behaviorRecord.getId());
            row1.createCell(1).setCellValue(behaviorRecord.getStaff_id());
            row1.createCell(2).setCellValue(behaviorRecord.getBehavior_id());
            row1.createCell(3).setCellValue(behaviorRecord.getSection_id());
            row1.createCell(4).setCellValue(behaviorRecord.getStation_id());
            row1.createCell(5).setCellValue(behaviorRecord.getUptime());
            rowNum++;
        }

        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition" , "attachment;filename=" + fileName);
        response.flushBuffer();
        workbook.write(response.getOutputStream());
    }

    @ApiOperation(value = "导出word" , notes = "")
    @PostMapping("/export")
    public void export(HttpServletRequest request, HttpServletResponse response, @RequestBody Map map) {
        /*Map<String,Object> params = new HashMap<>();
        params.put("title","这是标题");
        params.put("name","李四");*/
        //这里是我说的一行代码
        System.out.println("请求进来了-------------->");
        ExportWordUtils.exportWord("word/export.docx" , "F:/test" , "aaa.docx" , map, request, response);
        System.out.println("请求结束了-------------->");
    }


    @ApiOperation(value = "树形图" , notes = "")
    @PostMapping("/tree")
    public Object findPage() {

        Map<String, Object> returnMap = new HashMap<>();
        Map map = new HashMap();
        map.put("section_id" , 2);
        List<ProgressStaffing> lists = progressStaffingService.FindProgressStaffingBySectionId(map);//所有数据未转化成树结构

        MenuTreeUtil menuTree = new MenuTreeUtil();//定义工具类
        List<Tree> lt = new ArrayList<Tree>();//定义实体类
        for (int i = 0; i < lists.size(); i++) {//遍历获取数据
            Tree t = new Tree(); //转化成对象
            t.setId(lists.get(i).getId());//将数据赋给实体类
            t.setLabel(lists.get(i).getProgress_name());
            t.setFatherid(lists.get(i).getFatherid());
            t.setIsparent(lists.get(i).getIsparent());
            t.setDuration(lists.get(i).getDuration());
            t.setStart_time(lists.get(i).getStart_time());
            t.setEnd_time(lists.get(i).getEnd_time());
            t.setPractical_start(lists.get(i).getPractical_start());
            t.setPractical_end(lists.get(i).getPractical_end());
            lt.add(t);
        }
        System.out.println(lt);
        List<Object> menuList = menuTree.menuList(lt);//所有数据转化成树结构
        returnMap.put("list" , menuList);
        return returnMap;
    }
}
