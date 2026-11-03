package com.ohgiraffers.level01.basic.pair.run;

import com.ohgiraffers.level01.basic.pair.model.Pair;

public class Application {
    public static void main(String[] args) {
        // 1. 키와 값의 타입이 다른 Pair 세 개를 만든다
        Pair<String, Integer> pair1 = new Pair<>("국어", 90);
        Pair<Integer, String> pair2 = new Pair<>(1, "일등");
        Pair<String, Boolean> pair3 = new Pair<>("출석", true);
        // 2. 세 Pair를 출력한다
        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);
        // 3. 국어 점수를 꺼내 5를 더한 값을 출력한다
        System.out.println("국어 점수 + 5 = " + (pair1.getValue() + 5));

    }
}