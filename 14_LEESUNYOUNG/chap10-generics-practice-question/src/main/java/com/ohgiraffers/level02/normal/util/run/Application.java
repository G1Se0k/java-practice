package com.ohgiraffers.level02.normal.util.run;

import com.ohgiraffers.level02.normal.util.model.ArrayUtil;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        String[] str = {"가", "나", "다", "나"};
        Integer[] str2 = {3,1,3,3};
        ArrayUtil.swap(str,0,2);
        System.out.println("바꾼 뒤 : " + Arrays.toString(str));
        System.out.println("나 개수 : "+ ArrayUtil.count(str,"나"));
        System.out.println("마지막 : " + ArrayUtil.last(str));

        ArrayUtil.swap(str,0,3);

        System.out.println("바꾼 뒤 : " + Arrays.toString(str2));

        System.out.println("나 개수 : "+ ArrayUtil.count(str2,3));

        System.out.println("마지막 : " + ArrayUtil.last(str2));

    }
}
