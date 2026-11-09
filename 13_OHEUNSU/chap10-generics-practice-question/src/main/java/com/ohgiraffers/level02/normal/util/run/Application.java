package com.ohgiraffers.level02.normal.util.run;

import java.util.Arrays;

import static com.ohgiraffers.level02.normal.util.model.ArrayUtil.*;

public class Application {

    public static void main(String[] args) {

        String[] strArr = {"가", "나", "다", "나"};
        Integer[] intArr = {3, 1, 3, 3};

        swap(strArr, 0, 2);
        System.out.println("바꾼 뒤 : " + Arrays.toString(strArr));
        System.out.println("\"나\" 개수 : " + count(strArr, "나"));
        System.out.println("마지막 : " + last(strArr));
        swap(intArr, 0, 3);
        System.out.println("바꾼 뒤 : " + Arrays.toString(intArr));
        System.out.println("3 개수 : " + count(intArr, 3));
        System.out.println("마지막 : " + last(intArr));
    }
}
