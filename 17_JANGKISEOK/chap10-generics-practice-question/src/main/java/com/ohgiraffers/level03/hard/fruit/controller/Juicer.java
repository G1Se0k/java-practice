package com.ohgiraffers.level03.hard.fruit.controller;

import com.ohgiraffers.level03.hard.fruit.model.Apple;
import com.ohgiraffers.level03.hard.fruit.model.Box;
import com.ohgiraffers.level03.hard.fruit.model.Fruit;

public class Juicer {
    public static String makeJuice(Box<? extends Fruit> box){
        StringBuilder sb = new StringBuilder(box.get().getName());
        sb.append(" 주스 완성");
        return sb.toString();
    }
    public static void fillApple(Box<? super Apple> box){
        box.put(new Apple("사과"));
    }
    public static String describe(Box<?> box){
        if(box.get() == null) return "비어 있음";
        return box.get().toString();
    }
}
