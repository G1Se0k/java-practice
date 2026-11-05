package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        StudentDTO[] student = new StudentDTO[10];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        char again = 'y';
        while (i < student.length && again == 'y') {
            student[i] = new StudentDTO();
            System.out.println(i + "번째 학생의 학년 : ");
            int grade = sc.nextInt();
            student[i].setGrade(grade);
            System.out.println(i + "번째 학생의 반 : ");
            int classroom = sc.nextInt();
            student[i].setClassrom(classroom);
            sc.nextLine();
            System.out.println(i + "번째 학생의 이름 : ");
            String name = sc.nextLine();
            student[i].setName(name);
            //sc.nextLine();
            System.out.println(i + "번째 학생의 국어점수 : ");
            int kor = sc.nextInt();
            student[i].setKor(kor);
            System.out.println(i + "번째 학생의 영어점수 : ");
            int eng = sc.nextInt();
            student[i].setEng(eng);
            System.out.println(i + "번째 학생의 수학점수 : ");
            int math = sc.nextInt();
            student[i].setMath(math);
            System.out.println("추가?(y 이외의 값 입력시 종료) :");
            char input = sc.next().charAt(0);
            again = input;
            i += 1;
        }
        for (int j = 0; j < i; j++) {
            System.out.println(student[j].information());
        }
    }
}
