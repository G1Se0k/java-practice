package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVO inform = new StudentVO();

        inform.printInformation();


        System.out.print("학년 : ");
        inform.setGrade(sc.nextInt());
        System.out.print("반 : ");
        inform.setClassroom(sc.nextInt());
        System.out.print("이름 : ");
        inform.setName(sc.next());
        System.out.print("키 : ");
        inform.setHeight(sc.nextDouble());
        System.out.print("성별 : ");
        inform.setGender(sc.next().charAt(0));

        inform.printInformation();
    }
}
