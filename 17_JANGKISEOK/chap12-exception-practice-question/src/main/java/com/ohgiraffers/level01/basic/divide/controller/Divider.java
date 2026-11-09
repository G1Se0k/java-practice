package com.ohgiraffers.level01.basic.divide.controller;

public class Divider {
    public void divide(int a, int b){
        try {
            System.out.println(a + " / " + b + " = " + (a/b));
        }
        catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("계산을 마칩니다.");
    }
}
