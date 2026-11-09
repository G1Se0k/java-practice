package com.ohgiraffers.level01.basic.box.run;

import com.ohgiraffers.level01.basic.box.model.Box;

public class Application {

    public static void main(String[] args) {

    // 1. Box<String>을 만들어 사과를 담는다
    Box<String> stBox = new Box<>();
        stBox.put("사과");

    // 2. Box<Integer>를 만들어 100을 담는다
    Box<Integer> inBox = new Box<>();
        inBox.put(100);


    // 3. 꺼낸 값을 형변환 없이 써서 글자 수와 덧셈 결과를 출력한다
        System.out.println("문자열 상자 : " + stBox.getItem());
        System.out.println("정수 상수 : " + inBox.getItem());
    }


//    문자열 상자 : 사과 (글자 수 2)
//    정수 상자 : 100 (+50 = 150)
}
