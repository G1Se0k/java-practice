package com.ohgiraffers.level01.basic.season.run;

import com.ohgiraffers.level01.basic.season.model.Season;

public class Application {

    public static void main(String[] args) {

        Season[] seasons = Season.values();

        for (int i = 0; i < seasons.length; i++) {
            System.out.println(i + " : " + seasons[i]);
        }

        Season target = Season.valueOf("FALL");
        System.out.println("찾은 상수 : " + target);
        System.out.println("FALL의 순서 : " + target.ordinal());

        System.out.println("FALL과 같은가 : " + (target == Season.FALL));
    }
}
