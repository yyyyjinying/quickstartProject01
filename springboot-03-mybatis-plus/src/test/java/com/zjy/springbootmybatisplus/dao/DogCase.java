package com.zjy.springbootmybatisplus.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class DogCase {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void testapplication() {
        Object dog = applicationContext.getBean("dog");
        System.out.println(dog);

    }
}
