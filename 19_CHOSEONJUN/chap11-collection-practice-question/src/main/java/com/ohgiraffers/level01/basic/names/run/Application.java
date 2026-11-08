package com.ohgiraffers.level01.basic.names.run;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        //이름 배열 {"민수", "서연", "민수", "지훈", "서연", "유진"}의
        // 이름을 LinkedHashSet, TreeSet, HashSet에 모두 넣는다. 세 Set은 Set<String> 타입 변수에 담는다.
        // 넣은 순서 :  뒤에 LinkedHashSet을, 가나다순 :  뒤에 TreeSet을 붙여 출력하고,
        // HashSet은 내용 대신 중복 없는 이름 수 : <N>으로 크기만 출력한다.

        String[] arrName = {"민수", "서연", "민수", "지훈", "서연", "유진"};

        Set<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> stringTreeSet = new TreeSet<>();
        HashSet<String> stringHashSet = new HashSet<>();

        for (String string : arrName) {
            linkedHashSet.add(string);
            stringTreeSet.add(string);
            stringHashSet.add(string);
        }
        System.out.println(linkedHashSet);
        System.out.println(stringTreeSet);
        System.out.println(stringHashSet.size());
        ///넣은 순서 : [민수, 서연, 지훈, 유진]
        /// 가나다순 : [민수, 서연, 유진, 지훈]
        /// 중복 없는 이름 수 : 4

    }
}
