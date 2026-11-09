package com.ohgiraffers.level02.normal.attendance.run;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        ArrayList<Integer> stayTime = new ArrayList<>(List.of(35, 120, 5, 90, 10, 60));

        System.out.print("기록 : ");
        stayTime.forEach(time -> System.out.print(time + "분 "));
        System.out.println();

        List<Integer> filtered = stayTime.stream().filter(time -> time >= 15).collect(Collectors.toList());
        System.out.println("짧은 기록 제거 : " + filtered);

        List<Integer> added = filtered.stream().map(time -> time + 10).toList();
        System.out.println("10분 추가 : " + added);

        String[] attendance = {"민수", "지연", "민수", "하늘", "지연", "민수"};

        TreeMap<String, Integer> attCount = new TreeMap<>();
        for(String name: attendance){
            attCount.computeIfPresent(name, (a, b) -> b + 1);
            attCount.computeIfAbsent(name, a -> 1);
        }

        for(String name: attCount.keySet()){
            System.out.println(name + " : " + attCount.get(name) + "회");
        }
        System.out.println("도윤 : " + attCount.getOrDefault("도윤", 0) + "회");

    }
}
