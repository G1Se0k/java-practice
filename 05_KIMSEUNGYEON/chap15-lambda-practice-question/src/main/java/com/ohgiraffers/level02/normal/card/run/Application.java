package com.ohgiraffers.level02.normal.card.run;

import com.ohgiraffers.level02.normal.card.model.StudentCard;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Application {

    public static void main(String[] args) {

        String no1 = "20250013";
        String no2 = "20240107";
        String no3 = "20250021";

        // 1. 학번 문자열을 숫자로 바꾸는 Function을 메소드 참조로 만들어 출력한다
        Function<String, Integer> parseNumber = Integer::parseInt;
        System.out.println("학번 숫자 : " + parseNumber.apply(no1));

        // 2. 두 학번이 같은지 비교하는 BiFunction을 메소드 참조로 만들어 출력한다
        BiFunction<String, String, Boolean> equals = String::equals;
        System.out.println("같은 학번인가 : " + equals.apply(no1, no3));

        // 3. 학생증을 만드는 Function과 출력하는 Consumer를 메소드 참조로 만든다
        Function<String, StudentCard> createCard = StudentCard::new;
        Consumer<StudentCard> printCard = System.out::println;

        // 4. 학번마다 학생증을 만들어 출력한다
        String[] studentNos = {no1, no2, no3};

        for (String studentNo : studentNos) {
            StudentCard card = createCard.apply(studentNo);
            printCard.accept(card);
        }
    }
}