package com.ohgiraffers.level01.basic.shirt.run;

import com.ohgiraffers.level01.basic.shirt.model.ShirtCode;
import com.ohgiraffers.level01.basic.shirt.model.ShirtSize;

import static com.ohgiraffers.level01.basic.shirt.model.ShirtCode.COLOR_RED;
import static com.ohgiraffers.level01.basic.shirt.model.ShirtCode.SIZE_SMALL;

public class Application {

    public static void main(String[] args) {

        System.out.println("정수 상수 비교 : " + (SIZE_SMALL == COLOR_RED));

        System.out.println("SMALL과 SMALL : " + isSameSize(ShirtSize.SMALL, ShirtSize.SMALL));
        System.out.println("SMALL과 LARGE : " + isSameSize(ShirtSize.SMALL, ShirtSize.LARGE));

        for (ShirtSize size : ShirtSize.values()) {
            System.out.println("크기 : " + size);
        }
    }

    private static boolean isSameSize(ShirtSize a, ShirtSize b) {
        return a == b;
    }
}
