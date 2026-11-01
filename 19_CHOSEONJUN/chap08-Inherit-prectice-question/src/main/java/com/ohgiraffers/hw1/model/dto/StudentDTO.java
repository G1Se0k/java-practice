package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO {

    private int grade;  // 학년
    private String major;  // 전공

    public StudentDTO() {
    }

    public StudentDTO(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        this.grade = grade;
        this.major = major;
        super.name = name; //name 값은 부모 필드 값에 직접 접근해서 초기화
    }


    public String information() {
        return  super.information()+
                "학년: " + grade +
                ", 전공: " + major +
                '}';
    }

}
