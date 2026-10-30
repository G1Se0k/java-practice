package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;
import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */

        int[] arr = new int[6];
        int count = 0;
        boolean countBoolean = false;
        while (count < arr.length) {
            int random = (int) (Math.random() * 45) + 1;
            //검색
            for (int i : arr) {
                if (i == 0 || i != random) {
                    countBoolean = true;
                }
            }
            if (countBoolean) {
                arr[count] = random;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        //오름차순
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
