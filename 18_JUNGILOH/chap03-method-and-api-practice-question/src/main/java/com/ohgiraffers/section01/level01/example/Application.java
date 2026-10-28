package com.ohgiraffers.section01.level01.example;

import java.util.Scanner;

import static java.lang.Math.random;

public class Application {
    public static void main(String[] args) {
        ExampleTest exam = new ExampleTest();
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 :");
        int first = sc.nextInt();
        exam.evenOdd(first);

        System.out.print(("첫번째 숫자 :"));
        int firstNumber = sc.nextInt();
        System.out.print("두번쨰 숫자");
        int secondNumber = sc.nextInt();
        exam.findMax(firstNumber,secondNumber);

        int a = (int)(random()*10 +1);
        int b = (int)(random()*10 +1);
        exam.randomMathQuiz(a,b);

    }
}
