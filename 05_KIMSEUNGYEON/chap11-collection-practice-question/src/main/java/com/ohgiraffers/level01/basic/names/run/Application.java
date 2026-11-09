package com.ohgiraffers.level01.basic.names.run;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        // 1. 중복이 섞인 이름 배열을 만든다
        List<String> names = new ArrayList<>(Arrays.asList("민수", "서연", "민수", "지훈", "서연", "유진"));

        // 2. 세 가지 Set을 만들고 이름을 모두 넣는다
        Set<String> linkedHashSet = new LinkedHashSet<>(names);
        Set<String> treeSet = new TreeSet<>(names);
        Set<String> hashSet = new HashSet<>(names);

        // 3. LinkedHashSet과 TreeSet은 그대로, HashSet은 크기만 출력한다
        System.out.println("넣은 순서: " + linkedHashSet);
        System.out.println("가나다순: " + treeSet);
        System.out.println("중복 없는 이름 수: " + hashSet.size());

    }
}
