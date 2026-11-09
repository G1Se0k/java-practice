package com.ohgiraffers.level01.basic.name.run;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        // 1. 이름 리스트를 만든다
        List<String> nameList = List.of("kim", "lee", "park", "choi", "jung", "yoon");

        // 2. 4글자 이상인 이름만 대문자로 바꿔 정렬하고 ", "로 잇는다
        System.out.println(nameList.stream().filter(name -> name.length() > 3).sorted().map(name -> name.toUpperCase(Locale.ROOT)).collect(Collectors.joining(", ")));

        // 3. k로 시작하는 이름이 하나라도 있는지 확인한다
        System.out.println("k로 시작하는 이름 있음 : " + nameList.stream().anyMatch(name -> name.contains("k")));

    }
}
