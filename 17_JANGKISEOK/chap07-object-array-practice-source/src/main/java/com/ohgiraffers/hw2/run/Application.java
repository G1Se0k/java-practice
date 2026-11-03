package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        StudentDTO[] students = new StudentDTO[10];

        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while(count < 11){
            System.out.println("======== " + count + "번째 학생의 정보를 입력하세요. ========");

            System.out.print("학년 : ");
            int grade = sc.nextInt();
            sc.nextLine();

            System.out.print("반 : ");
            int classroom = sc.nextInt();
            sc.nextLine();

            System.out.print("이름 : ");
            String name = sc.nextLine();

            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            sc.nextLine();

            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            sc.nextLine();

            System.out.print("수학점수 : ");
            int math = sc.nextInt();
            sc.nextLine();

            // 한 명씩 추가 될 때마다 카운트함
            students[count - 1] = new StudentDTO(grade, classroom, name, kor, eng, math);
            count++;

            // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
            System.out.println("계속해서 입력하시겠습니까?");
            System.out.print("계속하시려면 y, 중단하려면 아무 문자나 입력하세요. : ");
            char input = sc.next().charAt(0);
            sc.nextLine();

            if(!(input == 'Y' || input == 'y')) {
                count--;
                break;
            }

        }
        // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        int korSum = 0;
        int engSum = 0;
        int mathSum = 0;

        for(int i = 0; i < count ;i++){
            korSum += students[i].getKor();
            engSum += students[i].getEng();
            mathSum += students[i].getMath();
        }

        int korAvg = korSum / count;
        int engAvg = engSum / count;
        int mathAvg = mathSum / count;

        // 학생들의 정보를 모두 출력 (평균 포함)
        for(int i = 0; i < count ;i++){
            System.out.println(students[i].information());
        }

        System.out.println();
        System.out.println("국어 평균 : " + korAvg);
        System.out.println("영어 평균 : " + engAvg);
        System.out.println("수학 평균 : " + mathAvg);
    }
}
