package com.ohgiraffers.level01.basic.number.run;

import java.util.List;
import java.util.stream.IntStream;

public class Application {

    public static void main(String[] args) {
        List<Integer> intList = List.of(1,2,3,4,5,6,7,8,9,10);

        System.out.println("짝수 : " + intList.stream().filter(i -> (i % 2) == 0).toList());
        System.out.println("짝수 제곱 합 : " + intList.stream().filter(i -> (i % 2) == 0).map(i -> i * i).reduce(Integer::sum).get());
        System.out.println("5보다 큰 수 : " + intList.stream().filter(i -> i > 5).count() + "개");
        System.out.println("1~100 합 : " + IntStream.rangeClosed(1,100).sum());
    }
}
