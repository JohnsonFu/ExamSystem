package nju.software.exam.util;

import nju.software.exam.entity.User;
import nju.software.exam.entity.question;

import java.util.List;

/**
 * Created by fulinhua on 2017/12/10.
 */
public interface ExcelUtil {
    public  List<question> readQuestionExcel(String filePath);
    public List<User> readStudentExcel(String filePath);
}
