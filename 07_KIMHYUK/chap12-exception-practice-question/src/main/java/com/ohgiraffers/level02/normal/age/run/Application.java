package com.ohgiraffers.level02.normal.age.run;

import com.ohgiraffers.level02.normal.age.controller.AgeValidator;
import com.ohgiraffers.level02.normal.age.exception.InvalidAgeException;

public class Application {

    public static void main(String[] args) {

        int[] ages = {25,-3,151,0};

        AgeValidator validator = new AgeValidator();

        for (int age : ages) {

            try {
                validator.validate(age);
                System.out.println(age + " : 통과");
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
