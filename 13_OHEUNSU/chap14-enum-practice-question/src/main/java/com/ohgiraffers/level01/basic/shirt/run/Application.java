package com.ohgiraffers.level01.basic.shirt.run;

import com.ohgiraffers.level01.basic.shirt.model.ShirtCode;
import com.ohgiraffers.level01.basic.shirt.model.ShirtSize;

public class Application {

    public static void main(String[] args) {

        System.out.println("정수 상수 비교 : " + (ShirtCode.SIZE_SMALL == ShirtCode.COLOR_RED));
        System.out.println("SMALL과 SMALL : " + (ShirtSize.SMALL == ShirtSize.SMALL));
        System.out.println("SMALL과 LARGE : " + (ShirtSize.SMALL == ShirtSize.LARGE));
        for(Enum size: ShirtSize.values()) System.out.println("크기 : " + size.toString());
    }

    private static boolean isSameSize(ShirtSize a, ShirtSize b){
        return a == b;
    }
}
