package com.ohgiraffers.level02.normal.bracket.run;

import com.ohgiraffers.level02.normal.bracket.controller.BracketChecker;

public class Application {

    public static void main(String[] args) {

        BracketChecker bc = new BracketChecker();
        String[] strArr = {"(a+b)*(c-d)", "((a+b)", "(a+b))", "{[a+b]*(c)}", "(]"};

        for (String str: strArr){
            if (bc.isValid(str)) System.out.println(str + " : 올바름");
            else System.out.println(str + " : 올바르지 않음");
        }
    }
}
