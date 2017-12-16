package nju.software.exam.service.impl;

import nju.software.exam.entity.User;
import nju.software.exam.entity.exam;
import nju.software.exam.entity.question;
import nju.software.exam.service.InitExamService;

import java.util.*;

/**
 * Created by fulinhua on 2017/12/16.
 */
public class InitExamServiceImpl implements InitExamService{
    @Override
    public List<User> initExamJoiner(List<String> emailList) {
        List<User> userList=new ArrayList<>();
        for(String email:emailList){
            User user=getUserByEmail(email);//通过email获得用户信息
            userList.add(user);

        }
        return userList;
    }

    public User getUserByEmail(String email) {
        //和数据库进行查询
        return null;
    }

    @Override
    public List<question> initExamQuestion(int nums) {
        List<question> allQuesion=getAllQuesion();
        List<question> result=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<nums;i++){
            int index= random.nextInt(allQuesion.size());
            question q=allQuesion.get(index);
            result.add(q);
            allQuesion.remove(index);
        }
        return result;
    }

    public List<question> getAllQuesion() {

        return new ArrayList<question>();
    }

    @Override
    public void setPoint(exam exam, List<Integer> points) {
        List<question> question=exam.getQuestions();
        Map<question,Integer> result=new HashMap<>();
        for(int i=0;i<question.size();i++){
            result.put(question.get(i),points.get(i));
        }
        exam.setQuesion_value_map(result);
    }


}
