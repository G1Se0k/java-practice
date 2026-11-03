package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        //스캐너로 학생 정보를 모두 입력 받아 모든 필드를 초기화하는 생성자로 인스턴스 생성 후

        Scanner sc = new Scanner(System.in);
        System.out.println("학년 :");
        int grade = sc.nextInt();
        System.out.println("반 :");
        int classroom = sc.nextInt();
        System.out.println("이름 :");
        String name = sc.next();
        System.out.println("키 :");
        double height = sc.nextDouble();
        System.out.println("성별 :");
        char gender = sc.next().charAt(0);

        StudentVO studentVO = new StudentVO(grade, classroom, name, height, gender);

        //모든 필드 정보를 출력하는 printInformation() 메소드 호출하여 출력

        studentVO.printInformation();
    }

}


//학년 : 1
//반 :　２
//이름 : 홍길동
//키 : 175.5
//성별 : 남