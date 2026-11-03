package com.ohgiraffers.section01.level01.normal;

public class RandomMaker {
    // 기능형 클래스
    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : tossCoin
     *
     * 동전 앞/뒤 중에 하나를 출력
     * (앞면,뒷면은 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 앞면
     *
     * */

    public static String tossCoin() {

        int randomInt = (int)(Math.random() * 2); // 0, 1

        if (randomInt == 0) {
            System.out.println("앞면");
        } else {
            System.out.println("뒷면");
        }

        return "";
    }


}
