package com.ohgiraffers.level03.hard.fruit.run;

import com.ohgiraffers.level03.hard.fruit.controller.Juicer;
import com.ohgiraffers.level03.hard.fruit.model.Apple;
import com.ohgiraffers.level03.hard.fruit.model.Box;
import com.ohgiraffers.level03.hard.fruit.model.Fruit;
import com.ohgiraffers.level03.hard.fruit.model.Grape;

public class Application {

    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        appleBox.put(new Apple());

        Box<Grape> grapeBox = new Box<>();
        grapeBox.put(new Grape());

        System.out.println(Juicer.makeJuice(appleBox));
        System.out.println(Juicer.makeJuice(grapeBox));

        Box<Fruit> fruitBox = new Box<>();
        Box<Object> objectBox = new Box<>();

        Juicer.fillApple(fruitBox);
        Juicer.fillApple(objectBox);

        System.out.println("Box<Fruit>에 사과 채움 : " + fruitBox.get());
        System.out.println("Box<Object>에 사과 채움 : " + objectBox.get());

        Box<Apple> emptyBox = new Box<>();
        System.out.println("빈 상자 : " + Juicer.describe(emptyBox));
    }
}