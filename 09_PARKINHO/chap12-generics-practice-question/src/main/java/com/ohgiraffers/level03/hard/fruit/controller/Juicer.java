package com.ohgiraffers.level03.hard.fruit.controller;

import com.ohgiraffers.level03.hard.fruit.model.Apple;
import com.ohgiraffers.level03.hard.fruit.model.Box;
import com.ohgiraffers.level03.hard.fruit.model.Fruit;

public class Juicer {

    public String makeJuice(Box<? extends Fruit> box) {
        Fruit fruit = new Fruit(box.get().getName());
        return fruit.getName() + " 주스 완성";
    }

    public void fillApple(Box<? super Apple> box) {
        new Apple();
    }

    public String describe(Box<?> box) {
        if (box.get() == null) {
            return "비어있음";
        }
        return box.toString();
    }


}
