package com.ohgiraffers.level01.basic.pair.run;

import com.ohgiraffers.level01.basic.pair.model.Pair;

public class Application {

    public static void main(String[] args) {

        Pair<String, Integer> pairSI = new Pair<>("국어", 90);
        Pair<Integer, String> pairIS = new Pair<>(1, "일등");
        Pair<String, Boolean> pairSB = new Pair<>("출석", true);

        System.out.println(pairSI);
        System.out.println(pairIS);
        System.out.println(pairSB);

        System.out.println(pairSI.getKey() + " 점수 + 5 = " + (pairSI.getValue() + 5));
    }
}
