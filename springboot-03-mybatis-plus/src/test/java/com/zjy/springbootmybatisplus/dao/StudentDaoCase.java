package com.zjy.springbootmybatisplus.dao;

import com.zjy.springbootmybatisplus.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentDaoCase {

    @Autowired
    private StudentDao studentDao;

    @Test
    void add(){
        Student student = new Student();
        student.setName("a");
        student.setSex("女");
        studentDao.insert(student);
    }
}
