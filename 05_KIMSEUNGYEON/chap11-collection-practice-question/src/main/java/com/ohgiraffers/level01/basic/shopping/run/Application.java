package com.ohgiraffers.level01.basic.shopping.run;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        // 1. 장보기 목록에 우유, 빵, 계란, 사과를 차례로 넣는다
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("우유");
        shoppingList.add("빵");
        shoppingList.add("계란");
        shoppingList.add("사과");

        // 2. 1번 위치에 치즈를 끼워 넣고, 빵을 지우고, 0번을 두유로 바꾼다
        shoppingList.add(1, "치즈");
        shoppingList.remove("빵");
        shoppingList.set(0, "두유");

        // 3. 목록, 개수, 사과 포함 여부, 계란 위치를 출력한다
        System.out.println("장보기 목록: " + shoppingList);
        System.out.println("개수: " + shoppingList.size());
        System.out.println("사과 포함 여부: " + shoppingList.contains("사과"));
        System.out.println("계란 위치: " + shoppingList.indexOf("계란"));

    }
}
