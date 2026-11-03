package com.ohgiraffers.level03.hard.fruit.run;

import com.ohgiraffers.level03.hard.fruit.controller.Juicer;
import com.ohgiraffers.level03.hard.fruit.model.Apple;
import com.ohgiraffers.level03.hard.fruit.model.Box;
import com.ohgiraffers.level03.hard.fruit.model.Fruit;
import com.ohgiraffers.level03.hard.fruit.model.Grape;

public class Application {

    public static void main(String[] args) {

        /*
         * 와일드카드 세 가지로 과일 상자를 다룬다.
         * <? extends Fruit>로 사과·포도 주스를 만들고, <? super Apple>로 Box<Fruit>·Box<Object>에
         * 사과를 채운 뒤, <?>로 상자 상태를 출력한다.
         *
         * -- 출력 예시 --
         * 사과 주스 완성
         * Box<Fruit>에 사과 채움 : 사과
         */

        // 1. 사과를 담은 Box<Apple>과 포도를 담은 Box<Grape>를 만든다
        Box<Apple> appleBox = new Box<>();
        appleBox.put(new Apple());
        Box<Grape> grapeBox = new Box<>();
        grapeBox.put(new Grape());

        // 2. 두 상자로 주스를 만들어 출력한다
        System.out.println(Juicer.makeJuice(appleBox));
        System.out.println(Juicer.makeJuice(grapeBox));

        // String은 Fruit의 자식이 아니다. 아래 줄의 주석을 풀면 컴파일 오류가 난다
//        Juicer.makeJuice(new Box<String>());

        // 3. 빈 Box<Fruit>와 Box<Object>에 사과를 채우고 상태를 출력한다
        Box<Fruit> fruitBox = new Box<>();
        Box<Object> objectBox = new Box<>();
        Juicer.fillApple(fruitBox);
        Juicer.fillApple(objectBox);

        // Grape는 Apple의 부모가 아니다. 아래 줄의 주석을 풀면 컴파일 오류가 난다
//        Juicer.fillApple(grapeBox);

        System.out.println("Box<Fruit>에 사과 채움 : " + Juicer.describe(fruitBox));
        System.out.println("Box<Object>에 사과 채움 : " + Juicer.describe(objectBox));

        // 4. 아무것도 넣지 않은 상자의 상태를 출력한다
        Box<String> emptyBox = new Box<>();
        System.out.println("빈 상자 : " + Juicer.describe(emptyBox));

    }
}