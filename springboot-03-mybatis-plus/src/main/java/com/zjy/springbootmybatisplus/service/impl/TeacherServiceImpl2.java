package com.zjy.springbootmybatisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjy.springbootmybatisplus.dao.TeacherDao;
import com.zjy.springbootmybatisplus.domain.Teacher;
import com.zjy.springbootmybatisplus.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl2 implements TeacherService {
    @Autowired
    private TeacherDao teacherDao;

    @Override
    public Boolean save(Teacher teacher) {
        return teacherDao.insert(teacher) > 0;
    }

    @Override
    public Boolean update(Teacher teacher) {
        return teacherDao.updateById(teacher) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return teacherDao.deleteById(id) > 0;
    }

    @Override
    public Teacher getById(Integer id) {
        return teacherDao.selectById(id);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherDao.selectList(null);
    }

    @Override
    public IPage<Teacher> getPage(Integer currentPage, Integer pageSize) {
        LambdaQueryWrapper<Teacher> query = new LambdaQueryWrapper<>();
        query.like(Teacher::getUsername, "赵飞");
        IPage page = new Page(currentPage, pageSize);
        return teacherDao.selectPage(page, query);
    }
}
