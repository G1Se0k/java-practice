package com.ohgiraffers.level01.basic.name.run;

import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        List<String> names = List.of("choi", "jung", "park", "yoon", "kim");

        String result = names.stream()
                .filter(name -> name.length() >= 4)
                .map(name -> name.toUpperCase())
                .sorted()
                .collect(Collectors.joining(", "));

        System.out.println(result);

        boolean hasK = names.stream().anyMatch(name -> name.startsWith("k"));
        System.out.println("k로 시작하는 이름 있음 : " + hasK);
    }
}
