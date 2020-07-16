package com.zty.smart_site.util;

import com.zty.smart_site.page.Tree;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MenuTreeUtil {

    public static Map<String, Object> mapArray = new LinkedHashMap<String, Object>();
    public List<Tree> menuCommon;
    public List<Object> list = new ArrayList<Object>();

    public List<Object> menuList(List<Tree> menu) { //controller层调用的方法   ，并将数据以list的形式返回
        this.menuCommon = menu;
        for (Tree x : menu) {
            Map<String, Object> mapArr = new LinkedHashMap<String, Object>();
            if (x.getIsparent().equals("true") && x.getFatherid() == (0)) { //判断是否为父极
                mapArr.put("id" , x.getId());
                mapArr.put("label" , x.getLabel());
                mapArr.put("fatherid" , x.getFatherid());
                mapArr.put("isparent" , x.getIsparent());
                mapArr.put("duration" , x.getDuration());
                mapArr.put("start_time" , x.getStart_time());
                mapArr.put("end_time" , x.getEnd_time());
                mapArr.put("practical_start" , x.getPractical_start());
                mapArr.put("practical_end" , x.getPractical_end());

                mapArr.put("child" , menuChild(x.getId()));  //去子集查找遍历
                list.add(mapArr);
            }
        }
        return list;
    }

    public List<?> menuChild(int id) { //子集查找遍历
        List<Object> lists = new ArrayList<Object>();
        for (Tree a : menuCommon) {
            Map<String, Object> childArray = new LinkedHashMap<String, Object>();
            if (a.getFatherid() == (id)) {
                childArray.put("id" , a.getId());
                childArray.put("label" , a.getLabel());
                childArray.put("fatherid" , a.getFatherid());
                childArray.put("isparent" , a.getIsparent());
                childArray.put("duration" , a.getDuration());
                childArray.put("start_time" , a.getStart_time());
                childArray.put("end_time" , a.getEnd_time());
                childArray.put("practical_start" , a.getPractical_start());
                childArray.put("practical_end" , a.getPractical_end());
                childArray.put("child" , menuChild(a.getId()));
                lists.add(childArray);
            }
        }
        return lists;
    }

}
