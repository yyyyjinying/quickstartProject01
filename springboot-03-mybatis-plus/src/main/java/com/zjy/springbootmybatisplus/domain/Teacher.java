package com.zjy.springbootmybatisplus.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Blob;
import java.sql.Date;

@Data
public class Teacher {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String username;
    private String pwd;

    private Date regTime;
    private Date lastLoginTime;
    private String myInfo;
    private Blob headImg;

}
