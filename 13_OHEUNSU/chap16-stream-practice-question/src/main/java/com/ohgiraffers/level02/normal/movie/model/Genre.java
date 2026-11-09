package com.ohgiraffers.level02.normal.movie.model;

public enum Genre {
    ACTION("액션"),
    COMEDY("코미디"),
    DRAMA("드라마");

    final String label;

    Genre(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
