package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Dw;

import java.util.List;
import java.util.Map;

public interface DwDao {
    int InsertDw(Map map);

    int UpdateDw(Map map);

    List<Dw> FindDw();

    Dw FindDwBycarId(Map map);
}
