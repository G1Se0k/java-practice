package com.ohgiraffers.level01.basic.shirt.model;

import java.util.Locale;

public enum ShirtSize {

    SMALL, MEDIUM, LARGE;

    @Override
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
