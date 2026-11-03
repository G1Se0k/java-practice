package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        int totalStudentCount = 10;
        int currentStudentCount = 0;
        StudentDTO[] students = new StudentDTO[totalStudentCount];

        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        char agree = 'y';
        Scanner sc = new Scanner(System.in);
        do {
            if(currentStudentCount == totalStudentCount) {
                System.out.println("최대 학생 수에 도달하여 입력을 종료합니다.");
                break;
            }

            System.out.print("학년을 입력하세요 : ");
            int grade = sc.nextInt();
            System.out.print("반을 입력하세요 : ");
            int classRoom = sc.nextInt();
            System.out.print("이름을 입력하세요 : ");
            String name = sc.next();
            System.out.print("국어점수를 입력하세요 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수를 입력하세요 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수를 입력하세요 : ");
            int math = sc.nextInt();

            students[currentStudentCount] = new StudentDTO(grade, classRoom, name, kor, eng, math);
            // 한 명씩 추가 될 때마다 카운트함
            currentStudentCount++;
            System.out.println("현재 학생 수 : " + currentStudentCount + "명");

            // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
            System.out.println("입력을 계속 하시겠습니까? y / n");
            agree = sc.next().charAt(0);
        } while (agree == 'y');

        // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        // 학생들의 정보를 모두 출력 (평균 포함)
        for(int i = 0; i < currentStudentCount; i++) {
            System.out.println(students[i].information());
        }


    }
}
