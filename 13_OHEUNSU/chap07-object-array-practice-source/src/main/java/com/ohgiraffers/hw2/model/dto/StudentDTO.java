package com.ohgiraffers.hw2.model.dto;

public class StudentDTO {

    private int grade;
    private int classroom;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public StudentDTO(){

    }

    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String information(){
        return grade + "학년 " + classroom + "반 학생 " + name + "의 성적은 국어점수: " + kor + "점, 영어점수: " + eng + "점, 수학점수: " + math + "점이고 평균 점수는 " + ((double) (kor + eng + math)) / 3 + "입니다.";
    }
}
