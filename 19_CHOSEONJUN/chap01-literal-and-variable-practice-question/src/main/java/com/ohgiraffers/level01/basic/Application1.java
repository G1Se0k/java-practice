package com.ohgiraffers.level01.basic;

public class Application1 {

    public static void main(String[] args) {

        /* 정수형 변수 2개를 선언하여  각 20과 30으로 초기화 한 후
         * 두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요
         *
         * -- 출력 예시 --
         * 더하기 결과  : 50
         * 빼기 결과 : -10
         * 곱하기 결과 : 600
         * 나누기한 몫 : 0
         * 나누기한 나머지 : 20
         * */
        int num1 = 20, num2 = 30;
        System.out.println("더하기 결과: " + (num1 + num2));
        System.out.println("빼기 결과: " + (num1 - num2));
        System.out.println("곱하기 결과: " + (num1 * num2));
        System.out.println("나누기한 몫: " + (num1 / num2));
        System.out.println("나누기한 나머지: " + (num1 % num2));
        test();
    }

    public static void test() {
        int first = 20, second = 30;
        int plus = first + second;
        int minus = first - second;
        int multi = first * second;
        int div = first / second;
        int mod = first % second;
        System.out.println("plus = " + plus);
        System.out.println("minus = " + minus);
        System.out.println("multi = " + multi);
        System.out.println("div = " + div);
        System.out.println("mod = " + mod);

    }

}
