package com.ohgiraffers.hw2.model.dto;

public class StudentDTO {

    private int grade;
    private int classroom;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public StudentDTO() {
    }
    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public double average() {
        return (double) (kor + eng + math) / 3;
    }
    public String infomation() {
        return "StudentDTO{" +
                "학년 " + grade +
                ", 반 " + classroom +
                ", 이름 " + name +
                ", 국어점수 " + kor +
                ", 영어점수 " + eng +
                ", 수학점수 " + math +
                '}';
    }
}
