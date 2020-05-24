package com.sharedguide.guide.model;

import javax.persistence.*;

/**
 * @author 18710
 */

@Entity
@Table(name = "about")
public class About {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "about_id")
    @TableGenerator(name = "about_id", initialValue = 0, allocationSize = 1,table = "seq_table")
    private int id;
    private String about;

    @Override
    public String toString() {
        return "About{" +
                "id=" + id +
                ", about='" + about + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
