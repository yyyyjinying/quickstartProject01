package com.zjy.springbootmybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zjy.springbootmybatisplus.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherDao extends BaseMapper<Teacher> {
}
