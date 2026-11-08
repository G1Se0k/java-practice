package com.ohgiraffers.level01.basic.shopping.run;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Application {

    public static void main(String[] args) {

        // 1. 장보기 목록에 우유, 빵, 계란, 사과를 차례로 넣는다
        List<String> list = new ArrayList<>();
        //List<String> 목록을 ArrayList로 만들고 우유, 빵, 계란, 사과를 차례로 넣는다.
        // 이어서 1번 위치에 치즈를 끼워 넣고, 빵을 지우고, 0번 위치를 두유로 바꾼다.
        // 목록을 출력한 뒤 개수 : <N>, 사과 있음 : <포함 여부>, 계란 위치 : <N>을 출력한다.
        // 포함 여부는 true 또는 false다.

        list.add("우유");
        list.add("빵");
        list.add("계란");
        list.add("사과");
        // 2. 1번 위치에 치즈를 끼워 넣고, 빵을 지우고, 0번을 두유로 바꾼다
        list.set(1,"치즈");
        list.set(0,"두유");
        // 3. 목록, 개수, 사과 포함 여부, 계란 위치를 출력한다
        System.out.println(list);
        Function<List<String>, Integer> fn = l -> l.size();
        System.out.println(fn.apply(list));
        System.out.println("사과 있음: " + list.contains("사과"));
        System.out.println("계란 위치: " + list.indexOf("계란"));


   }
   ///[두유, 치즈, 계란, 사과]
   /// 개수 : 4
   /// 사과 있음 : true
   /// 계란 위치 : 2
}

