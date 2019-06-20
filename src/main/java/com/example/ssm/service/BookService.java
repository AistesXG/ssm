package com.example.ssm.service;

import com.example.ssm.dto.AppointExecution;
import com.example.ssm.entity.Book;

import java.util.List;

/**
 * @author furg@senthink.com
 * @date 2019/6/20
 */
public interface BookService {

    Book getById(long bookId);

    List<Book> getList();

    AppointExecution appoint(long bookId, long studentId);
}
