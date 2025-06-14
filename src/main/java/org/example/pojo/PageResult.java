package org.example.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

public class PageResult<T> {
    private long total;
    private List<T> rows;

    // 无参构造
    public PageResult() {
    }

    // 新增全参构造
    public PageResult(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    // getter和setter
    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
