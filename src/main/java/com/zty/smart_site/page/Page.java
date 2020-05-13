package com.zty.smart_site.page;

import java.util.List;

public class Page<T> {
    List<T> items;
    private int pageNo;
    private int pageSize;
    private Long total;
    private int end_integral;

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public int getEnd_integral() {
        return end_integral;
    }

    public void setEnd_integral(int end_integral) {
        this.end_integral = end_integral;
    }
}
