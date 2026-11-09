package com.ohgiraffers.level02.normal.util.model;

public class ArrayUtil {

    public static <T> void swap(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static  <T> int count(T[] arr, T target){
        int cnt = 0;
        for(T t: arr){
            if(t.equals(target)) cnt++;
        }
        return cnt;
    }

    public static  <T> T last(T[] arr){
        return arr[arr.length - 1];
    }
}
