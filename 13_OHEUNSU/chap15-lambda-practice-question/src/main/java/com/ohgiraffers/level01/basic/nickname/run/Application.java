package com.ohgiraffers.level01.basic.nickname.run;

import java.util.function.*;

public class Application {

    public static void main(String[] args) {

        Supplier<String> defaultName = () -> "guest";
        Predicate<String> nameRule = str -> (str.length() >= 3 && str.length() <= 8);
        Function<String, Integer> nameLen = String::length;
        UnaryOperator<String> nameUpper = String::toUpperCase;
        BinaryOperator<String> nameJoin = (str1, str2) -> str1 + "_" + str2;
        Consumer<String> print = System.out::println;

        String[] names = {"sky", "go", "moonlight77", "river"};

        for(int i = 0; i < names.length; i++){
            String name = names[i];
            if (nameRule.test(name)){
                print.accept(name + " : 사용 가능, " + nameLen.apply(name) + "글자, " + nameUpper.apply(name));
            } else {
                print.accept(name + " : 사용 불가, 기본 닉네임 " + defaultName.get());
                names[i] = null;
            }
        }
        String permited = null;

        for(String name: names){
            if(name != null){
                if(permited != null){
                    permited = nameJoin.apply(permited, nameUpper.apply(name));
                }else {
                    permited = nameUpper.apply(name);
                }
            }
        }
        print.accept("합친 이름 : " + permited);
    }
}
