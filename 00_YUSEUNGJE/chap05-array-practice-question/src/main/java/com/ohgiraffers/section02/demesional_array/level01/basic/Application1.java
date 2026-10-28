package com.ohgiraffers.section02.demesional_array.level01.basic;

public class Application1 {

    public static void main(String[] args) {

        /* 행의 길이가 3, 열의 길이가 4인 정수형 2차원 배열을 선언 및 할당하고,
         * 각 인덱스에 차례대로 1부터 12까지의 정수를 대입한 뒤
         * 그 값을 출력하는 코드를 작성하시오.
         *
         * -- 출력 예시 --
         * 1  2  3  4
         * 5  6  7  8
         * 9 10 11 12
         *
         * 단, 출력물의 줄맞춤은 신경쓰지 말고 풀어보세요
         * */
        int iarr[][] = new int[3][4];

        int su = 1;
        for(int i = 0; i < iarr.length; i++) {
            for(int j = 0; j < iarr[i].length; j++) {
                iarr[i][j] = su++;
            }
        }

        for(int i = 0; i < iarr.length; i++) {
            for(int j = 0; j < iarr[i].length; j++) {
                System.out.print(iarr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
