package com.ohgiraffers.level01.basic.number.run;

import java.util.List;
import java.util.stream.IntStream;

public class Application {

    public static void main(String[] args) {

        List<Integer> list = IntStream.rangeClosed(1, 10).boxed().toList();

        List<Integer> evens = list.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("짝수 : " + evens);

        int sumOfSquares = evens.stream().mapToInt(n -> n * n).sum();
        System.out.println("짝수 제곱 합 : " + sumOfSquares);

        long count = list.stream().filter(n -> n > 5).count();
        System.out.println("5보다 큰 수 : " + count + "개");

        int sumHundred = IntStream.rangeClosed(1, 100).sum();
        System.out.println("1~100 합 : " + sumHundred);
    }
}
