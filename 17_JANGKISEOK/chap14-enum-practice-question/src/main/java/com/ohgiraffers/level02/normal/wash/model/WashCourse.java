package com.ohgiraffers.level02.normal.wash.model;

public enum WashCourse {
    STANDARD    ("표준",60),
    WOOL        ("울", 40),
    BLANKET     ("이불",90),
    QUICK       ("쾌속", 30);

    private String label;
    private int minutes;

    WashCourse(String label, int minutes) {
        this.label = label;
        this.minutes = minutes;
    }

    public String getLabel() {
        return label;
    }

    public int getMinutes() {
        return minutes;
    }
}
