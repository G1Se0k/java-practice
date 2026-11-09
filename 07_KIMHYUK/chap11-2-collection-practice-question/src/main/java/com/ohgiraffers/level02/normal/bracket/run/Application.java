package com.ohgiraffers.level02.normal.bracket.run;

import com.ohgiraffers.level02.normal.bracket.controller.BracketChecker;

public class Application {

    public static void main(String[] args) {


        String[] expressions = {
                "(a+b)*(c-d)",
                "((a+b)",
                "(a+b))",
                "{[a+b]*(c)}",
                "(]"
        };

        BracketChecker checker = new BracketChecker();


        for (String expr : expressions) {

            boolean result = checker.isValid(expr);

            if (result) {
                System.out.println(expr + " : 올바름");
            } else {
                System.out.println(expr + " : 올바르지 않음");
            }
        }
    }
}