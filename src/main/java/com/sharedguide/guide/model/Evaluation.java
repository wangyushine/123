package com.sharedguide.guide.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author 18710
 */

@Entity
@Table(name = "evaluation")
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "evaluation_id")
    @TableGenerator(name = "evaluation_id", initialValue = 0, allocationSize = 1,table = "seq_table")
    private int id;
    private int g_id;
    private int openid;

    @Override
    public String toString() {
        return "Evaluation{" +
                "id=" + id +
                ", g_id=" + g_id +
                ", openid=" + openid +
                ", content='" + content + '\'' +
                ", dic_datetime=" + dic_datetime +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getG_id() {
        return g_id;
    }

    public void setG_id(int g_id) {
        this.g_id = g_id;
    }

    public int getOpenid() {
        return openid;
    }

    public void setOpenid(int openid) {
        this.openid = openid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDic_datetime() {
        return dic_datetime;
    }

    public void setDic_datetime(Date dic_datetime) {
        this.dic_datetime = dic_datetime;
    }

    private String content;
    private Date dic_datetime;

}
