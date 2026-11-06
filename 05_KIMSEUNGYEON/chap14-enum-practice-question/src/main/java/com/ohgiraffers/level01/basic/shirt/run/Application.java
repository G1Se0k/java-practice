package com.ohgiraffers.level01.basic.shirt.run;

import com.ohgiraffers.level01.basic.shirt.model.ShirtCode;
import com.ohgiraffers.level01.basic.shirt.model.ShirtSize;

public class Application {

    public static void main(String[] args) {

        // 1. 크기 정수 상수와 색상 정수 상수를 ==로 비교해 출력한다
        System.out.print("정수 상수 비교 : ");
        System.out.println(ShirtCode.COLOR_RED == ShirtCode.SIZE_SMALL);

        // 2. isSameSize로 enum 상수를 비교해 출력한다
        System.out.print("SMALL 과 SMALL 비교 : ");
        System.out.println(isSameSize(ShirtSize.SMALL, ShirtSize.SMALL));
        System.out.print("SMALL 과 LARGE 비교 : ");
        System.out.println(isSameSize(ShirtSize.SMALL, ShirtSize.LARGE));

        // 3. 모든 크기를 선언 순서대로 출력한다
        for(int i = 0; i < ShirtSize.values().length; i++) {
            System.out.println("크기 : " + ShirtSize.values()[i]);
        }
    }

    private static boolean isSameSize(ShirtSize a, ShirtSize b) {
        return a == b;
    }
}
