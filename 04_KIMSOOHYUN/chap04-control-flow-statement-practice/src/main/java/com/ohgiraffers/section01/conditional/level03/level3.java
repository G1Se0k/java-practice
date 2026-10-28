package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class level3 {

    public void calculator() {

            Scanner sc = new Scanner(System.in);
            System.out.print("첫 번째 정수 : ");
            int first = sc.nextInt();
            System.out.print("두 번째 정수 : ");
            int second = sc.nextInt();
            System.out.print("연산 기호를 입력하세요 : ");
            char giho = sc.next().charAt(0);

            int result = switch (giho) {
                case '+' -> first + second;
                case '-' -> first - second;
                case '*', 'x' -> first * second;
                case '/' -> first / second;
                case '%' -> first % second;
                default -> {
                    System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
                    yield 0;
                }
            };

            if(result != 0) {
                System.out.print(first + " " + giho + " " + second + " = " + result);
            }

    }

    public void fruit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("과일 이름을 입력하세요 : ");
        String fname = sc.nextLine();

        int price = 0;

        switch (fname) {
            case "사과":
                price = 1000;
                break;
            case "바나나":
                price = 3000;
                break;
            case "복숭아":
                price = 2000;
                break;
            case "키위":
                price = 5000;
                break;
            default:
                System.out.println("준비된 상품이 없습니다.");
        }

        if (price != 0) {
            System.out.print(fname+ "의 가격은 " + price + "원 입니다.");
        }

    }

    public void score() {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력하세요 : ");
        int kor = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int eng = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        int mat = sc.nextInt();

        int avg = (kor + eng + mat) / 3;

        if(avg >= 60 && (kor >= 40 && eng >= 40 && mat >= 40) ) {
            System.out.println("합격입니다!");
        }  else {
            System.out.println("평균점수 미달로 불합격입니다.");
        }

        if (kor < 40) {
            System.out.println("국어과목의 점수 미달로 불합격 입니다.");
        } if (eng < 40) {
            System.out.println("영어과목의 점수 미달로 불합격 입니다.");
        } if (mat < 40) {
            System.out.println("수학과목의 점수 미달로 불합격 입니다.");
        }
    }

    public void score2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력하세요 : ");
        int kor = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int eng = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        int mat = sc.nextInt();

        int sum = kor + eng + mat;
        double avg = sum / 3;

        if(kor <= 100 && eng <= 100 && mat <= 100) {
            if (avg >= 60 && (kor >= 40 && eng >= 40 && mat >= 40) ) {
                System.out.println("국어 : " + kor);
                System.out.println("수학 : " + mat);
                System.out.println("영어 : " + eng);
                System.out.println("합계 : " + sum);
                System.out.println("평균 : " + avg);
                System.out.println("축하합니다, 합격입니다!");
            }  else {
                System.out.println("불합격입니다.");
            }
        } else {
            System.out.println("\n!100 이하의 숫자를 입력하세요!");
        }

    }

    public void multiply() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수하나를 입력하세요 : ");
        int num = sc.nextInt();
//        for(int i = 9; i >= num; i--) {
//            for(int j = 9; j <= num; j++) {
//                System.out.print(j);
//            }
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" x 8"+ " + " + i + " = " );
            }
        }


//        int result = n * 8 + m

//        System.out.println( n +  "x" + "8" + "+" + m + "=" + result);
//                          1 x 8 + 1 = 9
//                *        12 x 8 + 2 = 98
//                *       123 x 8 + 3 = 987
//                *      1234 x 8 + 4 = 9876
//                *     12345 x 8 + 5 = 98765

    }
    


