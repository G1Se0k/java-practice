package com.ohgiraffers.section01.level01.basic;

import java.util.Arrays;

public class Application1 {

    public static void main(String[] args) {

        /* 길이가 10인 정수형 배열을 선언 및 할당한 뒤
         * 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요
         * */
<<<<<<< HEAD
        int[] arr = new int[10];
        for (int i = 0; i<arr.length;i++){
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));

=======
        int[] iarr = new int[10];
        for (int j = 0; j < 10; j++) {
            iarr[j] = j + 1;
        }

        for (int j = 0; j < 10; j++) {
            System.out.println(iarr[j]);
        }
>>>>>>> c85367464bc7af9540933cf30f6871f7ee618868
    }
}
