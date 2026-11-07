package com.ohgiraffers.level01.basic.season.run;

import com.ohgiraffers.level01.basic.season.model.Season;

public class Application {

    public static void main(String[] args) {

        Season[] seasons = Season.values();
        int idx = -1;

        for(int i = 0; i < seasons.length; i++) {
            System.out.println(i + " : " + seasons[i].name());
            if ("FALL".equals(seasons[i].name())) idx = i;
        }
        System.out.println("찾은 상수 : " + seasons[idx].name());
        System.out.println("FALL의 순서 : " + idx);
        System.out.println("FALL과 같은가 : " + (Season.FALL == seasons[idx]));
    }
}
