package com.ohgiraffers.level01.basic.nickname.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Application {
    public static void main(String[] args) {
        // 1. 표준 함수적 인터페이스 6개를 람다식으로 만든다
        Supplier<String> supplier = () -> "guest";
        Predicate<String> predicate = (str) -> str.length() <=8 && str.length() >= 3;
        Function<String,Integer> function = String::length;
        UnaryOperator<String> unaryOperator = String::toUpperCase;
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1+ "_" + str2;
        Consumer<String> consumer = System.out::println;
        // 2. 닉네임마다 사용 가능한지 검사해 한 줄씩 출력한다
        List<String> names = Arrays.asList("sky", "go", "moonlight77","river");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        names.forEach((name)-> {
            sb.append(name);
            sb.append(" : ");
            System.out.print(name + " : ");
            if (predicate.test(name)) {
                sb.append("사용 가능, ");
                sb.append(function.apply(name));
                sb.append("글자, ");
                sb.append(unaryOperator.apply(name));

                if(!sb2.isEmpty()){
                    sb2.append('_');
                }
                sb2.append(unaryOperator.apply(name));
            }
            else{
                sb.append("사용 불가, 기본 닉네임 ");
                sb.append(supplier.get());
            }
            System.out.println(sb);
            sb.setLength(0);
        });
        // 3. 사용 가능한 sky와 river를 대문자로 바꿔 이어 붙여 출력한다
        System.out.println(sb2);
    }
}
