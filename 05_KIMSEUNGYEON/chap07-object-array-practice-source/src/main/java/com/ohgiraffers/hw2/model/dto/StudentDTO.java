package com.ohgiraffers.hw2.model.dto;

public class StudentDTO {

    private int grade;
    private int classRoom;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public StudentDTO() {
    }

    public StudentDTO(int grade, int classRoom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classRoom = classRoom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String information() {
        return "학년 : " + grade + ", 반 : " + classRoom + ", 이름 : " + name + ", 국어점수 : " + kor + ", 영어점수 : " + eng + ", 수학점수 : " + math + ", 총점 : " + totalScore()  + ", 평균 : " +  averageScore();
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(int classRoom) {
        this.classRoom = classRoom;
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

    public int totalScore() {
        return kor + eng + math;
    }

    public int averageScore() {
        return (kor + eng + math) / 3;
    }
}
