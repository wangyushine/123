package com.sharedguide.guide.model;

import javax.persistence.*;

//导游表
@Entity
@Table(name = "guide")
public class Guide {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "guide_id")
    @TableGenerator(name = "guide_id",initialValue = 0,allocationSize = 1,table = "seq_table")
    private int id;
    private int g_id;               //导游id
    private String g_name;          //导游名字
    private String g_sex;           //导游性别
    private String attractions;     //景点
    private String g_intro;         //简介
    private Boolean state;          //预约状态
    private Boolean type;           //一还是多
    private Boolean isprofessional; //是否职业

    public Guide() {}

    public Guide(int id, int g_id, String g_name, String g_sex, String attractions, String g_intro, Boolean state, Boolean type, Boolean isprofessional) {
        this.id = id;
        this.g_id = g_id;
        this.g_name = g_name;
        this.g_sex = g_sex;
        this.attractions = attractions;
        this.g_intro = g_intro;
        this.state = state;
        this.type = type;
        this.isprofessional = isprofessional;
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

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public String getG_sex() {
        return g_sex;
    }

    public void setG_sex(String g_sex) {
        this.g_sex = g_sex;
    }

    public String getAttractions() {
        return attractions;
    }

    public void setAttractions(String attractions) {
        this.attractions = attractions;
    }

    public String getG_intro() {
        return g_intro;
    }

    public void setG_intro(String g_intro) {
        this.g_intro = g_intro;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Boolean getIsprofessional() {
        return isprofessional;
    }

    public void setIsprofessional(Boolean isprofessional) {
        this.isprofessional = isprofessional;
    }

    @Override
    public String toString() {
        return "Guide{" +
                "id=" + id +
                ", g_id=" + g_id +
                ", g_name='" + g_name + '\'' +
                ", g_sex='" + g_sex + '\'' +
                ", attractions='" + attractions + '\'' +
                ", g_intro='" + g_intro + '\'' +
                ", state=" + state +
                ", type=" + type +
                ", isprofessional=" + isprofessional +
                '}';
    }
}
