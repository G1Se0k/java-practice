package com.ohgiraffers.level02.normal.age.controller;

import com.ohgiraffers.level02.normal.age.exception.InvalidAgeException;

public class AgeValidator {

    public void check(int age) throws InvalidAgeException {

        if(age < 0 || age > 150) {
            throw new InvalidAgeException("나이는 0~150 사이여야 합니다 : " + age);
        }
    }
}
