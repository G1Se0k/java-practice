package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class normal {

    public void numTest() {

        Scanner sc = new Scanner(System.in);
        System.out.print("1~10 사이의 정수 한개를 입력 : ");
        int num = sc.nextInt();

        if (num > 0 && num <= 10) {
            if (num % 2 == 0) {
                System.out.print("짝수 입니다.");
            } else {
                System.out.print("홀수 입니다.");
            }
        }   else {
            System.out.print("반드시 1~10 사이의 정수를 입력해야 합니다.");
        }
    }


    public void bmi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("체중(kg) : ");
        double kg = sc.nextDouble();
        System.out.print("신장(m) : ");
        double m = sc.nextDouble();
        double bmiResult = kg / (m * m);

        if(bmiResult <= 20) {
            System.out.println("당신은 저체중 입니다.");
        } else if (bmiResult < 25) {
            System.out.println("당신은 정상체중 입니다.");
        } else if (bmiResult < 30) {
            System.out.println("당신은 과체중 입니다.");
        } else {
            System.out.println("당신은 비만 입니다.");
        }
    }

    public void season() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 ~ 12 사이의 정수 입력 : ");
        int num = sc.nextInt();
        String season = "";

        switch (num) {
            case 12:
            case 1:
            case 2:
                season ="겨울";
                break;
            case 3:
            case 4:
            case 5:
                season ="봄";
                break;
            case 6:
            case 7:
            case 8:
                season ="여름";
                break;
            case 9:
            case 10:
            case 11:
                season ="가을";
                break;
            default:
                System.out.println("잘못된 값을 입력하셨습니다.");
        }
        if(!season.equals("")) {
            System.out.println(num + "월은 " + '\''+ season + '\'' + "입니다.");
        }
    }

}
