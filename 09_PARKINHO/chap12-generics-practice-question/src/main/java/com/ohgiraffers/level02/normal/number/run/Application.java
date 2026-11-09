package com.ohgiraffers.level02.normal.number.run;

import com.ohgiraffers.level02.normal.number.model.NumberBox;

public class Application {
    public static void main(String[] args) {

        // 1. 정수 7과 5를 담은 NumberBox<Integer>를 만들어 합과 비교 결과를 출력한다
        NumberBox<Integer> integerNumberBox = new NumberBox<>(7, 5);
        System.out.println("정수 상자 합 : " + integerNumberBox.sum());
        System.out.println("첫 값이 더 큼 : " + integerNumberBox.isFirstBigger());

        // 2. 실수 2.5와 1.25를 담은 NumberBox<Double>을 만들어 합과 비교 결과를 출력한다
        NumberBox<Double> doubleNumberBox = new NumberBox<>(2.5, 1.25);
        System.out.println("실수 상자 합 : " + doubleNumberBox.sum());
        System.out.println("첫 값이 더 큼 : " + doubleNumberBox.isFirstBigger());

    }
}
