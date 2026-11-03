package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3명의 학생 정보를 참고하여 3명의 학생 정보 초기화
        StudentDTO[] arr = new StudentDTO[3];
        arr[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        arr[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        arr[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
        // 위의 학생 정보 모두 출력
        for (StudentDTO s : arr) {
            System.out.println(s.getName() + " " + s.getAge() + " " + s.getHeight() + " " + s.getWeight() + " " + s.getGrade() + " " + s.getMajor());
        }
        System.out.println("=========================================");

        // 한 명씩 추가 될 때마다 카운트
        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        int count = 0;
        EmployeeDTO[] arr2 = new EmployeeDTO[10];
        // 무한반복으로 사원들의 정보를 키보드로 계속 입력받고
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        do {
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("나이: ");
            int age = sc.nextInt();
            System.out.print("키 : ");
            double height = sc.nextDouble();
            System.out.print("몸무게 : ");
            double weight = sc.nextDouble();
            System.out.print("급여 : ");
            int salary = sc.nextInt();
            System.out.print("부서 : ");
            String dept = sc.next();
            arr2[count] = new EmployeeDTO(name, age, height, weight, salary, dept);
            count++;
            System.out.print("계속 추가하시겠습니다? ");
            char ch = sc.next().charAt(0);
            if (ch != 'Y' && ch != 'y') {break;}
        } while (true);

        // 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
        // 현재 기록된 사원들의 정보를 모두 출력
        for(int i =0; i<count; i++){
            EmployeeDTO e = arr2[i];

            System.out.println(
                    e.getName() + " " +
                            e.getAge() + " " +
                            e.getHeight() + " " +
                            e.getWeight() + " " +
                            e.getSalary() + " " +
                            e.getDept()
            );
        }


    }
}
