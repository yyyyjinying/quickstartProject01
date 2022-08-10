package com.zjy.springbootmybatisplus.controller.until;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class R<T> {
    private boolean flag;
    private T data;
    private String message;

    public R(boolean flag) {
        this.flag = flag;
    }

    public R(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }
}
