package com.ohgiraffers.level01.basic.box.run;

import com.ohgiraffers.level01.basic.box.model.Box;

public class Application {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.put("사과");
        System.out.println("문자열 상자 : " + box.get() + "(글자 수 " +box.get().length()+ ")");

        Box<Integer> box1 = new Box<>();
        box1.put(100);
        System.out.println("정수 상자 : " + box1.get() +" (+50 = " + (box1.get()+50) + ")" );


    }
}
