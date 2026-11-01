package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application4 { // 어렵다

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */

        int arr[] = new int[6];
        int none;
        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {              // 0에서 5까지
            arr[i] = (int) (Math.random() * 45) + 1;        // 뽑기
            for (int j = 0; j < i; j++) {                   // 0의 숫자와 0+1의 숫자 중복 검사 i가 0이면 j는 0그대로라 실행안됨
                if (arr[i] == arr[j]) {
                    flag = false;
                    i--;    // 없었던 일로? 1의 값이 50인데 0으로 돌아감 그담에 break을 쓰면 어케되는거?
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {      // 0에서 5까지
            for (int j = i + 1; j < arr.length; j++) {      //1에서 5까지
                if (arr[i] > arr[j]) {              // 정렬
                    flag = true;
                    none = arr[i];
                    arr[i] = arr[j];
                    arr[j] = none;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {      //출력
            System.out.print(arr[i] + " ");
        }
    }
}
//            if(n < n + 1) {
//                n = n + 1;
//                언제까지? arr.length 끝날때까지
//            }
//                if (arr[i] == arr[n]) {
//                    arr[i] += 1;
//                }
//        if (arr[i] < arr[n]) {      // 1.40 < 2.30
////                flag = true;
//            arr2[0] = arr[i];              // a.'40' = 1.40
//            arr[i] = arr[n];        // 1. '30'  = 2. 30
//            arr[n] = arr2[0];       // 2. '40'   = a. 40
//            n++;
//            if(n < arr.length) {break;}
//        } else if (arr[i] >= arr[n]) {
////                flag = false;
//        }


