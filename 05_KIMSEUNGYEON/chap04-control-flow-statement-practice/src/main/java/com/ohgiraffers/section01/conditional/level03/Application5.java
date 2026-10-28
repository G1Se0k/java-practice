package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /*
        * 정수 하나를 입력받아서 아래와 같은 출력값을 출력하시오.
        *
        *
        * 정수하나를 입력하세요 : 5
        *         1 x 8 + 1 = 9
        *        12 x 8 + 2 = 98
        *       123 x 8 + 3 = 987
        *      1234 x 8 + 4 = 9876
        *     12345 x 8 + 5 = 98765
        *
        *  정수하나를 입력하세요 : 9
        *             1 x 8 + 1 = 9
        *            12 x 8 + 2 = 98
        *           123 x 8 + 3 = 987
        *          1234 x 8 + 4 = 9876
        *         12345 x 8 + 5 = 98765
        *        123456 x 8 + 6 = 987654
        *       1234567 x 8 + 7 = 9876543
        *      12345678 x 8 + 8 = 98765432
        *     123456789 x 8 + 9 = 987654321
        *
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수하나를 입력하세요 : ");
        int num = sc.nextInt();

        if (num < 1 || num > 9) {
            System.out.println("1~9 사이의 정수를 입력해야 합니다.");
            return;
        }
        // StingBuilder를 사용하여 왼쪽과 오른쪽 값을 생성하고 출력하는 방법
        /*for(int i = 1; i <= num; i++) {
            StringBuilder leftSide = new StringBuilder();
            StringBuilder rightSide = new StringBuilder();

            for(int j = 1; j <= i; j++) {
                leftSide.append(j);
                rightSide.append(j);
            }

//            rightSide.append(new StringBuilder(leftSide).reverse());
            int leftValue = Integer.parseInt(leftSide.toString());
            int rightValue = Integer.parseInt(rightSide.toString())*8+i;

            System.out.printf("%" + (num + 1) + "d x 8 + %d = %d%n", leftValue, i, rightValue);
        }*/

        // 반복/조건문만을 사용하여 왼쪽과 오른쪽 값을 생성하고 출력하는 방법 추가
        String leftSide = "";
        String rightSide = "";
        for(int i = 1; i <= num; i++) {
            leftSide += i;
            rightSide += i;
            System.out.println(Application5.printWhiteSpace(num, i) + leftSide + " x 8 + " + i + " = " + (Integer.parseInt(rightSide) * 8 + i));
        }
    }

    public static String printWhiteSpace(int inputNum, int flowNum) {
        String result = "";
        for(int i = 1; i <= inputNum - flowNum; i++) {
            result += " ";
        }
        return result;
    }
}
