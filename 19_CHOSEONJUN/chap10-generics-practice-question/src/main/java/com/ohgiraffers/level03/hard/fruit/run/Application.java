package com.ohgiraffers.level03.hard.fruit.run;

import com.ohgiraffers.level03.hard.fruit.controller.Juicer;
import com.ohgiraffers.level03.hard.fruit.model.Apple;
import com.ohgiraffers.level03.hard.fruit.model.Box;
import com.ohgiraffers.level03.hard.fruit.model.Fruit;
import com.ohgiraffers.level03.hard.fruit.model.Grape;

public class Application {


    // 1. 사과를 담은 Box<Apple>과 포도를 담은 Box<Grape>를 만든다

    // 2. 두 상자로 주스를 만들어 출력한다



    // 4. 아무것도 넣지 않은 상자의 상태를 출력한다
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.put(new Apple("사과"));
        Box<Grape> grapeBox = new Box<>();
        grapeBox.put(new Grape("포도"));
        System.out.println(Juicer.makeJuice(appleBox));
        System.out.println(Juicer.makeJuice(grapeBox));

        // 3. 빈 Box<Fruit>와 Box<Object>에 사과를 채우고 상태를 출력한다
        Box<Fruit> fruitBox = null;
        Box<Object> objectBox = null;
        fruitBox = new Box<>();
        Juicer.fillApple(fruitBox);
        objectBox = new Box<>();
        Juicer.fillApple(objectBox);
        System.out.println("Fruit"+Juicer.describe(fruitBox));
        System.out.println("Object"+Juicer.describe(objectBox));
        objectBox = null;
        System.out.println(Juicer.describe(objectBox));

    }
}
