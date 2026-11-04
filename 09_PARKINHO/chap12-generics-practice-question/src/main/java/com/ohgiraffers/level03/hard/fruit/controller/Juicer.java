package com.ohgiraffers.level03.hard.fruit.controller;

import com.ohgiraffers.level03.hard.fruit.model.Apple;
import com.ohgiraffers.level03.hard.fruit.model.Box;
import com.ohgiraffers.level03.hard.fruit.model.Fruit;

public class Juicer {

    public static String makeJuice(Box<? extends Fruit> box) {
        return box.get().getName() + " 주스 완성";
    }

    public static void fillApple(Box<? super Apple> box) {
        box.put(new Apple());
    }

    public static String describe(Box<?> box) {
        Object obj = box.get();
        if (obj == null) {
            return "비어있음";
        }
        return obj.toString();
    }


}
