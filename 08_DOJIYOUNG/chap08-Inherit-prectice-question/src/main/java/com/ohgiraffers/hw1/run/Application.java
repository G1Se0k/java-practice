package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.PersonDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Application application = new Application();
        /** * 1*/
        application.studentPractice();


        application.EmployeePractice();
    }


    // 3명 학생
    public void studentPractice(){
        PersonDTO[] students = new StudentDTO[3];
        students[0] = new StudentDTO(20,178.2,70.0,1,"정보시스템공학과");
        students[0].setName("홍길동");
        students[1] = new StudentDTO(21, 187.3, 80, 2, "경영학과");
        students[1].setName("김말똥");
        students[2] = new StudentDTO(23,167.0,45.0,4,"정보통신공학과");
        students[2].setName("강개순");

        for(PersonDTO s: students){
            System.out.println(s.information()); // personDto 정보어케?
        }
    }


    // 10명 사원
    public void EmployeePractice(){

        PersonDTO[] employees = new EmployeeDTO[10];
        int cnt = 0;
        int loop = 0;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("추가할거니 ? Y/N : ");
            char user = sc.next().charAt(0);

            switch (user){
                case 'Y','y':
                    System.out.print("name: "); String name = sc.next();
                    System.out.print("age: "); int age = sc.nextInt();
                    System.out.print("height: ");double height = sc.nextDouble();
                    System.out.print("wieght: ");double wieght = sc.nextDouble();
                    System.out.print("salary: ");int salary = sc.nextInt();
                    System.out.print("dept: ");String dept = sc.next();
                    employees[cnt] = new EmployeeDTO(age,height,wieght,salary,dept);
                    employees[cnt].setName(name);
                    cnt++;
                    loop++;
                    break;
                case 'N','n':
                    loop=10;
                    break;
                default:
                    System.out.println("wrong!! ");
            }

        }while(loop<10);

        for(int i=0; i<cnt;i++){
            System.out.println(employees[i].information());
        }

    }

}
