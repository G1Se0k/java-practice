package com.ohgiraffers.level02.normal.util.model;

public class ArrayUtil {

    public <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public <T> int count(T[] arr, T target) {
        int count = 0;
        for (T item : arr) {
            if (item.equals(target)) {
                count++;
            }
        }
        return count;
    }

    public <T> T last(T[] arr) {
        return arr[arr.length - 1];
    }

}
