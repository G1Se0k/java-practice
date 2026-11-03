package com.ohgiraffers.level01.basic.pair.run;

import com.ohgiraffers.level01.basic.pair.model.Pair;

public class Application {
    public static void main(String[] args) {
        Pair<String,Integer> val1 = new Pair<>("국어",90);
        System.out.println(val1);
        Pair<Integer, String> val2 = new Pair<>(1,"일등");
        System.out.println(val2);
        Pair<String, Boolean> val3 = new Pair<>("출석" ,true);
        System.out.println(val3);
        System.out.println("국어 점수 + 5 = " + (val1.getValue() + 5));



    }
}
