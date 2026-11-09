package com.ohgiraffers.level01.basic.nickname.run;

import java.util.function.*;

public class Application {

    public static void main(String[] args) {

        Supplier<String> defaultSupplier = () -> "guest";
        Predicate<String> isValid = name -> name.length() >= 3 && name.length() <= 8;
        Function<String, Integer> getLength = name -> name.length();
        UnaryOperator<String> toUpper = name -> name.toUpperCase();
        BinaryOperator<String> joinWithUnderscore = (s1, s2) -> s1 + "_" + s2;
        Consumer<String> printLine = str -> System.out.println(str);

        String[] nicknames = {"sky", "go", "moonlight77", "river"};

        String validSky = null;
        String validRiver = null;

        for (String name : nicknames) {
            if (isValid.test(name)) {
                String upperName = toUpper.apply(name);
                int length = getLength.apply(name);

                if (name.equals("sky")) validSky = upperName;
                if (name.equals("river")) validRiver = upperName;

                printLine.accept(name + " : 사용 가능," + length + "글자, " + upperName);
            } else {
                printLine.accept(name + " : 사용 불가, 기본 닉네임 " + defaultSupplier.get());
            }
        }

        if (validSky != null && validRiver != null) {
            String joinName = joinWithUnderscore.apply(validSky, validRiver);
            printLine.accept("합친 이름 : " + joinName);
        }
    }
}
