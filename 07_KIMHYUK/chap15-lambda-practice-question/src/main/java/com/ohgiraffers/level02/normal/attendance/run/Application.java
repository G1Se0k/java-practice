package com.ohgiraffers.level02.normal.attendance.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Application {

    public static void main(String[] args) {

        List<Integer> times = new ArrayList<>(List.of(35, 120, 5, 90, 10, 60));

        System.out.print("기록 : ");

        times.forEach(t -> System.out.print(t + "분 "));

        System.out.println();

        times.removeIf (t -> t < 15);

        System.out.println("짧은 기록 제거 : " + times);

        times.replaceAll(t -> t + 10);

        System.out.println("10분 추가 : " + times);

        List<String> attendance = List.of("민수", "지연", "민수", "하늘", "민수", "지연");
        Map<String, Integer> countMap = new TreeMap<>();

        for (String name : attendance) {
            countMap.computeIfAbsent(name, k -> 0);

            countMap.computeIfPresent(name, (k, v) -> v + 1);
        }

        countMap.forEach((name, count) -> System.out.println(name + " : " + count + "회"));

        int doyunCount = countMap.getOrDefault("도윤", 0);
        System.out.println("도윤 : " + doyunCount + "회");
    }
}
