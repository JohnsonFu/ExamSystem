package nju.software.exam.entity;

import java.io.Serializable;

/**
 * Created by fulinhua on 2017/12/10.
 */
public class question implements Serializable {


 private  int id;
 private String  description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
public String toString(){

    return "题干:"+this.getDescription()+"---选项A:"+this.getOptionA()+"---选项B:"+this.getOptionB()+"---选项C:"+this.getOptionC()
            +"---选项D:"+this.getOptionD()+"---答案:"+this.getAnswer()+"---难度:"+this.getLevel();

}
    private String optionA;
  private String optionB;
  private String optionC;
  private String optionD;
  private String answer;
  private String level;
}
