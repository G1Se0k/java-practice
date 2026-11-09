package com.ohgiraffers.level02.normal.number.run;

import com.ohgiraffers.level02.normal.number.model.NumberBox;

public class Application {
    public static void main(String[] args) {
        NumberBox<Integer> num1 = new NumberBox<>(7, 5);
        NumberBox<Double> num2 = new NumberBox<>(2.5, 1.25);

        System.out.println("정수 상자 합 : " + num1.sum());
        System.out.println("첫 값이 더 큼 : " + num1.isFirstBigger());
        System.out.println("실수 상자 합 : " + num2.sum());
        System.out.println("첫 값이 더 큼 : " + num2.isFirstBigger());

    }
}
