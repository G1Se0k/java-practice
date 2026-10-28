package com.ohgiraffers.section01.level01.example;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력하세요: ");
        evenOdd(scanner.nextInt());
        System.out.print("두 수를 입력하세요.");
        findMax(scanner.nextInt(), scanner.nextInt());
        int randomNum1 = (int) (Math.random() * 10) +1;
        int randomNum2 = (int) (Math.random() * 10) +1;
        System.out.println(randomNum1 + " " +randomNum2);
        randomMathQuiz(randomNum1, randomNum2);
    }

    public static void evenOdd(int value) {
        System.out.println("입력 값: " + value);
        String string = (value % 2 == 0) ? "짝수입니다" : "홀수입니다";
        System.out.println(string);
    }

    public static void findMax(int first, int second) {
        int max = (first > second) ? first : second;
        System.out.println("더 큰 수: " + max);
    }
    public static void randomMathQuiz(int num1, int num2){
        System.out.print(num1 + "+"+ num2 + "= ? ");
        Scanner scanner =  new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("입력값: " + number);
        System.out.println((number == (num1 + num2))? "정답입니다": "틀렸습니다" +" 정답은 " + (num1+ num2) +"입니다");
    }
}
