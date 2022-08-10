package com.zjy.springbootmybatisplus.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjy.springbootmybatisplus.domain.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TeacherServiceTest {
    @Autowired
    private ITeacherService iTeacherService;

    @Test
    void getById(){
        System.out.println(iTeacherService.getById(9));
    }


    @Test
    void save(){
        Teacher teacher = new Teacher();
        teacher.setUsername("zjy02");
        teacher.setPwd("1234456");
        iTeacherService.save(teacher);
    }

    @Test
    void delById(){
        Boolean delete = iTeacherService.removeById(813531144);
        System.out.println(delete);
    }

    @Test
    void update(){
        Teacher teacher = new Teacher();
        teacher.setId((long) 9);
        teacher.setUsername("mx0xm");
        iTeacherService.updateById(teacher);
    }

    @Test
    void getAll(){
        List<Teacher> all = iTeacherService.list();
        System.out.println(all);
    }

    @Test
    void getPage(){
        IPage<Teacher> page = new Page<>(1, 5);
        IPage<Teacher> page1 = iTeacherService.page(page);
        System.out.println(page1.getRecords());
        System.out.println(page1.getCurrent());
        System.out.println(page1.getTotal());
        System.out.println(page1.getSize());
    }

}
