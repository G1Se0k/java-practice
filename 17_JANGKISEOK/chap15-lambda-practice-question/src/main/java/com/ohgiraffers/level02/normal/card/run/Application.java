package com.ohgiraffers.level02.normal.card.run;

import com.ohgiraffers.level02.normal.card.model.StudentCard;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Application {
    public static void main(String[] args) {
        // 1. 학번 문자열을 숫자로 바꾸는 Function을 메소드 참조로 만들어 출력한다
        Function<String, Integer> function1 = Integer::parseInt;
        System.out.println("학번 숫자 : " + function1.apply("20250013"));
        // 2. 두 학번이 같은지 비교하는 BiFunction을 메소드 참조로 만들어 출력한다
        BiFunction<String,String,Boolean> biFunction = String::equals;
        System.out.println("같은 학번인가 : " + biFunction.apply("20250013", "20240107"));
        // 3. 학생증을 만드는 Function과 출력하는 Consumer를 메소드 참조로 만든다
        Function<String, StudentCard> function2 = StudentCard::new;
        Consumer<StudentCard> consumer = System.out::println;
        // 4. 학번마다 학생증을 만들어 출력한다
        consumer.accept(function2.apply("20250013"));
        consumer.accept(function2.apply("20240107"));
        consumer.accept(function2.apply("20250021"));
    }
}
