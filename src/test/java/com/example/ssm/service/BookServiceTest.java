package com.example.ssm.service;

import com.example.ssm.dao.BaseTest;
import com.example.ssm.dto.AppointExecution;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author furg@senthink.com
 * @date 2019/6/20
 */
public class BookServiceTest  extends BaseTest {
    @Autowired
    private BookService bookService;

    @Test
    public void getById() throws Exception {
    }

    @Test
    public void getList() throws Exception {
    }

    @Test
    public void appoint() throws Exception {

        long bookId = 1001;
        long studentId = 12345678910L;
        AppointExecution execution = bookService.appoint(bookId, studentId);
        System.out.println(execution);
    }

}