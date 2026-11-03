package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO {

    private int salary;  // 급여
    private String dept; // 부서

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        this.salary = salary;
        this.dept = dept;
        super.name = name; //name 값은 부모 필드 값에 직접 접근해서 초기화
    }


    public String information() {
        return super.information() +
                "급여: " + salary +
                ", 부서: " + dept +
                '}';
    }
}

