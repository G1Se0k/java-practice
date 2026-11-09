package com.ohgiraffers.level02.normal.wash.run;

import com.ohgiraffers.level02.normal.wash.model.WashCourse;

public class Application {
    public static void main(String[] args) {
        // 1. 모든 코스의 이름과 시간을 선언 순서대로 출력한다
        for(WashCourse washCourse : WashCourse.values()){
            System.out.println(washCourse.getLabel() + " : " + washCourse.getMinutes() + "분");
        }
        // 2. 모든 코스의 시간을 더하고 가장 긴 코스를 찾는다
        int sum = 0;
        WashCourse max = WashCourse.BLANKET;
        for(WashCourse washCourse : WashCourse.values()){
            sum += washCourse.getMinutes();
            if (washCourse.getMinutes() > max.getMinutes()) max = washCourse;
        }
        // 3. 전체 시간과 가장 긴 코스의 이름을 출력한다
        System.out.println("전체 시간 : " + sum + "분");
        System.out.println("가장 긴 코스 : " + max.getLabel());
    }
}
