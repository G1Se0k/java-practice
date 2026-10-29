package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */

        System.out.println("=====로또 번호 자동 생성기======");
        int[] array = new int[7];
        for (int i = 0; i < 7; i++) {
            array[i] = (int)(Math.random()*46+1);
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    System.out.println("----중복! 재추첨------");
                    i--;
                    break;
                }
            }
        }

        Arrays.sort(array);
        System.out.print(Arrays.toString(array));
    }
}
