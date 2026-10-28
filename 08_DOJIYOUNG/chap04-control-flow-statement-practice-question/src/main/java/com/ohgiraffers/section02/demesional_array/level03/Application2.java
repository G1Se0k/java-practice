package com.ohgiraffers.section02.demesional_array.level03;

import java.util.Arrays;

public class Application2 {

    public static void main(String[] args) {

        /*
         * System.arraycopy를 사용하여 배열 복사 합치기
         * */

        int[] origin = new int[]{1,2,3,4,5,6,7};

        int[] copy = new int[20];
        System.arraycopy(origin,0,copy, 3, 3);

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));
    }
}
