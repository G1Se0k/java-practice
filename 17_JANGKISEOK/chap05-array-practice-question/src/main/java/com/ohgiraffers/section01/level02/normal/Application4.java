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

        int[] lottoNumbers = new int[6];

        for(int i = 0; i< lottoNumbers.length;i++){
            lottoNumbers[i] = randomLottoNumber(lottoNumbers);
        }

        Arrays.sort(lottoNumbers);
        System.out.println("========== 이번 주 로또 번호 ==========");
        for (int i : lottoNumbers){
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static int randomLottoNumber(int[] baseArray){
        Random rand = new Random();
        int randNum = rand.nextInt(1,46);

        boolean isContains = false;
        for(int i : baseArray){
            if (i == randNum){
                isContains = true;
                break;
            }
        }

        if (isContains){
            randNum = randomLottoNumber(baseArray);
        }
        return randNum;
    }
}
