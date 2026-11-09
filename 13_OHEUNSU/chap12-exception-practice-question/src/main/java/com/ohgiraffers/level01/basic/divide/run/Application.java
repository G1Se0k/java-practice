package com.ohgiraffers.level01.basic.divide.run;

import com.ohgiraffers.level01.basic.divide.controller.Divider;

public class Application {

    public static void main(String[] args) {

        Divider divider = new Divider();
        divider.divide(10, 2);
        divider.divide(10, 0);
    }
}
