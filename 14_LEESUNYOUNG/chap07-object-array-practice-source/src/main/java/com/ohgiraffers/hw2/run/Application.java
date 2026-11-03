package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO[] students = new StudentDTO[10];
        int count = 0;
        String answer = "y";
        while(count < students.length && answer.equalsIgnoreCase("y")){
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();
            students[count] = new StudentDTO(grade,classroom,name,kor,eng,math);
            count++;
            System.out.println("계속 입력할까요? (y/n): ");
            answer = sc.next();
        }

        for(int i =0; i<count; i++){
            System.out.println(students[i].information());
            double average = (students[i].getKor()
                    + students[i].getEng()
                    + students[i].getMath()) / 3.0;
            System.out.println("평균 : " + average);
        }


    }
}
