package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        StudentDTO[] students = new StudentDTO[10];
        Scanner sc = new Scanner(System.in);

        boolean isRunning = true;
        int cnt = 0;

        while(isRunning){
            System.out.print("계속 추가할 것인가 ? (Y/N) : ");
            char input = sc.next().charAt(0);

            switch (input){
                case 'Y','y':
                    //입력받기
                    System.out.print("grade : "); int grade = sc.nextInt();
                    System.out.print("classroom : "); int classroom = sc.nextInt();
                    System.out.print("name : "); String name = sc.next();
                    System.out.print("kor:  "); int kor = sc.nextInt();
                    System.out.print("eng:  "); int eng = sc.nextInt();
                    System.out.print("math:  "); int math = sc.nextInt();
                    students[cnt] = new StudentDTO(grade,classroom,name,kor,eng,math);
                    cnt+=1;
                    break;
                case 'N','n':
                    isRunning = false;
                    break;
                default:
                    System.out.println("잘못입력함.");
            }

            if(cnt ==10){break;}
        }


        for(int i =0 ; i<cnt; i++){
            System.out.println(students[i].information());
            System.out.println("이학생의 3과목 평균 : "+(students[i].getKor()+students[i].getEng()+students[i].getMath())/3);
        }


    }
}
