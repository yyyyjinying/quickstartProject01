package com.zjy.springbootmybatisplus.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zjy.springbootmybatisplus.domain.Teacher;


public interface ITeacherService extends IService<Teacher> {


    Boolean saveTeacher(Teacher teacher);

    @Override
    boolean save(Teacher teacher);

    Boolean modify(Teacher teacher);

    Boolean delete(Integer id);

    IPage<Teacher> getPage(Integer curPager, Integer pageSize);

    IPage<Teacher> searchPage(Teacher teacher, Integer curPage, Integer pageSize);

}
