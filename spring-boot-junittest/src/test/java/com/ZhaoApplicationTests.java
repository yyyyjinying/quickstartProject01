package com;

import com.example.zhao.ZhaoApplication;
import com.example.zhao.service.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes=ZhaoApplication.class)
class ZhaoApplicationTests {

    @Autowired
    BookDao bookDao;

    @Test
    void contextLoads() {
        bookDao.see();
    }

}
