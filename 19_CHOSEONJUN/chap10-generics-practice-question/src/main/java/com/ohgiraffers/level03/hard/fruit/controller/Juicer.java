package com.ohgiraffers.level03.hard.fruit.controller;

import com.ohgiraffers.level03.hard.fruit.model.Apple;
import com.ohgiraffers.level03.hard.fruit.model.Box;
import com.ohgiraffers.level03.hard.fruit.model.Fruit;

public class Juicer {


    public static String makeJuice(Box<? extends Fruit> box) {
        return box.getItem() + "주스 완성";
    }

    public static void fillApple(Box<? super Apple> box) {
        box.put(new Apple("사과"));
    }


    public static String describe(Box<?> box) {
        if (box != null) {
            return "사과 채움 " + box.getItem();
        }
        return "비어있음";
    }
}
