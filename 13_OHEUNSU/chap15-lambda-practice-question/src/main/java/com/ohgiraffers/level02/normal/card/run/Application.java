package com.ohgiraffers.level02.normal.card.run;

import com.ohgiraffers.level02.normal.card.model.StudentCard;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Application {

    public static void main(String[] args) {

        String[] studentNoArr = {"20250013", "20240107", "20250021"};
        Function<String, Integer> strToInt = Integer::parseInt;
        BiFunction<String, String, Boolean> isSame = String::equals;
        Function<String, StudentCard> createCard = StudentCard::new;
        Consumer<StudentCard> printCard = System.out::println;

        System.out.println("학번 숫자 : " + strToInt.apply(studentNoArr[0]));
        System.out.println("같은 학번인가 : " + isSame.apply(studentNoArr[0], studentNoArr[2]));
        for(String studentNo: studentNoArr){
            printCard.accept(createCard.apply(studentNo));
        }
    }
}
