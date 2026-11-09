package com.ohgiraffers.level03.hard.fruit.run;

import com.ohgiraffers.level03.hard.fruit.controller.Juicer;
import com.ohgiraffers.level03.hard.fruit.model.Apple;
import com.ohgiraffers.level03.hard.fruit.model.Box;
import com.ohgiraffers.level03.hard.fruit.model.Fruit;
import com.ohgiraffers.level03.hard.fruit.model.Grape;

public class Application {
    public static void main(String[] args) {

        // 1. 사과를 담은 Box<Apple>과 포도를 담은 Box<Grape>를 만든다
        Box<Apple> appleBox = new Box<>();
        Box<Grape> grapeBox = new Box<>();
        appleBox.put(new Apple());
        grapeBox.put(new Grape());

        // 2. 두 상자로 주스를 만들어 출력한다
        System.out.println(Juicer.makeJuice(appleBox));
        System.out.println(Juicer.makeJuice(grapeBox));

        // 3. 빈 Box<Fruit>와 Box<Object>에 사과를 채우고 상태를 출력한다
        Box<Fruit> fruitBox = new Box<>();
        Box<Object> box = new Box<>();
        Juicer.fillApple(fruitBox);
        Juicer.fillApple(box);
        System.out.println("Box<Fruit>에 사과 채움 : " + Juicer.describe(fruitBox));
        System.out.println("Box<Object>에 사과 채움 : " +  Juicer.describe(box));

        // 4. 아무것도 넣지 않은 상자의 상태를 출력한다
        Box<String> emptyBox = new Box<>();
        System.out.println("빈 상자 : " + Juicer.describe(emptyBox));

    }
}
