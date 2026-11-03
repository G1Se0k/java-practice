package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentDTO[] student = new StudentDTO[10];
        int count=0;

        while(true){
            System.out.print("학년 : ");
            int grade =sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 : ");
            int math = sc. nextInt();

            student[count] = new StudentDTO(grade,classroom,name,kor,eng,math);
            count++;

            char ch;
            System.out.print("계속 추가하시겠습니까? ");
            ch = sc.next().charAt(0);

            if(ch=='Y'||ch=='y') continue;
            else{
                break;
            }
        }
        for(int i=0; i<count; i++){
            double avg = (student[i].getKor()+student[i].getEng()+student[i].getMath())/3.0;
            System.out.println(student[i].information()+", 평균 : "+avg);
        }

    }
}
