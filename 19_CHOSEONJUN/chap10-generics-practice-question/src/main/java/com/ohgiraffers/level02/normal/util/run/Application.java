package com.ohgiraffers.level02.normal.util.run;

import com.ohgiraffers.level02.normal.util.model.ArrayUtil;

import java.util.Arrays;

public class Application {


    public static void main(String[] args) {
        // 1. String 배열의 0번과 2번을 바꾸고 "나" 개수와 마지막 값을 출력한다
        String[] strArr = {"가", "나", "다", "나"};
        ArrayUtil.swap(strArr, 0, 2);
        System.out.println(Arrays.toString(strArr));
        System.out.println(ArrayUtil.count(strArr, "나"));
        System.out.println(ArrayUtil.last(strArr));

        // 2. Integer 배열의 0번과 3번을 바꾸고 3의 개수와 마지막 값을 출력한다
        Integer[] inArr = {3, 1, 3, 3};
        ArrayUtil.swap(inArr, 0, 3);
        System.out.println(Arrays.toString(inArr));
        System.out.println(ArrayUtil.count(inArr, 3));
        System.out.println(ArrayUtil.last(inArr));
//        바꾼 뒤 : [다, 나, 가, 나]
//        "나" 개수 : 2
//        마지막 : 나
//        바꾼 뒤 : [3, 1, 3, 3]
//        3 개수 : 3
//        마지막 : 3
    }
}
