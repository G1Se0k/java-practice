package com.ohgiraffers.level02.normal.wash.run;

import com.ohgiraffers.level02.normal.wash.model.WashCourse;

public class Application {

    public static void main(String[] args) {

        int totalMinutes = 0;
        WashCourse maxCourse = WashCourse.values()[0];

        for (WashCourse course : WashCourse.values()) {
            System.out.println(course.getLabel() + " : " + course.getMinutes() + "분");

            totalMinutes += course.getMinutes();

            if (course.getMinutes() > maxCourse.getMinutes()) {
                maxCourse = course;
            }
        }

        System.out.println("전체 시간 : " + totalMinutes + "분");
        System.out.println("가장 긴 코스 : " + maxCourse.getLabel());
    }
}
