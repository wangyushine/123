package com.sharedguide.guide.model;


import javax.persistence.*;
import java.sql.Date;

/**
 * @author 18710
 */
@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "question_id")
    @TableGenerator(name = "question_id", initialValue = 0, allocationSize = 1,table = "seq_table")
    private int id;
    private String content;
    private int openid;
    private Date dic_datatime;

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", openid=" + openid +
                ", dic_datatime=" + dic_datatime +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getOpenid() {
        return openid;
    }

    public void setOpenid(int openid) {
        this.openid = openid;
    }

    public Date getDic_datatime() {
        return dic_datatime;
    }

    public void setDic_datatime(Date dic_datatime) {
        this.dic_datatime = dic_datatime;
    }
}
