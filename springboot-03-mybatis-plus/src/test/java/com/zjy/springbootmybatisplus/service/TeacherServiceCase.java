package com.zjy.springbootmybatisplus.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zjy.springbootmybatisplus.domain.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TeacherServiceCase {

    @Autowired
    private TeacherService teacherService;

    @Test
    void getById(){
        System.out.println(teacherService.getById(9));
    }


    @Test
    void save(){
        Teacher teacher = new Teacher();
        teacher.setUsername("zjy02");
        teacher.setPwd("1234456");
       teacherService.save(teacher);
    }

    @Test
    void delById(){
        Boolean delete = teacherService.delete(813531145);
        System.out.println(delete);
    }

    @Test
    void update(){
        Teacher teacher = new Teacher();
        teacher.setId((long) 9);
        teacher.setUsername("mxxm");
        System.out.println(teacherService.update(teacher));
    }

    @Test
    void getAll(){
        List<Teacher> all = teacherService.getAll();
        System.out.println(all);
    }

    @Test
    void getPage(){
        IPage<Teacher> page = teacherService.getPage(1, 5);
        System.out.println(page.getRecords());
    }






}
