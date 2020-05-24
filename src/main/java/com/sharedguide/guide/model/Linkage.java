package com.sharedguide.guide.model;

import javax.persistence.*;

/**
 * @author 18710
 */
@Entity
@Table(name = "linkage")
public class Linkage {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "link_id")
    @TableGenerator(name = "link_id", initialValue = 0, allocationSize = 1,table = "seq_table")
    private int id;
    private int g_id;
    private int s_id;
    private String attractions;

    @Override
    public String toString() {
        return "Linkage{" +
                "id=" + id +
                ", g_id=" + g_id +
                ", s_id=" + s_id +
                ", attractions='" + attractions + '\'' +
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

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getAttractions() {
        return attractions;
    }

    public void setAttractions(String attractions) {
        this.attractions = attractions;
    }
}
