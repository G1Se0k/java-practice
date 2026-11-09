package com.ohgiraffers.level02.normal.util.model;

public class ArrayUtil {


    public static  <T> void swap(T[]arr, int i, int j) {
        //배열의 i번 칸과 j번 칸의 값을 서로 바꾼다. 반환값과 출력은 없다.
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static  <T> int count(T[] arr, T target) {
        //배열에서 target과 같은 값이 몇 개인지 반환한다. 같은지는 equals로 비교한다.
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target))
                count++;
        }
        return count;
    }

    public static  <T> T last(T[] arr) {
        //배열의 마지막 값을 반환한다.
        int index = arr.length - 1;
        return arr[index];
    }


}
