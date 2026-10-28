package com.ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /*
        * 나이를 입력 받아 입력받은 수가 13세 이하이면 "어린이"출력, 13세 초과 ~ 19세 이하이면 "청소년" 출력, 19세 초과 "성인"을 출력하세요.
        * 
        * 나이를 입력하세요 : 12
        * 
        * ---- 출력 ----
        * 어린이
        * 
        * 나이를 입력하세요 : 29
        * 성인
        * */

        Scanner sc =new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        if (age <= 13){
            System.out.println("어린이");
        }else if(age > 13 && age <= 19){
            System.out.println("청소년");
        } else if (age > 19) {
            System.out.println("성인");
        }
    }
}
