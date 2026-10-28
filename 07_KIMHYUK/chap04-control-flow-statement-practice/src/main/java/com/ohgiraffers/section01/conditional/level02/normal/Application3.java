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

        System.out.println("1~12 중 숫자를 입력하세요 : ");
        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("잘못 입력하셨습니다");
        } else if (month >=3 && month <= 5) {
            System.out.println("봄");
        } else if (month >=6 && month <=8) {
            System.out.println("여름");
        } else if (month >=9 && month <=11) {
            System.out.println("가을");
        } else {
            System.out.println("겨울");
        }

    }
}
