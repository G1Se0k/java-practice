package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        StudentDTO[] std = new StudentDTO[3];

        StudentDTO student1 = new StudentDTO("홍길동",20,178.2,70.0,1,"정보시스템공학과");
        StudentDTO student2 = new StudentDTO("김말똥",21,187.3,80.0,2,"경영학과");
        StudentDTO student3 = new StudentDTO("강개순",23,167.0,45.0,4,"정보통신공학과");

        std[0] = student1;
        std[1] = student2;
        std[2] = student3;

        for (StudentDTO n : std) {
            System.out.println(n.information());
        }


        EmployeeDTO[] emp = new EmployeeDTO[10];

        Scanner sc = new Scanner(System.in);

        int count = 0;
        while(true) {
            System.out.print("이름을 입력해주세요 : ");
            String name = sc.next();

            System.out.print("나이를 입력해주세요 : ");
            int age = sc.nextInt();

            System.out.print("키를 입력해주세요 : ");
            double height = sc.nextDouble();

            System.out.print("몸무게를 입력해주세요 : ");
            double weight = sc.nextDouble();

            System.out.print("급여를 입력해주세요 : ");
            int salary = sc.nextInt();
            sc.nextLine();

            System.out.print("부서를 입력해주세요 : ");
            String dept = sc.nextLine();

            emp[count] = new EmployeeDTO(name,age,height,weight,salary,dept);
            count++;

            System.out.print("계속 추가하시겠습니까? (y/n) : ");
            String answer = sc.next();
            sc.nextLine();

            if (!answer.equalsIgnoreCase("y")) {
                break;
            }


        }
        for (int i = 0; i < count; i++) {
            System.out.println(emp[i].information());
        }
    }
}
