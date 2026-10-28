package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* 임의의 숫자를 입력받아 해당 계절을 출력해주세요
         * 단, 1~12사이의 숫자가 아닌 값이 들어는것은 "잘못입력하셨습니다"를 출력
         * 계절 구분
         * 봄 : 3월,4월,5월
         * 여름: 6월,7월,8월
         * 가을: 9월,10월,11월
         * 겨울: 12월,1월,2일
         *
         * -----  출력 -----
         * 숫자를 입력하세요 : 1
         * 겨울
         * */


        Scanner sc = new Scanner(System.in);
        System.out.println("1~12사이 정수 입력 : ");
        int month = sc.nextInt();
        if (month >= 1 && month <= 12) {
            if(month / 3 == 1) {
                System.out.println("봄");
            } else if (month / 2 == 2) {
                System.out.println("여름");
            } else if (month / 3 == 3) {
                System.out.println("가을");
            } else {
                System.out.println("겨울");
            }
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

//        Scanner sc = new Scanner(System.in);
//        System.out.print("1 ~ 12 사이 정수 입력 : ");
//        int num = sc.nextInt();
//        String season = "";     // 계절을 담은 변수 선언
//        switch (num) {
//            case 12:
//            case 1:
//            case 2:
//                season = "겨울"; break;
//            case 3:
//            case 4:
//            case 5:
//                season = "봄"; break;
//            case 6:
//            case 7:
//            case 8:
//                season = "가을"; break;
//            case 9:
//            case 10:
//            case 11:
//                season = "가을"; break;
//                default:
//                    System.out.println("잘못된값");
//        }
//        System.out.println(season);
    }
}
