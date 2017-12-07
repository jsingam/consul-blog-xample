package com.singam.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.singam.jview.DataView;

public class Student {
    @JsonView(DataView.Summary.class)
    private String id;
    @JsonView(DataView.Summary.class)
    private String name;
    @JsonView({DataView.Summary.class, DataView.Detail.class})
    private int age;
    @JsonView(DataView.Detail.class)
    private int arrears;
    @JsonView(DataView.Detail.class)
    private String crush;





    public Student(String id, String name, int age, int arrears, String crush) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.arrears = arrears;
        this.crush = crush;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getArrears() {
        return arrears;
    }

    public void setArrears(int arrears) {
        this.arrears = arrears;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCrush() {
        return crush;
    }

    public void setCrush(String crush) {
        this.crush = crush;
    }
}
