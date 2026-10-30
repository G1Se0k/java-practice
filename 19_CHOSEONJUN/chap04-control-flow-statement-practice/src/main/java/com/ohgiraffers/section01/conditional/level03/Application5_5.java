package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application5_5 {
    static void main(String[] args) {

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


        print();

    }

    public static void printSpaces(int nSpaces) {
        for (int i = 0; i < nSpaces; i++) {
            System.out.print("*");
        }
    }

    public static void print(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력하세요 : ");

        int num = sc.nextInt();
        int value = 0;

        for (int i = 1; i <= num; i++) {
            // 숫자를 왼쪽부터 하나씩 누적
            value = value * 10 + i;
            // 앞쪽 공백 출력
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // 계산 결과 출력
            System.out.println(value + " x 8 + " + i + " = " + (value * 8 + i));
        }
        sc.close();
    }

    public static void print2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("피라미드 높이를 입력하세요: ");
        int n = scanner.nextInt();

        // 전체 행 반복
        for (int i = 1; i <= n; i++) {
            // 1. 공백 출력 (역삼각형 모양으로 공백 찍기)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 2. 숫자 출력 (1부터 2*i - 1 개수만큼 홀수로 증가하거나 해당 숫자 출력)
            // 아래는 각 줄에 행 번호(i)를 출력하는 피라미드 예시입니다.
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(i); // 숫자를 다르게 찍으려면 k나 다른 변수를 활용할 수 있습니다.
            }
            // 줄바꿈
            System.out.println();
        }
        scanner.close();
    }
}
