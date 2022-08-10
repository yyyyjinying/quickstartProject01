package com.zjy.springbootmybatisplus.config.exception;


import com.zjy.springbootmybatisplus.controller.until.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalConfig {

    @ExceptionHandler
    public R exceptionHandle(Exception e){
        // 记录日期
        // 通知运维
        // 通知开发
        e.printStackTrace();

        return new R(false, "服务器故障，请稍后再试");
    }

}
