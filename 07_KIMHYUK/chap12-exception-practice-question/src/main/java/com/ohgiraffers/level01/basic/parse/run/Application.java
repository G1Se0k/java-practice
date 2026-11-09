package com.ohgiraffers.level01.basic.parse.run;

public class Application {

    public static void main(String[] args) {

        String[] arr = {"10","20","abc","4.5","10"};

        int sum = 0;
        int failCount = 0;

        for (String str : arr) {

            try {
                int num = Integer.parseInt(str);
                sum += num;

            } catch (NumberFormatException e) {
                System.out.println("변환 실패 : " + str);
                failCount++;
            }
        }
        System.out.println("합계 : " + sum);
        System.out.println("실패 건수 : " + failCount);
    }
}
