package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDTO[] student = new StudentDTO[3];

        student[0]=new StudentDTO("홍길동",20,178.2,70.0,1,"정보시스템공학과");
        student[1]=new StudentDTO("김말똥",21,187.3,80.0,2,"경영학과");
        student[2]=new StudentDTO("강개순",23,167.0,45.0,4,"정보통신공학과");

        for(StudentDTO s : student){
            System.out.println(s.information());
        }

        EmployeeDTO[] emp = new EmployeeDTO[10];

        String name;
        int age;
        double height;
        double weight;
        int salary;
        String dept;

        char ch = ' ';
        int count=0;
        while(true){
            System.out.print("이름 : ");
            name =sc.next();
            System.out.print("나이 : ");
            age = sc.nextInt();
            System.out.print("신장 : ");
            height = sc.nextDouble();
            System.out.print("몸무게 : ");
            weight=sc.nextDouble();
            System.out.print("급여 : ");
            salary=sc.nextInt();
            System.out.print("부서 : ");
            dept=sc.next();
            emp[count]=new EmployeeDTO(name,age,height,weight,salary,dept);
            count++;

            System.out.print("계속 추가하시겠습니까?(y or Y ");
            ch=sc.next().charAt(0);
            if(ch=='Y'||ch=='y')continue;
            else break;

        }

        for(int i=0; i<count; i++){
            System.out.println(emp[i].information());
        }

    }
}
