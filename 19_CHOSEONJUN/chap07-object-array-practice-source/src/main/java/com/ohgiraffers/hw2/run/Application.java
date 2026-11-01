package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        StudentDTO[] studentDTO = new StudentDTO[10];

        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        Scanner sc = new Scanner(System.in);
        int count = 0; // 한 명씩 추가 될 때마다 카운트함
        while (true) {
            System.out.print("학년 입력: ");
            int grade = sc.nextInt();
            System.out.print("반 입력: ");
            int classroom = sc.nextInt();
            sc.nextLine();
            System.out.print("이름 입력: ");
            String name = sc.nextLine();
            System.out.print("국어점수 입력: ");
            int kor = sc.nextInt();
            System.out.print("영어점수 입력: ");
            int eng = sc.nextInt();
            System.out.print("수학점수 입력: ");
            int math = sc.nextInt();
            // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
            studentDTO[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
            count++;
            sc.nextLine();
            System.out.print("계속 추가 할 것인가요?: (y/n) ");
            char ch = sc.nextLine().charAt(0);
            if (ch != 'y' && ch != 'Y') {   // 둘 중에 한개가 false >> 실행(X)
                for (int i = 0; i < count; i++) {
                    System.out.println(studentDTO[i].infomation() + "평균: "+ studentDTO[i].average());
                }
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
        // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        // 학생들의 정보를 모두 출력 (평균 포함)
    }
}
