package com.ohgiraffers.hw2.model.dto;

public class StudentDTO {
    private int grade;
    private int classroom;
    private String name;
    private int kor; // 국어점수
    private int eng;
    private int math;

    public StudentDTO() {
    }

    public StudentDTO(int grade, int classroom, String name , int kor, int eng, int math) {
        this.math = math;
        this.eng = eng;
        this.kor = kor;
        this.name = name;
        this.classroom = classroom;
        this.grade = grade;
    }

    public String information(){
        return grade + " " + classroom + " " + name + " " + kor + " " + eng+" " + math;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }
}
