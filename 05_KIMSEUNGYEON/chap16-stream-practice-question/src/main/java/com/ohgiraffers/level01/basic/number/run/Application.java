package com.ohgiraffers.level01.basic.number.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Application {

    public static void main(String[] args) {
        // 1. 1부터 10까지 담은 리스트를 만든다
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        // 2. 짝수만 골라 리스트로 모은다;
        System.out.println("짝수 : " + numberList.stream().filter(i -> (i % 2) == 0).toList());

        // 3. 짝수를 제곱해 모두 더한다
        System.out.println("짝수의 합 : "+ numberList.stream().filter(i -> (i % 2) == 0).mapToInt(i -> i * i).sum());

        // 4. 5보다 큰 수의 개수를 센다
        System.out.println("5보다 큰 수 : " + numberList.stream().filter(i -> i > 5).count() + "개");

        // 5. IntStream으로 1부터 100까지 더한다
        System.out.println("1~100의 합 : " + IntStream.rangeClosed(1, 100).sum());
    }

}
