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

        int size = 0;
        int[] lottoArr = new int[6];

        while(size<6){
            int now = random.nextInt(45)+1;
            int cnt = 0;

            for(int i:lottoArr){
                if(i==now) {
                    cnt ++;
                    break;
                }
            }

            if(cnt ==0) {
                lottoArr[size] = now;
                size++;
            }
        }

        Arrays.sort(lottoArr);
        System.out.println(Arrays.toString(lottoArr));


    }
}
