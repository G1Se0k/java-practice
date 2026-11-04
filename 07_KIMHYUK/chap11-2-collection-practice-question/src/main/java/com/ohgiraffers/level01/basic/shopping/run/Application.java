package com.ohgiraffers.level01.basic.shopping.run;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("우유");
        shoppingList.add("빵");
        shoppingList.add("계란");
        shoppingList.add("사과");

        shoppingList.add(1, "치즈");

        shoppingList.remove("빵");

        shoppingList.set(0, "두유");

        System.out.println(shoppingList);
        System.out.println("개수 : " + shoppingList.size());
        System.out.println("사과 있음 : " + shoppingList.contains("사과"));
        System.out.println("계란 위치 : " + shoppingList.indexOf("계란"));
    }
}
