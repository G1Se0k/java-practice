package com.ohgiraffers.section01.level01.basic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

    }
    // 기능용 클래스

    // 반환값 : x
    // 메소드명 : checkMethod
    // 호출하면 "메소드 호출 확인"을 출력하는 기능의 메소드
public void checkMethod(){
    System.out.println("메소드 호출 확인");
}

    // 반환값 : String
    // 메소드명 : sumTwoNumber
    // 두개의 전달인자를 받아 두수의 합을 반환

    // 출력의 내용은 "10과 20의 합은 30입니다." 라는 문장을
    // 출력하는 기능
public String sumTwoNumber() {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫 번째 숫자 :");
    int first = sc.nextInt();
    System.out.print("두 번째 숫자 :");
    int second = sc.nextByte();
    int total = first + second;



    System.out.println(first + "과" + second + "의 합은" + total + "입니다.");


    return "";
}

    // 반환값 : String
    // 메소드명 : multiTwoNumber
    // 두개의 전달인자를 받아 두수의 곱을 반환
    // 출력의 내용은 "10과 20의 곱은 200입니다." 라는 문장을
    // 출력하는 기능


    // 반환값 : int
    // 메소드명 : multiTwoNumber2
    // 두개의 전달인자를 받아 두수의 곱을 반환

    // 출력의 내용은 "10과 20의 곱은 200입니다." 라는 문장을
    // 출력하는 기능


}
