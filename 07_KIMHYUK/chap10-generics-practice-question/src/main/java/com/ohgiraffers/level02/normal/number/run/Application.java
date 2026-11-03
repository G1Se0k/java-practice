package com.ohgiraffers.level02.normal.number.run;

import com.ohgiraffers.level02.normal.number.model.NumberBox;

public class Application {

    public static void main(String[] args) {

        NumberBox<Integer> intBox = new NumberBox<>(7, 5);

        System.out.println("정수 상자 합 : " + intBox.sum());
        System.out.println("첫 값이 더 큼 : "+ intBox.isFirstBigger());

        NumberBox<Double> doubleBox = new NumberBox<>(2.5, 1.25);

        System.out.println("실수 상자 합 : " + doubleBox.sum());
        System.out.println("첫 값이 더 큼 : "+ doubleBox.isFirstBigger());
    }
}
