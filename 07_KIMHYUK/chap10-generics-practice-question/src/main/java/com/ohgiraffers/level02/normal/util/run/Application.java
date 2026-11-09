package com.ohgiraffers.level02.normal.util.run;

import com.ohgiraffers.level02.normal.util.model.ArrayUtil;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        String[] strArr = {"가", "나", "다", "나"};

        ArrayUtil.swap(strArr, 0 , 2);

        System.out.println("바꾼 뒤 : " + Arrays.toString(strArr));
        System.out.println("\"나\" 개수 : " + ArrayUtil.count(strArr, "나"));
        System.out.println("마지막 : " + ArrayUtil.last(strArr));

        Integer[] intArr = {1, 3, 3, 3};

        ArrayUtil.swap(intArr, 0, 3);

        System.out.println("바꾼 뒤 : " + Arrays.toString(intArr));
        System.out.println("3 개수 : " + ArrayUtil.count(intArr, 3));
        System.out.println("마지막 : " + ArrayUtil.last(intArr));
    }
}
