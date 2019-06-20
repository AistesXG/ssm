package com.example.ssm.dto;

import com.example.ssm.entity.Appointment;
import com.example.ssm.enums.AppointStateEnum;

/**
 * 封装执行预约执行后的结果
 *
 * @author furg@senthink.com
 * @date 2019/6/20
 */
public class AppointExecution {


    private long bookId;


    private int state;

    private String stateInfo;

    //预约成功对象
    private Appointment appointment;


    /**
     * 预约失败的构造器
     * @param bookId
     * @param appointStateEnum
     */
    public AppointExecution(long bookId, AppointStateEnum appointStateEnum) {
        this.bookId = bookId;
        this.state = appointStateEnum.getState();
        this.stateInfo = appointStateEnum.getStateInfo();
    }

    public AppointExecution(long bookId, AppointStateEnum appointStateEnum, Appointment appointment) {
        this.bookId = bookId;
        this.state = appointStateEnum.getState();
        this.stateInfo = appointStateEnum.getStateInfo();
        this.appointment = appointment;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "AppointExecution{" +
                "bookId=" + bookId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", appointment=" + appointment +
                '}';
    }
}
