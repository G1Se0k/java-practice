package com.ohgiraffers.level02.normal.util.run;

import com.ohgiraffers.level02.normal.util.model.ArrayUtil;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        // 1. String 배열의 0번과 2번을 바꾸고 "나" 개수와 마지막 값을 출력한다
        String[] strArr = {"가", "나", "다", "나"};
        ArrayUtil util = new ArrayUtil();
        util.swap(strArr, 0, 2);
        System.out.println("바꾼 후 배열: " + Arrays.toString(strArr));
        System.out.println("\"나\"의 개수: " + util.count(strArr, "나"));
        System.out.println("마지막 값: " + util.last(strArr));

        // 2. Integer 배열의 0번과 3번을 바꾸고 3의 개수와 마지막 값을 출력한다
        Integer[] intArr = {3, 1, 3, 3};
        util.swap(intArr, 0, 3);
        System.out.println("바꾼 후 배열: " + Arrays.toString(intArr));
        System.out.println("3의 개수: " + util.count(intArr, 3));
        System.out.println("마지막 값: " + util.last(intArr));

    }
}
