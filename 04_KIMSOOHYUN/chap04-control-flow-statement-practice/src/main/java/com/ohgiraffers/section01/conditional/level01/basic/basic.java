package com.ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;

public class basic {

    public void plusNumber() {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 하나 입력하세요 : ");

        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("양수다.");
        } else {
                System.out.println("양수가 아니다.");
            }
    }

    public void oddNumber() {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 하나 입력하세요 : ");

        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("짝수다.");
            } else if (num % 2 == 1) {
                    System.out.println("홀수다.");
                }
        }
    }

    public void personalNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호를 입력해주세요(- 포함) :");
        String num = sc.next();

        char gender = num.charAt(7);
        if(gender == '1' || gender == '3') {
            System.out.println("남자 입니다.");
        } else if (gender == '2' || gender == '4') {
            System.out.println("여자 입니다.");
        }
    }

    public void ageTest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요 :");

        int num = sc.nextInt();

        if(num <= 13) {
            System.out.println("어린이");
        } else if (num <= 19) {
            System.out.println("청소년");
        } else {
            System.out.println("성인");
        }
    }

    public void candyCount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("인원 수 : ");
        int pnum = sc.nextInt();
        System.out.println("사탕 개수 : ");
        int cnum = sc.nextInt();

        if(cnum > 0) {
            int presult = cnum / pnum;
            System.out.println("1인당 사탕 개수 : " + presult);
            int cresult = cnum % pnum;
            System.out.println("남는 사탕 개수 : " + cresult);
        }


    }

}
