package com.ohgiraffers.level02.normal.wash.run;

import com.ohgiraffers.level02.normal.wash.model.WashCourse;

public class Application {

    public static void main(String[] args) {

        int totalMinutes = 0;
        WashCourse longestCourse = null;

        // 1. 모든 코스의 이름과 시간을 선언 순서대로 출력
        for (WashCourse course : WashCourse.values()) {

            System.out.println(course.getLabel() + " : " + course.getMinutes() + "분");

            // 2. 전체 시간 계산
            totalMinutes += course.getMinutes();

            // 가장 긴 코스 찾기
            if (longestCourse == null || course.getMinutes() > longestCourse.getMinutes()) {
                longestCourse = course;
            }
        }

        // 3. 전체 시간과 가장 긴 코스 출력
        System.out.println("전체 시간 : " + totalMinutes + "분");
        System.out.println("가장 긴 코스 : " + longestCourse.getLabel());
    }
}