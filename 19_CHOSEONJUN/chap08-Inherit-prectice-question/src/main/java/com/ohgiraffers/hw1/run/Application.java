package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.PersonDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
        PersonDTO[] studentDTOS = new StudentDTO[3];
        // 위의 사용데이터 참고하여 3명의 학생 정보 초기화
        studentDTOS[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템 공학과");
        studentDTOS[1] = new StudentDTO("김말똥", 21, 187.3, 80, 2, "경영학과");
        studentDTOS[2] = new StudentDTO("강개순", 23, 167, 45, 4, "정보통신공학과");
        // 위의 학생 정보 모두 출력 --> 향상된 for문 이용해서
        for (PersonDTO studentDTO : studentDTOS) {
            System.out.println((studentDTO).information());
        }

        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        EmployeeDTO[] employeeDTOS = new EmployeeDTO[10];
        // 한 명씩 추가 될 때마다 카운트함
        int count = 0;
        // 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.print("이름 입력: ");
            String name = sc.nextLine();
            System.out.print("나이 입력: ");
            int age = sc.nextInt();
            System.out.print("키 입력: ");
            double height = sc.nextDouble();
            System.out.print("몸무게 입력: ");
            double weight = sc.nextDouble();
            sc.nextLine();
            System.out.print("급여 입력: ");
            int salary = sc.nextInt();  // 급여
            sc.nextLine();
            System.out.print("부서 입력: ");
            String dept = sc.nextLine();  // 부서
            System.out.print("계속 추가 할 것인가요?: 추가:(y||Y) 그만:(아무 키) ");
            char input = sc.nextLine().charAt(0);
            employeeDTOS[count] = new EmployeeDTO(name, age, height, weight, salary, dept);
            count++;
            // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
            if (input != 'y' && input != 'Y') {
                for (int i = 0; i < count; i++) {
                    System.out.println(employeeDTOS[i].information());
                }
                break;
            }
        }
        // 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
        // 현재 기록된 사원들의 정보를 모두 출력
    }
}
