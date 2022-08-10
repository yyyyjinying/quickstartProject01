package com.zjy.springboot_14_test;

import com.zjy.springboot_14_test.config.MsgConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

// properties 可以为测试添加临时属性配置
//@SpringBootTest(properties = {"test.prop=testValue01"}) // (properties = {})
// args属性可以为当前测试用例添加临时的命令行参数
//@SpringBootTest(args={"--test.prop=testValue02"}, properties={"test.prop=testValue01"})
// @Import 注解加载当前测试类专用的配置
@SpringBootTest
@Import(MsgConfig.class)
public class PropertiesAndArgsTest {

//    @Value("${test.prop}")
//    private String msg;
//
//    @Test
//    void testProperties(){
//        System.out.println(msg);
//
//    }
    @Autowired
    private String msg;

    @Autowired
    private String Zhao;

    @Test
    void testMsg(){
        System.out.println(msg);
        System.out.println(Zhao);
    }
}
