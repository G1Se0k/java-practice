package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.PersonDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO[] students = new StudentDTO[3];
        students[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for(StudentDTO student : students){
            System.out.println(student.information());
        }

        EmployeeDTO[] employees = new EmployeeDTO[10];
        int count = 0;
        String answer = "y";
        while(count < employees.length && answer.equalsIgnoreCase("y")){
            String name = sc.next();
            int age = sc.nextInt();
            double height = sc.nextDouble();
            double weight = sc.nextDouble();
            int salary = sc.nextInt();
            String dept = sc.next();
            employees[count] = new EmployeeDTO(name, age, height, weight, salary, dept);
            count++;

            System.out.println("계속 입력하시겠습니까? (y/n): ");
            answer = sc.next();
        }
        for(int i = 0; i<count; i++){
            System.out.println(employees[i].information());
        }
    }
}
//박보검 26 180.3 72.0 100000000 영업부
//강동원 38 182.0 76.0 200000000 기획부