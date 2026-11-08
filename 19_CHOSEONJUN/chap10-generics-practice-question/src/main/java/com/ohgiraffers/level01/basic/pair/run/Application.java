package com.ohgiraffers.level01.basic.pair.run;

import com.ohgiraffers.level01.basic.pair.model.Pair;

public class Application {
    public static void main(String[] args) {

        Pair<String, Integer> pairMap = new Pair<>("국어", 90);
        Pair<Integer, String> pairMap2 = new Pair<>(1, "일등");
        Pair<String, Boolean> pairMap3 = new Pair<>("출석", true);

        Pair<Object, Object>[] pairArr = new Pair[]{pairMap, pairMap2, pairMap3};

        for (int i = 0; i < pairArr.length; i++) {
            System.out.println(pairArr[i].toString());
        }
        System.out.println("국어 점수 : " + ((Integer)pairArr[0].getValue() + 5));
    }
}
//(국어, 90)
//(1, 일등)
//(출석, true)
//국어 점수 + 5 = 95
