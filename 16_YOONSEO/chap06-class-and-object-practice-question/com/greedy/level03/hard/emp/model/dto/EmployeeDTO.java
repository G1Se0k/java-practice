package com.greedy.level03.hard.emp.model.dto;

public class EmployeeDTO {
    private int number;
    private String name;
    private String dept;
    private String job;
    private int age;
    private char gender;
    private int salary;
    private double bnousPoint;
    private String phone;
    private String address;

    public EmployeeDTO() {
    } // 기본생성자

    public int getNumber() {
        System.out.println(number);
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        System.out.println(dept);
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getJob() {
        System.out.println(job);
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        System.out.println(age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        System.out.println(gender);
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSalary() {
        System.out.println(salary);
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBnousPoint() {
        System.out.println(bnousPoint);
        return bnousPoint;
    }

    public void setBnousPoint(double bnousPoint) {
        this.bnousPoint = bnousPoint;
    }

    public String getPhone() {
        System.out.println(phone);
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        System.out.println(address);
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
