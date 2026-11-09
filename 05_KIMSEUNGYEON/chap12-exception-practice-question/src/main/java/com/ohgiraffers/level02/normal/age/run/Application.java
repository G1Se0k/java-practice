package com.ohgiraffers.level02.normal.age.run;

import com.ohgiraffers.level02.normal.age.controller.AgeValidator;
import com.ohgiraffers.level02.normal.age.exception.InvalidAgeException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        // 1. 검사할 나이 배열과 AgeValidator 객체를 만든다
        List<Integer> ages = new ArrayList<>(Arrays.asList(25, -3, 151, 0));
        AgeValidator validator = new AgeValidator();

        // 2. 나이마다 검사하고, 통과하면 통과 줄을, 예외가 나면 예외 메시지를 출력한다
        for(int age : ages) {
            try {
                validator.check(age);
                System.out.println(age + " : 통과");
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
