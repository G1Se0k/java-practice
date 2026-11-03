package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO {

    private int salary;
    private String dept;

    public EmployeeDTO() {
        super();
    }

    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(name, age, height, weight);
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String information() {
        return super.information() + "\t " + salary + "\t " + dept;
    }
}
