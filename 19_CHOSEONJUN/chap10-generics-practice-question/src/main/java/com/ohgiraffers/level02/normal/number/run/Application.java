package com.ohgiraffers.level02.normal.number.run;

import com.ohgiraffers.level02.normal.number.model.NumberBox;

public class Application {

    public static void main(String[] args) {

        // 1. 정수 7과 5를 담은 NumberBox<Integer>를 만들어 합과 비교 결과를 출력한다
        NumberBox<Integer> inBox = new NumberBox<>(7, 5);
        System.out.println("정수 상자 합 : "+ inBox.sum());
        System.out.println( "첫 값이 더 큼 : "+ inBox.isFirstBigger());

        // 2. 실수 2.5와 1.25를 담은 NumberBox<Double>을 만들어 합과 비교 결과를 출력한다
        NumberBox<Double> doBOx = new NumberBox<>(2.5, 1.25);
        System.out.println("실수 상자 합 : " + doBOx.sum());
        System.out.println("첫 값이 더 큼 : "+ doBOx.isFirstBigger());
    }

//    정수 상자 합 : 12.0
//    첫 값이 더 큼 : true
//    실수 상자 합 : 3.75
//    첫 값이 더 큼 : true

}

