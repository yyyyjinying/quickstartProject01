package com.zjy.springbootmybatisplus.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zjy.springbootmybatisplus.domain.Teacher;

import java.util.List;

public interface TeacherService {
    Boolean save(Teacher teacher);
    Boolean update(Teacher teacher);
    Boolean delete(Integer id);
    Teacher getById(Integer id);
    List<Teacher> getAll();
    IPage<Teacher> getPage(Integer currentPage, Integer pageSize);
}
