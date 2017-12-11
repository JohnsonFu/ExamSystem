package nju.software.exam.entity;

import java.io.Serializable;

/**
 * Created by fulinhua on 2017/12/10.
 */
public class paper implements Serializable {

    private int id;//试卷ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    private int userid;//试卷名字

    private double score;

}
