package com.ohgiraffers.level02.normal.attendance.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class Application {

    public static void main(String[] args) {

        // 1. 머문 시간 기록을 forEach로 한 줄에 출력한다
        ArrayList<Integer> records = new ArrayList<>(Arrays.asList(35, 120, 5, 90, 10, 60));

        System.out.print("기록 : ");
        records.forEach(time -> System.out.print(time + "분 "));
        System.out.println();

        // 2. 15분 미만 기록을 removeIf로 지우고 출력한다
        records.removeIf(time -> time < 15);
        System.out.println("짧은 기록 제거 : " + records);

        // 3. 남은 기록에 replaceAll로 10분씩 더하고 출력한다
        records.replaceAll(time -> time + 10);
        System.out.println("10분 추가 : " + records);

        // 4. 이름마다 computeIfPresent와 computeIfAbsent로 출석 횟수를 센다
        String[] names = {"민수", "지연", "민수", "하늘", "지연", "민수"};

        TreeMap<String, Integer> attendance = new TreeMap<>();

        Arrays.asList(names).forEach(name -> {
            attendance.computeIfAbsent(name, key -> 0);
            attendance.computeIfPresent(name, (key, count) -> count + 1);
        });

        // 5. 이름순으로 출석 횟수를 출력하고, 기록이 없는 도윤의 횟수를 출력한다
        attendance.forEach((name, count) -> System.out.println(name + " : " + count + "회"));

        int doYoonCount = attendance.getOrDefault("도윤", 0);
        System.out.println("도윤 : " + doYoonCount + "회");
    }
}