package com.ohgiraffers.level01.basic.shopping.run;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<String> wishList = new ArrayList<>();

        wishList.add("우유");
        wishList.add("빵");
        wishList.add("계란");
        wishList.add("사과");
        wishList.add(1, "치즈");
        wishList.remove("빵");
        wishList.set(0, "두유");

        System.out.println(wishList);
        System.out.println("개수 : " + wishList.size());
        System.out.println("사과 있음 : " + wishList.contains("사과"));
        System.out.println("계란 위치 : " + wishList.indexOf("계란"));
    }
}
