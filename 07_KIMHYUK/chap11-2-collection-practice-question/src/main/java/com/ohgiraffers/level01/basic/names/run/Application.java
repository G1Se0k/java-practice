package com.ohgiraffers.level01.basic.names.run;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application {

    public static void main(String[] args) {

        String[] names = {"민수", "서연", "지훈", "유진", "민수"};

        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        for (String name : names) {
            hashSet.add(name);
            linkedHashSet.add(name);
            treeSet.add(name);

        }

        System.out.println("넣은 순서 : " + linkedHashSet);
        System.out.println("가나다순 : " + treeSet);
        System.out.println("중복 없는 이름 수 : " + hashSet.size());
    }
}
