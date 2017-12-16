package nju.software.exam.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by fulinhua on 2017/12/16.
 */
public class exam {//发放给同学的考卷
    private int nums;//试题数
    private List<User> userList;//参与考试的人数
    private List<question> questions;//考试题目
    private Map<question,Integer> quesion_value_map;//考试的每个题目对应的分值,在初始化之后再设定
    private Date startTime;//考试开始时间
    private Date endTime;//考试结束时间
    private int minutes;//考试时长


    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<question> questions) {
        this.questions = questions;
    }

    public Map<question, Integer> getQuesion_value_map() {
        return quesion_value_map;
    }

    public void setQuesion_value_map(Map<question, Integer> quesion_value_map) {
        this.quesion_value_map = quesion_value_map;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public exam(int nums, List<User> userList, List<question> questions, Date startTime, Date endTime, int minutes) {
        this.nums = nums;
        this.userList = userList;
        this.questions = questions;
        this.startTime = startTime;
        this.endTime = endTime;
        this.minutes = minutes;
    }



}
