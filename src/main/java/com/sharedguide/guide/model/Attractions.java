package com.sharedguide.guide.model;

import javax.persistence.*;

//筛选景点表
@Entity
@Table(name = "attractions")
public class Attractions {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "attractions_id")
    @TableGenerator(name = "attractions_id", initialValue = 0, allocationSize = 1, table = "seq_table")
    private int id;
    private int a_id;               //景点id
    private String province;        //省
    private String city;            //市
    private String attractions;     //景点（外键）

    public Attractions() {}

    public Attractions(int id, int a_id, String province, String city, String attractions) {
        this.id = id;
        this.a_id = a_id;
        this.province = province;
        this.city = city;
        this.attractions = attractions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAttractions() {
        return attractions;
    }

    public void setAttractions(String attractions) {
        this.attractions = attractions;
    }

    @Override
    public String toString() {
        return "attractions{" +
                "id=" + id +
                ", a_id=" + a_id +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", attractions='" + attractions + '\'' +
                '}';
    }
}