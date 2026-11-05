package com.ohgiraffers.level01.basic.parse.run;

public class Application {

    public static void main(String[] args) {

        String[] strArr = {"10", "abc", "30", "4.5"};
        int sumInt = 0;
        int cntFail = 0;

        for(String str: strArr){
            try {
                sumInt += Integer.parseInt(str);
            } catch (NumberFormatException e) {
                cntFail++;
                System.out.println("변환 실패 : " + str);
            }
        }
        System.out.println("합계 : " + sumInt);
        System.out.println("실패 건수 : " + cntFail);

    }
}
