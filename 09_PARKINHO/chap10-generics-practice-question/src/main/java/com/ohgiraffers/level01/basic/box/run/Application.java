package com.ohgiraffers.level01.basic.box.run;

import com.ohgiraffers.level01.basic.box.model.Box;

public class Application {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        Box<Integer> integerBox = new Box<>();

        stringBox.put("사과");
        integerBox.put(100);

        System.out.println("문자열 상자 : " + stringBox.get() + " (글자 수 " + stringBox.get().length() + ")");
        System.out.println("정수 상자 : " + integerBox.get() + " (+50 = " + (integerBox.get() + 50) + ")");


    }
}
