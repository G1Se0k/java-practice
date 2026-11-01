package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1******
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호를 입력하세요 :");
        char[] arr = sc.nextLine().toCharArray();

        for (int i = 9; i < arr.length; i++) {
            arr[i] = '*';
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        // 8번째부터 ******로 표기

    }
}
