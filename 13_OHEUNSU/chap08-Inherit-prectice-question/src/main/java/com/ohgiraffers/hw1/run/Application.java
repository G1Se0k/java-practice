package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDTO[] students = new StudentDTO[3];
        EmployeeDTO[] employees = new EmployeeDTO[10];

        students[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for(StudentDTO student: students){
            System.out.println(student.information());
        }

        int cnt = 0;

        while(true){
            System.out.print("name: ");
            String name = sc.nextLine();
            System.out.print("age: ");
            int age = sc.nextInt();
            System.out.print("height: ");
            double height = sc.nextDouble();
            System.out.print("weight: ");
            double weight = sc.nextDouble();
            System.out.print("salary: ");
            int salary = sc.nextInt();
            System.out.print("dept: ");
            sc.nextLine();
            String dept = sc.nextLine();
            employees[cnt++] = new EmployeeDTO(name, age, height, weight, salary, dept);

            System.out.print("계속 추가하시려면 y키를 눌러주세요: ");
            char input = sc.nextLine().charAt(0);
            if(input != 'y' && input != 'Y')break;
        }

        for(int i = 0; i < cnt; i++){
            System.out.println(employees[i].information());
        }
    }
}
