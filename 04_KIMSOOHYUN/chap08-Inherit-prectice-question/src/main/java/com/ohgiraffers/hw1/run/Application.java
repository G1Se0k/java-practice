package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.PersonDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
        PersonDTO[] studentDTO = new StudentDTO[3];

        // 위의 사용데이터 참고하여 3명의 학생 정보 초기화
        studentDTO[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        studentDTO[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        studentDTO[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        // 위의 학생 정보 모두 출력        --> 향상된 for문 이용해서
        System.out.println("이름 | 나이 | 신장 | 몸무게 | 학년 | 전공");
        for (PersonDTO s : studentDTO) {
            System.out.println(s.information());
        }


        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        PersonDTO[] employeeDTO = new EmployeeDTO[10];

        // 사원들의 정보를 키보드로 계속 입력 받고   --> while(true) 무한 반복문을 통해
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int count = 0;
        while (true) {
            System.out.println(" ");
            System.out.println("사원정보를 입력하세요.");
            System.out.println("이름 : ");
            String name = sc.next();
            System.out.println("나이 : ");
            int age = sc.nextInt();
            System.out.println("신장 : ");
            double height = sc.nextDouble();
            System.out.println("몸무게 : ");
            double weight = sc.nextDouble();
            System.out.println("급여 : ");
            int salary = sc.nextInt();
            System.out.println("부서 : ");
            String dept = sc.next();
            sc.nextLine();
            // 한 명씩 추가 될 때마다 카운트함
            employeeDTO[count] = new EmployeeDTO(name, age, height, weight, salary, dept);
            count++;
            // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
            System.out.println("계속 추가하시겠습니까?");
            char yn = sc.next().charAt(0);
            if (yn == 'y' || yn == 'Y') {
                continue;
            } else if (yn == 'n' || yn == 'N') {
                // 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
                // 현재 기록된 사원들의 정보를 모두 출력
                System.out.println("\n이름 | 나이 | 신장 | 몸무게 | 급여 | 부서");
                while (i < count) {
                    System.out.println(employeeDTO[i].information());
                    i++;
                }
                break;
            } else {
                System.out.println("y or n을 입력하세요.");
            }
        }
    }
}
