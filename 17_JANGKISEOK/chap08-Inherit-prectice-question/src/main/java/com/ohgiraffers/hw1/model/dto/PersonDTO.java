package com.ohgiraffers.hw1.model.dto;

public class PersonDTO {
    protected String name;
    private int age;
    private double height;
    private double weight;

    public PersonDTO(){}

    public PersonDTO(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String information(){
        return "";
    }
}
