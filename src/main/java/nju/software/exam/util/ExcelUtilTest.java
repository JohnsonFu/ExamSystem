package nju.software.exam.util;

import nju.software.exam.entity.User;
import nju.software.exam.entity.question;

import java.io.File;
import java.util.List;

/**
 * Created by fulinhua on 2017/12/10.
 */
public class ExcelUtilTest {
    public static void main(String[] args){
        ExcelUtil excelUtil=new ExcelUtilImplements();
        String root = System.getProperty("user.dir");        
        String questionPath = root + File.separator + "src/main/resources" + File.separator + "试题.xls";
        System.out.println(questionPath);
        List<question> qs= excelUtil.readQuestionExcel(questionPath);
        for(question q:qs){
            System.out.println(q);
        }
        String studentPath = root + File.separator + "src/main/resources" + File.separator + "考生列表.xls";
        System.out.println(studentPath);
        List<User> userList=excelUtil.readStudentExcel(studentPath);
        for(User user:userList){
            System.out.println(user);
        }
    }

}
