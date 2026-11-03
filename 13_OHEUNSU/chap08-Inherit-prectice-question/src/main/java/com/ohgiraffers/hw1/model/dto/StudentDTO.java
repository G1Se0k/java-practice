package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO{

    private int grade;
    private String major;

    public StudentDTO() {
    }

    public StudentDTO(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        this.name = name;
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String information() {
        return super.information() + ", " + grade + "학년, " + major + "전공";
    }


}
