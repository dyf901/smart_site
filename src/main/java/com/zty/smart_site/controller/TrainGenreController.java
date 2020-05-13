package com.zty.smart_site.controller;

import com.zty.smart_site.entity.TrainGenre;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.TrainGenreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(description = "建造类型接口")
@RestController
@RequestMapping("traingenre")
@CrossOrigin
public class TrainGenreController {
    @Autowired
    private TrainGenreService trainGenreService;

    @ApiOperation(value = "增加培训类型" , notes = "传参:")
    @PostMapping("/InsertTrainGenre")
    public boolean InsertTrainGenre(@RequestBody Map map) {
        return trainGenreService.InsertTrainGenre(map) == 1;
    }

    @ApiOperation(value = "删除培训类型" , notes = "传参:")
    @PostMapping("/DeleteTrainGenre")
    public boolean DeleteTrainGenre(@RequestBody Map map) {
        return trainGenreService.DeleteTrainGenre(map) == 1;
    }

    @ApiOperation(value = "修改培训类型" , notes = "传参:")
    @PostMapping("/UpdateTrainGenre")
    public boolean UpdateTrainGenre(@RequestBody Map map) {
        return trainGenreService.UpdateTrainGenre(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询培训类型" , notes = "")
    @PostMapping("/FindTrainGenre")
    public Page<TrainGenre> FindTrainGenre(@RequestBody Map map) {
        Page<TrainGenre> page = new Page<TrainGenre>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(trainGenreService.Total());
        page.setItems(trainGenreService.FindTrainGenre(map));
        return page;
    }

    @ApiOperation(value = "下拉框查询培训类型" , notes = "")
    @PostMapping("/SelectTrainGenre")
    public List<TrainGenre> SelectTrainGenre(@RequestBody Map map) {
        return trainGenreService.SelectTrainGenre(map);
    }


    /*public Page Cbl(@RequestBody Map map) {
        String token = map.get("token").toString();
        User u = userDao.getUserByToken(token);
        Page p = new Page();
        p.setToken(token);
        List<Integer> l = userQxDao.getUq(u.getId());
        List<Page> lq = new ArrayList<>();
        for (int i : l) {
            if (qxDao.getQx(i).getLevel() == 1) {
                Page pa = new Page();
                pa.setToken(qxDao.getQx(i).getName());
                pa.setIcon(qxDao.getQx(i).getIcon());
                List<Qx> li = new ArrayList<>();
                for (int in : l) {
                    Map m = new HashMap();
                    m.put("level", qxDao.getQx(i).getId());
                    m.put("id", in);
                    li.addAll(qxDao.getQx3(m));
                }
                pa.setList(li);
                lq.add(pa);
            }
        }
        p.setList(lq);
        return p;
    }*/
}
