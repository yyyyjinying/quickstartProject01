package com.zjy.springbootmybatisplus.dao;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjy.springbootmybatisplus.domain.Teacher;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class TeacherDaoCase {

    @Autowired
    private TeacherDao teacherDao;

    @Test
    void selectTeacherList(){
        List<Teacher> teachers = teacherDao.selectList(null);
        System.out.println(teachers);
    }

    @Test
    void delById(){
        int i = teacherDao.deleteById(813531141);
        System.out.println(i);
    }

    @Test
    void add(){
        Teacher teacher = new Teacher();
        teacher.setUsername("zjy01");
        teacher.setPwd("1234456");
        int insert = teacherDao.insert(teacher);
        System.out.println(insert);
        System.out.println(teacher.getId());
    }

    @Test
    void update(){
        Teacher teacher = new Teacher();
        teacher.setId((long) 9);
        teacher.setUsername("mm");
        teacherDao.updateById(teacher);
    }


    @Test
    void getPageList(){
        IPage page = new Page(1, 5);
        teacherDao.selectPage(page, null);

        List records = page.getRecords();
        System.out.println(records);

        long current = page.getCurrent();
        System.out.println(current);

        long pages = page.getPages();
        System.out.println(pages);

        long size = page.getSize();
        System.out.println(size);

        long total = page.getTotal();
        System.out.println(total);


    }


    @Test
    void querySelect(){
        QueryWrapper<Teacher> query = new QueryWrapper<>();
        query.like("username", "赵飞");
        teacherDao.selectList(query);
    }

    @Test
    void querySelect02(){
        String username = "赵飞";
        LambdaQueryWrapper<Teacher> query = new LambdaQueryWrapper<>();
        query.like(Strings.isNotEmpty(username), Teacher::getUsername, username);
        teacherDao.selectList(query);
    }
}
