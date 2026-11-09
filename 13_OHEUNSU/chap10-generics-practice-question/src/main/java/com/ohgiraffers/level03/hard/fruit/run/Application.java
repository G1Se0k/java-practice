package com.ohgiraffers.level03.hard.fruit.run;

import static com.ohgiraffers.level03.hard.fruit.controller.Juicer.*;
import com.ohgiraffers.level03.hard.fruit.model.Apple;
import com.ohgiraffers.level03.hard.fruit.model.Box;
import com.ohgiraffers.level03.hard.fruit.model.Fruit;
import com.ohgiraffers.level03.hard.fruit.model.Grape;

public class Application {

    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        Box<Grape> grapeBox = new Box<>();

        appleBox.put(new Apple());
        grapeBox.put(new Grape());

        System.out.println(makeJuice(appleBox));
        System.out.println(makeJuice(grapeBox));

        Box<Fruit> fruitBox = new Box<>();
        Box<Object> objectBox = new Box<>();

        fillApple(fruitBox);
        fillApple(objectBox);

        System.out.println("Box<Fruit>에 사과 채움 : " + describe(fruitBox));
        System.out.println("Box<Object>에 사과 채움 : " + describe(objectBox));

        Box<String> stringBox = new Box<>();
        System.out.println("빈 상자 : " + describe(stringBox));
    }
}
