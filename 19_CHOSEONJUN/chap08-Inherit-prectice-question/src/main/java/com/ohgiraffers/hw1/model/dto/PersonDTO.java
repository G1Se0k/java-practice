package com.ohgiraffers.hw1.model.dto;

public class PersonDTO {

    protected String name;
    private int age;
    private double height;
    private double weight;

    public PersonDTO() {
    }

    public PersonDTO(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String information() {
        return "PersonDTO{" +
                "이름: '" + name +
                ", 나이: " + age +
                ", 키: " + height +
                ", 몸무게: " + weight +
                '}';
    }
}
