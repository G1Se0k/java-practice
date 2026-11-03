package com.ohgiraffers.level03.hard.fruit.controller;

import com.ohgiraffers.level03.hard.fruit.model.Apple;
import com.ohgiraffers.level03.hard.fruit.model.Box;
import com.ohgiraffers.level03.hard.fruit.model.Fruit;


public class Juicer {
    public static String makeJuice(Box<? extends Fruit >box){
        Fruit fruit = box.get();
        return fruit.getName() + "주스 완성";
    }

    public static void fillApple(Box<? super Apple>box){
        box.put(new Apple());
    }

    public static String describe(Box<?> box){
        Object item = box.get();
        return item == null ? "비어 있음" : item.toString();
    }
}
