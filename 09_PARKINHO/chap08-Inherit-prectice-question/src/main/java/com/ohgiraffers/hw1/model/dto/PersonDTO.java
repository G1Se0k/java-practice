package com.ohgiraffers.hw1.model.dto;

public class PersonDTO {
    protected String name;
    private int age;
    private double height;
    private double weight;

    public PersonDTO() {}

    public PersonDTO(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String information() {
        return "이름 : " + getName() + ", 나이 : " + getAge() + ", 신장 : " + getHeight() + ", 몸무게 : " + getWeight();
    }
}
