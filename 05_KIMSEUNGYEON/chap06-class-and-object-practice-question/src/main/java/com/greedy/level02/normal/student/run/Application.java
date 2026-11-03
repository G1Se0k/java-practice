package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        //스캐너로 학생 정보를 모두 입력 받아 모든 필드를 초기화하는 생성자로 인스턴스 생성 후
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        int classRoom = sc.nextInt();
        String name = sc.next();
        double height = sc.nextDouble();
        char gender = sc.next().charAt(0);

        //모든 필드 정보를 출력하는 printInformation() 메소드 호출하여 출력
        StudentVO student = new StudentVO(grade, classRoom, name, height, gender);
        printInformation(student);
    }

    public static void printInformation(StudentVO student) {
        System.out.println("학년 : " + student.getGrade());
        System.out.println("반 : " + student.getClassRoom());
        System.out.println("이름 : " + student.getName());
        System.out.println("키 : " + student.getHeight());
        System.out.println("성별 : " + student.getGender());
    }
}
