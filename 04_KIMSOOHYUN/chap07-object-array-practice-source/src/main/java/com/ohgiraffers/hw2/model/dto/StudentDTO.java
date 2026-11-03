package com.ohgiraffers.hw2.model.dto;

public class StudentDTO {
//    - grade : int
// 학년 - classroom : int  - name : String
// 반
// 이름 - kor : int  - eng : int  - math : int
// 국어점수
// 영어점수
// 수학점수

    private int grade;          // 학년
    private int classroom;      // 반
    private String name;        // 이름
    private int kor;            // 국어점수
    private int eng;            // 영어점수
    private int math;           // 수학점수


    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public StudentDTO() {}

    public String information() {
        return "\n" + " " + grade + "\t " + classroom + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}
