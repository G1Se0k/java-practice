package com.ohgiraffers.level01.basic.divide.run;

import com.ohgiraffers.level01.basic.divide.controller.Divider;

public class Application {
    public static void main(String[] args) {
        // 1. Divider 객체를 만든다
        Divider divider = new Divider();
        // 2. 10을 2로 나눈다
        divider.divide(10,2);
        // 3. 10을 0으로 나눈다
        divider.divide(10,0);

    }
}
