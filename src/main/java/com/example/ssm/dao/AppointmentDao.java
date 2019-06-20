package com.example.ssm.dao;

import com.example.ssm.entity.Appointment;
import org.apache.ibatis.annotations.Param;

/**
 * @author furg@senthink.com
 * @date 2019/6/20
 */
public interface AppointmentDao {

    /**
     * 插入预约的图书记录
     *
     * @param bookId
     * @param studentId
     * @return
     */
    int insertAppointment(@Param("bookId") long bookId, @Param("studentId") long studentId);


    /**
     * 通过主键查询预约图书记录，并且携带图书实体
     *
     * @param bookId
     * @param studentId
     * @return
     */
    Appointment queryByKeyWithBook(@Param("bookId") long bookId, @Param("studentId") long studentId);
}
