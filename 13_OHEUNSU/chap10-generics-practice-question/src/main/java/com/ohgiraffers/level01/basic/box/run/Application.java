package com.ohgiraffers.level01.basic.box.run;

import com.ohgiraffers.level01.basic.box.model.Box;

public class Application {

    public static void main(String[] args) {

        Box<String> boxStr = new Box<>();
        Box<Integer> boxInt = new Box<>();

        boxStr.put("사과");
        boxInt.put(100);

        System.out.println("문자열 상자 : " + boxStr.get() + " (글자 수 " + boxStr.get().length() +")");
        System.out.println("정수 상자 : " + boxInt.get() + " (+50 = " + (boxInt.get() + 50) + ")");
    }
}
