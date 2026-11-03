package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.

        StudentDTO[] stud = new StudentDTO[10];

        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int count = 1;
        while (i < stud.length) {
            System.out.println("학생정보를 입력하세요.");
            System.out.println("학년 : ");
            int grade = sc.nextInt();
            System.out.println("반 : ");
            int classroom = sc.nextInt();
            System.out.println("이름 : ");
            String name = sc.next();
            System.out.println("국어점수 : ");
            int kor = sc.nextInt();
            System.out.println("영어점수 : ");
            int eng = sc.nextInt();
            System.out.println("수학점수 : ");
            int mat = sc.nextInt();
            sc.nextLine();

            stud[i] = new StudentDTO(grade, classroom, name, kor, eng, mat);
//            System.out.println(i + " : " + stud[i].information());

            // 한 명씩 추가 될 때마다 카운트함
            if (stud[i] != null) {
                count = i + 1;

            // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’ 이면 계속 객체 추가
                System.out.println("계속 추가하시겠습니까?");
                System.out.println("계속하기 : y | 평균출력 : n");
                char y = sc.nextLine().charAt(0);
                if (y == 'y' ||  y == 'Y') {
                    System.out.println("객체 추가됨 -> " + count);
                    i++;
                } else if  (y == 'n' || y == 'N') {
                    // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
                    // 현재 기록된 학생들의 각각의 점수 평균을 구함
                    // 학생들의 정보를 모두 출력 (평균 포함)
                    System.out.println("<현재 기록된 학생 평균 구하기>");
                    int[] sum;
                    sum = new int[count];
                    int[] avg;
                    avg = new int[count];
                    System.out.println("평균 포함 정보 출력 : ");
                    int zero = 0;
                    while (zero < count) {
                        i = zero;
                        sum[i] = stud[i].getKor() + stud[i].getEng() + stud[i].getMath();
                        avg[i] = sum[i] / 3;
                        System.out.println("학년 "+ "반  "+ "이름 "+ "국어 "+ "영어 "+ "수학"+ "평균" + stud[i].information() + "\t " + avg[i]);
                        zero++;
                    } break;
                } else {
                    System.out.println("y or n을 입력하시오!!");
                    System.out.println("======= 다시 처음으로 ========");
                    System.out.println(" ");
                    continue;
                }
            }
        }
    }
}


//학년 반 이름 국어점수 영어점수 수학점수
//1 5 홍길동 40 60 70
//2 1 김말똥 70 80 100
//3 3 강개순 100 75 86