package com.ohgiraffers.section01.level01.example;

public class Application {

    public static void main(String[] args) {


        ExampleTest exam = new ExampleTest();

        int randomNum1 = (int) (Math.random() * 10) + 1;
        int randomNum2 = (int) (Math.random() * 10) + 1;
        exam.randomMathQuiz(randomNum1, randomNum2);

    }
}
