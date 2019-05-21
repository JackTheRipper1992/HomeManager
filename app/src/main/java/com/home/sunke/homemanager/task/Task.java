package com.home.sunke.homemanager.task;

import com.home.sunke.homemanager.user.User;

import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

public class Task {
    private enum TaskType{
        CLEAN,
        REPLACE,
        OTHER
    }
    private enum EvaluateLevel{
        GOOD,
        NORMAL,
        NG
    }
    //拖地
    private static final int MOP_THE_FLOOR = 0;
    //扫地
    private static final int SWEEP_THE_FLOOR = 1;
    //洗袜子
    private static final int WASH_THE_SOCKS = 2;
    //擦灰
    private static final int SWEEP_THE_CASH = 3;
    //收衣服
    private static final int COLLECT_THE_CLOTHES = 4;
    //刷马桶
    private static final int WASH_THE_CLOSETOOL = 5;
    //洗鞋子
    private static final int WASH_THE_SHOOES = 6;

    private String mName;
    private Date mSetupTime;
    private Date mNextTodoTime;
    private Date[] mTimeHistory;
    private int mDateInterval;
    private String mTaskDescribe;
    private User mTaskUser;
    private User mCheckUser;
    private UUID mUUID;

    public Task(String name, Date setupTime, Date nextTodoTime, Date[] timeHistory, int dateInterval, String taskDescribe, User taskUser, User checkUser, UUID UUID) {
        mName = name;
        mSetupTime = setupTime;
        mNextTodoTime = nextTodoTime;
        mTimeHistory = timeHistory;
        mDateInterval = dateInterval;
        mTaskDescribe = taskDescribe;
        mTaskUser = taskUser;
        mCheckUser = checkUser;
        mUUID = UUID;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Date getSetupTime() {
        return mSetupTime;
    }

    public void setSetupTime(Date setupTime) {
        mSetupTime = setupTime;
    }

    public Date getNextTodoTime() {
        return mNextTodoTime;
    }

    public void setNextTodoTime(Date nextTodoTime) {
        mNextTodoTime = nextTodoTime;
    }

    public Date[] getTimeHistory() {
        return mTimeHistory;
    }

    public void setTimeHistory(Date[] timeHistory) {
        mTimeHistory = timeHistory;
    }

    public int getDateInterval() {
        return mDateInterval;
    }

    public void setDateInterval(int dateInterval) {
        mDateInterval = dateInterval;
    }

    public String getTaskDescribe() {
        return mTaskDescribe;
    }

    public void setTaskDescribe(String taskDescribe) {
        mTaskDescribe = taskDescribe;
    }

    public User getTaskUser() {
        return mTaskUser;
    }

    public void setTaskUser(User taskUser) {
        mTaskUser = taskUser;
    }

    public User getCheckUser() {
        return mCheckUser;
    }

    public void setCheckUser(User checkUser) {
        mCheckUser = checkUser;
    }

    public UUID getUUID() {
        return mUUID;
    }

    public void setUUID(UUID UUID) {
        mUUID = UUID;
    }

    @Override
    public String toString() {
        return "Task{" +
                "mName='" + mName + '\'' +
                ", mSetupTime=" + mSetupTime +
                ", mNextTodoTime=" + mNextTodoTime +
                ", mTimeHistory=" + Arrays.toString(mTimeHistory) +
                ", mDateInterval=" + mDateInterval +
                ", mTaskDescribe='" + mTaskDescribe + '\'' +
                ", mTaskUser=" + mTaskUser +
                ", mCheckUser=" + mCheckUser +
                ", mUUID=" + mUUID +
                '}';
    }
}
