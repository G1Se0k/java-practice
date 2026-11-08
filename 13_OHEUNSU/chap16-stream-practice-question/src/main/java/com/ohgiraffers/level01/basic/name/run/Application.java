package com.ohgiraffers.level01.basic.name.run;

import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        List<String> nameList = List.of("kim", "lee", "park", "choi", "jung", "yoon");

        System.out.println(nameList.stream().filter(name -> name.length() >= 4).map(String::toUpperCase).sorted().collect(Collectors.joining(", ")));
        System.out.println("k로 시작하는 이름 있음 : " + nameList.stream().anyMatch(name -> name.contains("k")));
    }
}
