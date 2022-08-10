package com.zjy.springbootmybatisplus.dao;

import com.zjy.springbootmybatisplus.domain.DeptEmp;
import com.zjy.springbootmybatisplus.domain.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class TemplateJdbcCase {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void save(){
        String sql = "insert into dept_emp values(10004,'d003','1990-09-09','1234-09-08')";

        int update = jdbcTemplate.update(sql);
        System.out.println(update);
    }

    @Test
    void query(){

        String sql = "select * from dept_emp";



        RowMapper<DeptEmp> rowMapper = new RowMapper<DeptEmp>() {
            @Override
            public DeptEmp mapRow(ResultSet rs, int rowNum) throws SQLException {
                DeptEmp deptEmp = new DeptEmp();
                int emp_no = rs.getInt("emp_no");
                String dept_no = rs.getString("dept_no");
                Date fromDate = rs.getDate("from_date");
                Date to_data = rs.getDate("to_date");
                deptEmp.setEmpNo(emp_no);
                deptEmp.setDeptNo(dept_no);
                deptEmp.setFromDate(fromDate);
                deptEmp.setToDate(to_data);
                return deptEmp;
            }
        };

        List<DeptEmp> query = jdbcTemplate.query(sql, rowMapper);
//        (sql, rowMapper);
        System.out.println(query);
    }
}
