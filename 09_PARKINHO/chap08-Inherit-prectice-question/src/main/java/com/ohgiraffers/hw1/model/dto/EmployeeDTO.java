package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO {

    private int salary;     // 급여
    private String dept;    // 부서

    public EmployeeDTO() {
        super();
    }

    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String information() {
        return super.information() + ", 급여 : " + getSalary() + ", 부서 : " + getDept();
    }
}
