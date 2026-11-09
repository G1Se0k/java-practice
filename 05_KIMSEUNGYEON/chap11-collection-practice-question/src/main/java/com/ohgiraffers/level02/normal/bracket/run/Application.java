package com.ohgiraffers.level02.normal.bracket.run;

import com.ohgiraffers.level02.normal.bracket.controller.BracketChecker;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        // 1. 검사할 식 다섯 개를 배열에 담는다
        List<String> expressions = new ArrayList<>(List.of("(a+b)*(c-d),((a+b),(a+b)),{[a+b]*(c)},(]".split(",")));

        // 2. BracketChecker로 식마다 검사해 결과를 출력한다
        BracketChecker checker = new BracketChecker();
        for(String expression : expressions) {
            if(checker.isValid(expression)) {
                System.out.println(expression + ": 올바름");
            } else {
                System.out.println(expression + ": 올바르지 않음");
            }
        }
    }
}
