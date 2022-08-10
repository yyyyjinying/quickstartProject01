package com.example.zhao.service.impl;

import com.example.zhao.service.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void see() {
        System.out.println("see^^^^^^");
    }
}
