package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    /**
     * 요구사항
     * <p>
     * 1. 3명의 학생 정보를 기록할 수 있게 객체 배열을 할당하고 아래의 사용데이터를 참고하여
     * 3명의 학생 객체 생성 후 반복문을 통해 출력
     * <p>
     * 2. 최대 10명의 사원 정보를 기록할수 있게 객체 배열을 할당하고 반복문을 사용하여
     * 키보드로 사원 정보를 입력 받도록 구현
     * <p>
     * 2명 정도의 사원 정보를 입력 받아 각 객체에 저장하고
     * 현재까지 기록된 사원들의 정보 출력
     */

    public static void main(String[] args) {
        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
        StudentDTO[] studentDTO = new StudentDTO[3];
        // 위의 사용데이터 참고하여 3명의 학생 정보 초기화
        studentDTO[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        studentDTO[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        studentDTO[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        // 위의 학생 정보 모두 출력 --> 향상된 for문 이용해서
        for (StudentDTO studentDTO1 : studentDTO) {
            System.out.println(studentDTO1.information());
        }

        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        EmployeeDTO[] employeeDTO = new EmployeeDTO[10];
        // 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("===== 사원 정보를 입력합니다 =====");
            System.out.print("이름 : ");
            String name = scanner.next();
            System.out.print("나이 : ");
            int age = scanner.nextInt();
            System.out.print("신장 : ");
            double height = scanner.nextDouble();
            System.out.print("몸무게 : ");
            double weight = scanner.nextDouble();
            System.out.print("급여 : ");
            int  salary = scanner.nextInt();
            System.out.print("부서 : ");
            String major = scanner.next();
            employeeDTO[count] = new EmployeeDTO(name, age, height, weight, salary, major);
            // 한 명씩 추가 될 때마다 카운트함
            count++;

            // 10명이 다 찼으면 더 물어볼 필요 없이 종료
            if (count == 10) {
                System.out.println("사원 정보는 10명을 초과할 수 없습니다. 입력을 종료합니다.");
                break;
            }

            // y/n 중 하나가 입력될 때까지 계속 다시 입력받는 반복문
            String answer;
            while (true) {
                System.out.print(count + "명 추가 되었습니다 계속 추가하실건가요? (y/n) : ");
                answer = scanner.next();

                if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")) {
                    break;  // 올바른 입력이면 안쪽 반복문 탈출
                }
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }

            if (answer.equalsIgnoreCase("n")) {
                System.out.println("입력을 종료합니다.");
                break;  // 바깥 반복문 탈출
            }
            System.out.println("계속 입력하겠습니다.");
        }


        // 현재 기록된 사원들의 정보를 모두 출력
        for (EmployeeDTO employeeDTO1 : employeeDTO) {
            if (employeeDTO1 != null) {
                System.out.println(employeeDTO1.information());
            }
        }

    }
}
