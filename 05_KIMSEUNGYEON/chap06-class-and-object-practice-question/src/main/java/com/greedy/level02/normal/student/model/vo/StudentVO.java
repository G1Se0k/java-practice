package com.greedy.level02.normal.student.model.vo;

public class StudentVO {

    private int grade;
    private int classRoom;
    private String name;
    private double height;
    private char gender;

    public StudentVO() {
    }

    public StudentVO(int grade, int classRoom, String name, double height, char gender) {
        this.grade = grade;
        this.classRoom = classRoom;
        this.name = name;
        this.height = height;
        this.gender = gender;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
