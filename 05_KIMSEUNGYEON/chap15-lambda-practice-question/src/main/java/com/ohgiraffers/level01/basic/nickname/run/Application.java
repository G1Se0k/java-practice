package com.ohgiraffers.level01.basic.nickname.run;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Application {

    public static void main(String[] args) {

        // 1. 표준 함수적 인터페이스 6개를 람다식으로 만든다
        Supplier<String> defaultNickname = () -> "guest";

        Predicate<String> isAvailable = nickname -> nickname.length() >= 3 && nickname.length() <= 8;

        Function<String, Integer> length = nickname -> nickname.length();

        UnaryOperator<String> toUpper = nickname -> nickname.toUpperCase();

        BinaryOperator<String> combine = (name1, name2) -> name1 + "_" + name2;

        Consumer<String> print = message -> System.out.println(message);


        // 2. 닉네임마다 사용 가능한지 검사해 한 줄씩 출력한다
        String[] nicknames = {"sky", "go", "moonlight77", "river"};

        for (String nickname : nicknames) {

            if (isAvailable.test(nickname)) {
                print.accept(nickname + " : 사용 가능, " + length.apply(nickname) + "글자, " + toUpper.apply(nickname));
            } else {
                print.accept(nickname + " : 사용 불가, 기본 닉네임 " + defaultNickname.get());
            }
        }


        // 3. 사용 가능한 sky와 river를 대문자로 바꿔 이어 붙여 출력한다
        String combinedName = combine.apply(toUpper.apply("sky"), toUpper.apply("river"));

        print.accept("합친 이름 : " + combinedName);
    }
}