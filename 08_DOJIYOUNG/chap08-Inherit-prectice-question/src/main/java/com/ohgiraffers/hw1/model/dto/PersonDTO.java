package com.ohgiraffers.hw1.model.dto;

public class PersonDTO {
    protected String name;
    private int age;
    private double height;
    private double wieght;

    public PersonDTO() {
    }

    public PersonDTO(int age, double height, double wieght) {
        this.age = age;
        this.height = height;
        this.wieght = wieght;
    }


    public String information() {
        return "PersonDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", wieght=" + wieght +
                '}';
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWieght() {
        return wieght;
    }

    public void setWieght(double wieght) {
        this.wieght = wieght;
    }
}
