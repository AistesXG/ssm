package com.example.ssm.dao;

import com.example.ssm.entity.Appointment;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author furg@senthink.com
 * @date 2019/6/20
 */
public class AppointmentDaoTest extends BaseTest {


    @Autowired
    private AppointmentDao appointmentDao;

    @Test
    public void insertAppointment() throws Exception {
        long bookId = 1000;
        long studentId = 12345678910L;
        int insert = appointmentDao.insertAppointment(bookId, studentId);
        System.out.println("insert= " + insert);
    }

    @Test
    public void queryByKeyWithBook() throws Exception {
        long bookId = 1000;
        long studentId = 12345678910L;
        Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
        System.out.println(appointment);
        System.out.println(appointment.getBook());
    }

}