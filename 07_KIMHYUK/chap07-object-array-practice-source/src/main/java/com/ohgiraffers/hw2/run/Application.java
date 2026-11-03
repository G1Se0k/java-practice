package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDTO[] students = new StudentDTO[10];

        int count = 0;

        String answer = "y";

        while (count < 10 && answer.equalsIgnoreCase("y")) {

            System.out.println("학생 정보를 입력하세요.");
            System.out.print("학년 : ");
            int grade = sc.nextInt();

            System.out.print("반 : ");
            int classroom = sc.nextInt();

            sc.nextLine();

            System.out.print("이름 : ");
            String name = sc.nextLine();

            System.out.print("국어 점수 : ");
            int kor = sc.nextInt();

            System.out.print("영어 점수 : ");
            int eng = sc.nextInt();

            System.out.print("수학 점수 : ");
            int math = sc.nextInt();

            sc.nextLine();

            students[count] = new StudentDTO(grade, classroom, name, kor, eng, math);

            count++;

            if (count < 10) {
                System.out.print("학생 정보를 계속 입력하시겠습니까? (y/n) : ");
                answer = sc.nextLine();
            }
        }

        System.out.println("\n========== 학생 정보 및 평균 점수 =========== ");

        for (int i = 0; i < count; i++) {
            System.out.println(students[i].information());
        }

        sc.close();
    }
}
