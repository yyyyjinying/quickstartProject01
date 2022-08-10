package com.zjy.springboot_14_test.dao;

import org.springframework.beans.factory.annotation.Value;


public class Dog {
    @Value("1")
    private Long id;

    @Value("zhao")
    private String name;
}
