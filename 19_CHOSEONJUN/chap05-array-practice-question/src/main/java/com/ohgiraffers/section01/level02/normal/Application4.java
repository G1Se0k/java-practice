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
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void test1() {
        int[] lotto = new int[6];
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) { //[i] 인덱스 들어가면 >> [i] 인덱스 까지 (0~i번 까지 반복 검색)
                if (lotto[i] == lotto[j]) {
                    //lotto[i] = 대입
                    //[i] 인덱스 전 까지 비교.
                    i--; //카운트 빼서 >>  초기화(다시 원점 대입)
                    break; // 같은거 찾으면 >> 종료 >> 더 이상 비교(X)
                }
            }
        }
    }

    public static void test2() {
        int lotto[] = new int[6];
        lable:
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) { //j < i (자신 이전(인덱스) 검색
                if (lotto[i] == lotto[j]) {
                    i--; //>> 다시 원점 뽑기
                    continue lable;
                }
            }
        }
    }

    public static void sort(int[] lotto) {
        int temp = 0;
        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < lotto.length; j++) {
                if (lotto[i] < lotto[j]) {
                    temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }
    }

    public static void sort2(int[] lotto) {
        System.out.println(Arrays.toString(lotto));
        //오름차순
        for (int j = 0; j < lotto.length - 1; j++) {
            for (int i = 0; i < lotto.length - 1 - j; i++) {
                if (lotto[i] > lotto[i + 1]) {
                    int temp = lotto[i];
                    lotto[i] = lotto[i + 1];
                    lotto[i + 1] = temp;
                }
            }
        }
    }
}
