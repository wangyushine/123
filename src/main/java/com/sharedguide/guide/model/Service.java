package com.sharedguide.guide.model;

import javax.persistence.*;

//特色服务表
@Entity
@Table(name = "attractions")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "attractions_id")
    @TableGenerator(name = "attractions_id", initialValue = 0, allocationSize = 1, table = "seq_table")
    private int id;
    private int s_id;               //服务id
    private String img_src;         //图片
    private String intro;           //介绍
    private String s_name;          //服务名称
    private String details;         //服务详情

    public Service() {}

    public Service(int id, int s_id, String img_src, String intro, String s_name, String details) {
        this.id = id;
        this.s_id = s_id;
        this.img_src = img_src;
        this.intro = intro;
        this.s_name = s_name;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getImg_src() {
        return img_src;
    }

    public void setImg_src(String img_src) {
        this.img_src = img_src;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", s_id=" + s_id +
                ", img_src='" + img_src + '\'' +
                ", intro='" + intro + '\'' +
                ", s_name='" + s_name + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
