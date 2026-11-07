package com.ohgiraffers.level02.normal.wash.run;

import com.ohgiraffers.level02.normal.wash.model.WashCourse;

public class Application {

    public static void main(String[] args) {
        int total = 0;
        int maxTime = 0;
        String maxCourse = null;

        for (WashCourse course: WashCourse.values()){
            System.out.println(course.getLabel() + " : " + course.getMinutes() + "분");
            total += course.getMinutes();
            if (course.getMinutes() > maxTime) {
                maxTime = course.getMinutes();
                maxCourse = course.getLabel();
            }
        }
        System.out.println("전체 시간 : " + total + "분");
        System.out.println("가장 긴 코스 : " + maxCourse);
    }
}
