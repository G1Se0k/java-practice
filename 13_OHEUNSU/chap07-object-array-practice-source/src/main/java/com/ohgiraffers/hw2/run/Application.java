package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDTO[] students = new StudentDTO[10];

        int cnt = 0;
        char continueFlag = 'y';

        while(continueFlag == 'y' || continueFlag == 'Y'){
            System.out.print("grade: ");
            int grade = sc.nextInt();
            System.out.print("classroom: ");
            int classroom = sc.nextInt();
            System.out.print("name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("kor: ");
            int kor = sc.nextInt();
            System.out.print("eng: ");
            int eng = sc.nextInt();
            System.out.print("math: ");
            int math = sc.nextInt();
            students[cnt++] = new StudentDTO(grade, classroom, name, kor, eng, math);
            System.out.print("계속 추가하시려면 y키를 눌러주세요: ");
            sc.nextLine();
            continueFlag = sc.nextLine().charAt(0);
        }

        for(int i = 0; i < cnt; i++){
            System.out.println(students[i].information());
        }
    }
}
