package com.ohgiraffers.level01.basic.box.run;

import com.ohgiraffers.level01.basic.box.model.Box;

public class Application {
    public static void main(String[] args) {

        // 1. Box<String>을 만들어 사과를 담는다
        Box<String> stringBox = new Box<>();
        stringBox.put("사과");

        // 2. Box<Integer>를 만들어 100을 담는다
        Box<Integer> integerBox = new Box<>();
        integerBox.put(100);

        // 3. 꺼낸 값을 형변환 없이 써서 글자 수와 덧셈 결과를 출력한다
        System.out.println("String 값: " + stringBox.get() + ", 글자 수: " + stringBox.get().length());
        System.out.println("Integer 값: " + integerBox.get() + ", 덧셈 결과: " + (integerBox.get() + 50));
    }
}
