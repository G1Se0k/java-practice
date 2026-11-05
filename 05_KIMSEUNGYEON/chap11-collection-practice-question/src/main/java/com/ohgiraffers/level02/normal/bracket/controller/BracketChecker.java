package com.ohgiraffers.level02.normal.bracket.controller;

import java.util.Stack;

public class BracketChecker {

    public boolean isValid (String expression) {

        /*
        * 식의 괄호가 모두 바르게 짝지어 열리고 닫혔으면 true, 아니면 false를 반환한다.
        * 소괄호·대괄호·중괄호를 검사하고, 괄호가 아닌 글자는 건너뛴다.
        * 안에서 Stack<Character>를 쓴다.
        * static 메소드가 아니므로 new BracketChecker()로 만들어 부른다.
        * */

        Stack<Character> characterStack = new Stack<>();
        for(int i = 0; i < expression.length(); i++) {
            char expr = expression.charAt(i);

            if(expr == '(' || expr == '{' || expr == '[') {
                characterStack.push(expr);
            } else if (expr == ')' || expr == '}' || expr == ']') {

                 // 닫는 괄호가 나왔으나 stack 이 비어있는 경우 false
                if(characterStack.isEmpty()) {
                    return false;
                }

                char openBracket = characterStack.pop();

                if(expr == ')' && openBracket != '(') {
                    return false;
                }

                if (expr == ']' && openBracket != '[') {
                    return false;
                }

                if (expr == '}' && openBracket != '{') {
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }
}
