package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO {
    private int grade;
    private String major;

    public StudentDTO(){

    }

    public StudentDTO(int age, double height, double wieght, int grade, String major) {
        super(age, height, wieght);
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String information() {
        return  super.information()+"StudentDTO{" +
                "grade=" + grade +
                ", major='" + major + '\'' +
                '}';
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
