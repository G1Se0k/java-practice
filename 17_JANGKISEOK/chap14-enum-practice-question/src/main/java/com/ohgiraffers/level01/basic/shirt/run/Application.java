package com.ohgiraffers.level01.basic.shirt.run;

import com.ohgiraffers.level01.basic.shirt.model.ShirtCode;
import com.ohgiraffers.level01.basic.shirt.model.ShirtSize;

public class Application {
    public static void main(String[] args) {
        // 1. 크기 정수 상수와 색상 정수 상수를 ==로 비교해 출력한다
        System.out.println("정수 상수 비교 : " + (ShirtCode.SIZE_SMALL == ShirtCode.COLOR_RED));
        // 2. isSameSize로 enum 상수를 비교해 출력한다
        System.out.println("SMALL과 SMALL : " + isSameSize(ShirtSize.SMALL, ShirtSize.SMALL));
        System.out.println("SMALL과 LARGE : " + isSameSize(ShirtSize.SMALL, ShirtSize.LARGE));
        // 3. 모든 크기를 선언 순서대로 출력한다
        for(ShirtSize shirtSize : ShirtSize.values()){
            System.out.println("크기 : " + shirtSize);
        }
    }
    private static boolean isSameSize(ShirtSize a, ShirtSize b){
        return a==b;
    }
}
