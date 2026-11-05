package com.ohgiraffers.level01.basic.names.run;

import java.lang.reflect.Array;
import java.util.*;

public class Application {

    public static void main(String[] args) {

        String[] names = {"민수", "서연", "민수", "지훈", "서연", "유진"};
        Set<String> linkSet = new LinkedHashSet<>(Arrays.asList(names));
        Set<String> treeSet = new TreeSet<>(Arrays.asList(names));
        Set<String> hashSet = new HashSet<>(Arrays.asList(names));

        System.out.println("넣은 순서 : " + linkSet);
        System.out.println("가나다 순 : " + treeSet);
        System.out.println("중복 없는 이름 수 : " + hashSet.size());

    }
}
