package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO{

    private int grade;      // 학년
    private String major;   // 전공

    public StudentDTO() {
        super();
    }

    public StudentDTO(String name, int age, double height, double weight, int grade, String major) {
        super(name, age, height, weight);
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String information() {
        return super.information() + "\t " + grade + "\t " + major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}
