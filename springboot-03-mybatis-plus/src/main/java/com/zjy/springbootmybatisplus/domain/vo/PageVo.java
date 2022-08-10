package com.zjy.springbootmybatisplus.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@AllArgsConstructor
public class PageVo<T> {
    private Long total;
    private Long curPage;
    private Long pageSize;
    private List<T> records;

    public PageVo() {
    }

    @Override
    public String toString() {
        return "PageVo{" +
                "total=" + total +
                ", curPage=" + curPage +
                ", pageSize=" + pageSize +
                ", records=" + records +
                '}';
    }
}
