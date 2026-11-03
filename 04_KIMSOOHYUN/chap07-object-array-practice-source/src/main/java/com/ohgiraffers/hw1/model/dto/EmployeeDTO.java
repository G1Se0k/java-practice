package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO {

    private int empNo;         // 사번
    private String empName;    // 사원명
    private String dept;       // 소속부서
    private String job;        // 직급
    private int age;           // 나이
    private char gender;       // 성별
    private int salary;        // 급여
    private double bonusPoint; // 보너스포인트
    private String phone;      // 전화번호
    private String address;    // 주소

    // 사원1
    public EmployeeDTO() {
    }

    // 사원2
    public EmployeeDTO(int empNo, String empName, int age, char gender, String phone, String address) {
        this.empNo = empNo;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    // 사원3
    public EmployeeDTO(int empNo, String empName, String dept, String job, int age, char gender, int salary, double bonusPoint, String phone, String address) {
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.bonusPoint = bonusPoint;
        this.phone = phone;
        this.address = address;
    }

    public String information() {
        return empNo + ", " + empName + ", " + dept + ", " + job
                + ", " + age + ", " + gender + ", " + salary
                + ", " + bonusPoint + ", " + phone + ", " + address;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDept() {
        return dept;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }

    public double getBonusPoint() {
        return bonusPoint;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}


