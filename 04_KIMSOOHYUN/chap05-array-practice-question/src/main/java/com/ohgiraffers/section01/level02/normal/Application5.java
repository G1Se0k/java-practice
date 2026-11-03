package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /*
         * 문자열을 입력받아 문자 하나하나를 배열에 넣고 검색할 문자가
         * 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지
         * 인덱스를 출력하세요.
         *
         * ex.
         *	문자열 : application
         *	문자 : i
         *	application에 i가 존재하는 위치(인덱스) : 4 8
         *	i 개수 : 2
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 : ");
        char[] arr = sc.nextLine().toCharArray();
        System.out.println("문자 : ");
        char character = sc.next().charAt(0);

        int save;
        System.out.print("application에 i가 존재하는 위치(인덱스) : ");
        for (int i = 0; i < arr.length; i++) {
            if (character == arr[i]) {
                save = i;
                System.out.print(save + " ");
            } else if (character != arr[i]) {
                continue;
            }
        }
        System.out.println(" ");

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == character) {
                count++;
            }
        }
        System.out.println("i 개수 : " + count);

            // 반복문 돌려서 i랑 일치하면 멈춘다.
            // i랑 같으면 몇번인지 기억한다.
            // 총 몇개인지 기억한다.
            // 출력한다.


    }
}
