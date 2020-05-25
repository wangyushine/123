package com.sharedguide.guide.model.DTO;

public class GuideDto {
    private int id;
    private int a_id;
    private String province;
    private String city;
    private String attractions;

    @Override
    public String toString() {
        return "GuideDto{" +
                "id=" + id +
                ", a_id=" + a_id +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", attractions='" + attractions + '\'' +
                '}';
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
}
