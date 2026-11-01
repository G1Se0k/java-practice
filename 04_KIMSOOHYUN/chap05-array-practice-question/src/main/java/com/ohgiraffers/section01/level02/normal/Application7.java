package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;

public class Application7 {         // 헷갈림

    public static void main(String[] args) {

        /*
         * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
         * 1 ~ 10사이의 난수를 발생시켜 배열에 초기화 후
         * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요
         *
         * ex.
         * 5 3 2 7 4 8 6 10 9 10
         * 최대값 : 10
         * 최소값 : 2
         * */

        int num[] = new int[10];

        for (int i = 0; i < num.length; i++) {
//            System.out.println((Math.random() * 10) + 1);
            num[i] = (int) (Math.random() * 10) + 1;
            System.out.print(num[i] + " ");
            }

        int min = num[0];
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
                if (num[i] < max) {
                    max = num[i];
                }
                if (num[i] > min) {
                    min = num[i];
                }
            }
        System.out.println(" ");
        System.out.println("최대값: " + max);
        System.out.println("최소값 : " + min);
    }
}

    // 최대값 : 0번째 1번째 계속 비교해서 더 높은 값을 저장한다?
//            for (int j = i + 1; j < num.length; j++) {
//                if (num[i] < num[j]) {
//                    save = num[i];
//                    num[i] = num[j];
//                    num[j] = save;
//                    min = num[j];
//                }