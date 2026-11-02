package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO{

    private int salary;
    private String department;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, int age, double height, double weight, int salary, String department) {
        super(age, height, weight);
        super.setName(name);
        this.salary = salary;
        this.department = department;
    }

    public String information() {
        return super.information() + ", 연봉 : " + salary + ", 부서 : " + department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
