package com.example.ssm.serviceImpl;

import com.example.ssm.dao.AppointmentDao;
import com.example.ssm.dao.BookDao;
import com.example.ssm.dto.AppointExecution;
import com.example.ssm.entity.Appointment;
import com.example.ssm.entity.Book;
import com.example.ssm.enums.AppointStateEnum;
import com.example.ssm.exception.AppointException;
import com.example.ssm.exception.NoNumberException;
import com.example.ssm.exception.RepeatAppointException;
import com.example.ssm.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author furg@senthink.com
 * @date 2019/6/20
 */
@Service
public class BookServiceImpl implements BookService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookServiceImpl.class);

    @Autowired
    private BookDao bookDao;
    @Autowired
    private AppointmentDao appointmentDao;

    @Override
    public Book getById(long bookId) {
        return bookDao.queryById(bookId);
    }

    @Override
    public List<Book> getList() {
        return bookDao.queryAll(0, 1000);
    }

    @Override
    public AppointExecution appoint(long bookId, long studentId) {
        try {
            int update = bookDao.reduceNumber(bookId);
            if (update <= 0) {
                throw new NoNumberException("no number");
            } else {
                int insert = appointmentDao.insertAppointment(bookId, studentId);
                if (insert <= 0) {
                    throw new RepeatAppointException("repeat appoint");
                } else {
                    Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
                    return new AppointExecution(bookId, AppointStateEnum.SUCCESS, appointment);
                }
            }
        } catch (NoNumberException e1) {
            throw e1;
        } catch (RepeatAppointException e2) {
            throw e2;
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            throw new AppointException("appoint inner error" + e.getMessage());
        }


    }
}
