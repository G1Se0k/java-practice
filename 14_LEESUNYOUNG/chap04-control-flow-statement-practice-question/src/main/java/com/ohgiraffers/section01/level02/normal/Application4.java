package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;
import java.util.Random;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */
        Random random = new Random();
        int[] rarr = new int[6];
        int i = 0;
        while(i< rarr.length ){
            int number = random.nextInt(45)+1;
            boolean duplicate = false;
            for(int j = 0; j<i; j++){
                if(number == rarr[j]){
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate){
                rarr[i] = number;
                i++;
            }

        }
        Arrays.sort(rarr);
        System.out.println(Arrays.toString(rarr));

    }
}
