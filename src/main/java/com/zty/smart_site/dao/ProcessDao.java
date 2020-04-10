package com.zty.smart_site.dao;

import java.util.List;
import java.util.Map;

public interface ProcessDao {
    //增加工序
    int InsertProcess(Map map);

    //删除工序
    int DeleteProcess(Map map);

    //修改工序
    int UpdateProcess(Map map);

    //分页模糊查询工序
    List<Process> FindProcess(Map map);

    //统计总数
    long Total(Map map);

    //下拉框查询工序
    List<Process> SelectProcess(Map map);
}
