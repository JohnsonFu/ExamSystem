package nju.software.exam.service;

import nju.software.exam.entity.User;
import nju.software.exam.entity.exam;
import nju.software.exam.entity.question;

import java.util.List;

/**
 * Created by fulinhua on 2017/12/16.
 */
public interface InitExamService {
    public List<User> initExamJoiner(List<String> emailList);//考试参加者的邮箱
    public List<question> initExamQuestion(int nums);//初始化试题，参数为试题数量
    public User getUserByEmail(String email);//通过email获得User
    public List<question> getAllQuesion();//获得数据库中的所有question
    public void setPoint(exam exam, List<Integer> points);//设定每个题目的分值
}
