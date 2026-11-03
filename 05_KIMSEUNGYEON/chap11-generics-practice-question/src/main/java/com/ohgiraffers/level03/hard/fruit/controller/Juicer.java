package com.ohgiraffers.level03.hard.fruit.controller;

import com.ohgiraffers.level03.hard.fruit.model.Apple;
import com.ohgiraffers.level03.hard.fruit.model.Box;
import com.ohgiraffers.level03.hard.fruit.model.Fruit;

public class Juicer {

    public String makeJuice(Box<? extends Fruit> box) {
        String fruitName = box.get().getName();
        return fruitName + " 쥬스 완성";
    }

    public void fillApple(Box<? super Apple> appleBox) {
        appleBox.put(new Apple());
    }

    public String describe(Box<?> box) {
        if(box.get() == null) {
            return "비어 있음";
        } else {
            return box.get().toString();
        }
    }
}
