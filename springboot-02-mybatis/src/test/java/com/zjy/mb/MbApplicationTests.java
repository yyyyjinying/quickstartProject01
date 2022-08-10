package com.zjy.mb;

import com.zjy.mb.domain.Student;
import com.zjy.mb.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MbApplicationTests {

	@Autowired
	private StudentService studentService;

	@Test
	void contextLoads() {

		List<Student> student = studentService.getStudent();
		System.out.println(student);

	}

}
