package com.ohgiraffers.level01.basic.pair.run;

import com.ohgiraffers.level01.basic.pair.model.Pair;

public class Application {

    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("국어", 90);
        Pair<Integer, String> pair2 = new Pair<>(1, "일등");
        Pair<String, Boolean> pair3 = new Pair<>("출석", true);

        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);

        System.out.println("국어 점수 + 5 = " + (pair1.getValue() + 5));
    }
}
