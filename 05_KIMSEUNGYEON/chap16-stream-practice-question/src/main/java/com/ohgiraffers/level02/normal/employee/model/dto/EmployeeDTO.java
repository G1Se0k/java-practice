package com.ohgiraffers.level02.normal.employee.model.dto;

public class EmployeeDTO {

    private String name;
    private String dept;
    private int salary;

    public EmployeeDTO(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }
}