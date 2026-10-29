package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("학년을 입력하세요 : ");
        int grade = sc.nextInt();

        System.out.print("반을 입력하세요 : ");
        int classroom = sc.nextInt();

        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();

        System.out.print("키를 입력하세요 : ");
        double height = sc.nextDouble();

        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);

        StudentVO student = new StudentVO(grade, classroom, name, height, gender);

        student.printInformation();
    }



}
