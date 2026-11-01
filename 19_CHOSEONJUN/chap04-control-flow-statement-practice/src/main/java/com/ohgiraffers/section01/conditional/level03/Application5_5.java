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


        print2();

    }

    public static void printSpaces(int nSpaces) {
        for (int i = 0; i < nSpaces; i++) {
            System.out.print("*");
        }
    }

    public static void print() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력하세요: ");
        int num = sc.nextInt();
        int left = 0;   // 왼쪽 숫자: 1, 12, 123, ...
        int right = 0;  // 오른쪽 결과: 9, 98, 987, ...
        for (int i = 1; i <= num; i++) {
            // 왼쪽 숫자 만들기
            // 0 * 10 + 1 = 1(value)
            // 1 * 10 + 2 = 12(value)
            // 12 * 10 + 3 = 123(value)
            // 123 * 10 +4 = 1234
            left = left * 10 + i;
            // 오른쪽 결과 계산하기
            right = left * 8 + i;
            for (int j = 1; j <= num - i; j++) { // 앞쪽 공백 출력
                System.out.print(" "); // 첫 문장 출력 >> 범위 num - i(1)
            }
            // 12 * 8 + 2
            // 123 * 8 + 3
            System.out.println(left + " x 8 + " + i + " = " + right);
        }
        sc.close();
    }

    public static void print2() {
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
