package com.ohgiraffers.level02.normal.card.model;

public class StudentCard {
    private String studentNo;

    public StudentCard(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentNum(){return studentNo;}

    public int getEntranceYear(){
        return Integer.parseInt(studentNo.substring(0,4));
    }

    @Override
    public String toString() {
        return "학생증[" + getStudentNum() + "," + getEntranceYear() + "년 입학]";
    }
}