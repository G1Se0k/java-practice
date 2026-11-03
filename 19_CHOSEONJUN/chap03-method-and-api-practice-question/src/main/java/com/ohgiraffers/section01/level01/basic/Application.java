package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.checkMethod();
        int first = 10;
        int second = 20;
        String str1 = calculator.sumTwoNumber(first, second);
        System.out.println(str1);
        String str2 = calculator.multiTwoNumber(first, second);
        System.out.println(str2);
        int result = calculator.multiTwoNumber2(first, second);
        System.out.println(first + "과 " + second + "의 곱은 " + result + "입니다");

        test();
    }

    public static void test() {
        Calculator calculator = new Calculator();
        calculator.checkMethod2();
        int first = 10, second = 20;
        String result = calculator.sumTwoNumber2(first, second);
        System.out.println("result = " + result);
        String result2 = calculator.multiTwoNumber22(first, second);
        System.out.println("result2 = " + result2);
        Integer result3 = calculator.multiTwoNumber222(first, second);
        System.out.println("result3 = " + result3);


    }
}
