package com.ohgiraffers.level01.basic.pair.run;

import com.ohgiraffers.level01.basic.pair.model.Pair;

public class Application {
    public static void main(String[] args) {
        // 1. 키와 값의 타입이 다른 Pair 세 개를 만든다
        Pair<String, Integer> koreanScore = new Pair<>("국어", 90);
        Pair<Integer, String> rank = new Pair<>(1, "1등");
        Pair<String, Boolean> isPresent = new Pair<>("출석", true);

        // 2. 세 Pair를 출력한다
        System.out.println(koreanScore);
        System.out.println(rank);
        System.out.println(isPresent);

        // 3. 국어 점수를 꺼내 5를 더한 값을 출력한다
        System.out.println("국어 점수 + 5: " + (koreanScore.getValue() + 5));
    }
}
