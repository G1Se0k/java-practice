package com.ohgiraffers.level02.normal.card.run;

import com.ohgiraffers.level02.normal.card.model.StudentCard;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Application {

    public static void main(String[] args) {

        Function<String, Integer> parseNo = Integer::parseInt;
        System.out.println("학번 숫자 : " + parseNo.apply("20250013"));

        BiFunction<String, String, Boolean> isSame = String::equals;
        System.out.println("같은 학번인가 : " + isSame.apply("20250013", "20240107"));

        Function<String, StudentCard> cardFactory = StudentCard::new;

        Consumer<StudentCard> printCard = card ->
                System.out.println("학생증[" + card.getStudentNo() + ", " + card.getEntranceYear() + "년 입학]");

        String[] numbers = {"20250013", "20240107", "20250021"};

        for (String no : numbers) {
            StudentCard card = cardFactory.apply(no);
            printCard.accept(card);
        }
    }
}
