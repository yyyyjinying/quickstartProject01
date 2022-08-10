package com.zjy.springbootmybatisplus;

import com.zjy.springbootmybatisplus.config.asconfig.MyAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.context.annotation.ImportResource;

//@ImportResource({"classpath:applicationContext.xml"})
@EnableTransactionManagement
@SpringBootApplication
public class SpringbootmybatisplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmybatisplusApplication.class, args);
	}

//	@Bean
//	public JdbcTemplate jdbcTemplate(){
//		return new JdbcTemplate();
//	}

//	@Bean
//	public MyAspect myAspect(){
//		return new MyAspect();
//	}

}
