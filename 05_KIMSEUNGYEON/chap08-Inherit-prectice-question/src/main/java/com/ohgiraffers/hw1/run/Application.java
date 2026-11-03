package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // 1. 3명의 학생 정보를 기록할 수 있게 객체 배열을 할당하고 아래의 사용데이터를 참고하여 3명의 학생 객체 생성 후 반복문을 통해 출력
        StudentDTO[] students = new StudentDTO[3];

        students[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for(StudentDTO student : students) {
            System.out.println(student.information());
        }

        // 2. 최대 10명의 사원 정보를 기록할 수 있게 객체 배열을 할당하고 반복문을 사용하여 키보드로 사원 정보를 입력 받도록 구현
        // 2명 정도의 사원 정보를 입력 받아 각 객체에 저장하고 현재까지 기록된  사원들의 정보 출력

        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        // 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 한 명씩 추가 될 때마다 카운트함
        // 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
        // 현재 기록된 사원들의 정보를 모두 출력

        EmployeeDTO[] employees = new EmployeeDTO[10];

        Scanner sc = new Scanner(System.in);
        char agree = 'y';
        int currentEmployeeCount = 0;

        do {
            if(currentEmployeeCount == 10) {
                System.out.println("최대 사원 수에 도달하여 입력을 종료합니다.");
                break;
            }

            System.out.print("이름을 입력하세요 : ");
            String name = sc.next();
            System.out.print("나이를 입력하세요 : ");
            int age = sc.nextInt();
            System.out.print("키를 입력하세요 : ");
            double height = sc.nextDouble();
            System.out.print("몸무게를 입력하세요 : ");
            double weight = sc.nextDouble();
            System.out.print("연봉을 입력하세요 : ");
            int salary = sc.nextInt();
            System.out.print("부서를 입력하세요 : ");
            String department = sc.next();

            employees[currentEmployeeCount] = new EmployeeDTO(name, age, height, weight, salary, department);
            currentEmployeeCount++;
            System.out.println("현재 사원 수 : " + currentEmployeeCount + "명");

            System.out.println("입력을 계속 하시겠습니까? y / n");
            agree = sc.next().charAt(0);
        } while (agree == 'y');

        for(int i = 0; i < currentEmployeeCount; i++) {
            System.out.println(employees[i].information());
        }
    }


}
