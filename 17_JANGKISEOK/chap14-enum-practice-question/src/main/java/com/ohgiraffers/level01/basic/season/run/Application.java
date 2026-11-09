package com.ohgiraffers.level01.basic.season.run;

import com.ohgiraffers.level01.basic.season.model.Season;

public class Application {
    public static void main(String[] args) {
        // 1. 모든 상수의 순서와 이름을 선언 순서대로 출력한다
        for(int i=0;i< Season.values().length;i++){
            System.out.println(i + " : " + Season.values()[i].name());
        }
        // 2. 문자열 FALL로 상수를 찾아 이름과 순서를 출력한다
        for(int i=0;i< Season.values().length;i++){
            if (Season.values()[i].name().equals("FALL")){
                System.out.println("찾은 상수 : " + Season.values()[i].name());
                System.out.println(Season.values()[i].name() + "의 순서 : " + i);
                // 3. 찾은 상수가 Season.FALL과 같은지 출력한다
                System.out.println("FALL과 같은가 : " + (Season.FALL == Season.values()[i]));
            }
        }
    }
}
