package com.zjy.springbootmybatisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjy.springbootmybatisplus.dao.TeacherDao;
import com.zjy.springbootmybatisplus.domain.Teacher;
import com.zjy.springbootmybatisplus.domain.vo.PageVo;
import com.zjy.springbootmybatisplus.service.ITeacherService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherDao, Teacher> implements ITeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    public Boolean saveTeacher(Teacher teacher) {
        return teacherDao.insert(teacher) > 0;
    }

    @Override
    public boolean save(Teacher teacher) {
        return teacherDao.insert(teacher) > 0;
    }

    @Override
    public Boolean modify(Teacher teacher) {
        return teacherDao.updateById(teacher) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return teacherDao.deleteById(id) > 0;
    }

    @Override
    public IPage<Teacher> getPage(Integer curPager, Integer pageSize) {
        IPage<Teacher> page = new Page(curPager, pageSize);
        return teacherDao.selectPage(page, null);
    }

    @Override
    public IPage<Teacher> searchPage(Teacher teacher, Integer curPage, Integer pageSize) {
        IPage<Teacher> page = new Page<>(curPage, pageSize);
        LambdaQueryWrapper<Teacher> query = new LambdaQueryWrapper<>();
        String username = teacher.getUsername();
        String pwd = teacher.getPwd();
        query.like(Strings.isNotEmpty(username), Teacher::getUsername, username);
        query.like(Strings.isNotEmpty(pwd), Teacher::getPwd, pwd);
        return teacherDao.selectPage(page, query);
    }
}
