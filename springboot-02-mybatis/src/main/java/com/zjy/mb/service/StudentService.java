package com.zjy.mb.service;

import com.zjy.mb.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentService {
    @Select("select * from student")
    public List<Student> getStudent();
}
