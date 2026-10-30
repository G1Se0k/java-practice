package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO{
    private int salary;
    private String dept;

    public EmployeeDTO(){}

    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String information(){
        return "이름 : " + name + ", " +
                "나이 : " + getAge() + ", " +
                "신장 : " + getHeight() + ", " +
                "몸무게 : " + getWeight() + ", " +
                "급여 : " + salary + ", " +
                "부서 : " + dept;
    }
}
