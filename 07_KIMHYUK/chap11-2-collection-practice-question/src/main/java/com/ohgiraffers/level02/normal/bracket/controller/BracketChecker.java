package com.ohgiraffers.level02.normal.bracket.controller;

import java.util.Stack;

public class BracketChecker {

    public boolean isValid(String expr) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.empty()) {
                    return false;
                }
                char open = stack.pop();

                if ((ch == ')' && open != '(') ||
                        (ch == '}' && open != '(') ||
                        (ch == ']' && open != '[')) {

                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

