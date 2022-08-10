package com.zjy.springbootmybatisplus.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("dept_emp")
public class DeptEmp {
    private Integer empNo;
    private String deptNo;
    private Date fromDate;
    private Date toDate;
}
