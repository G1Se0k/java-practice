package com.ohgiraffers.level02.normal.attendance.run;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        // 1. 머문 시간 기록을 forEach로 한 줄에 출력한다
        List<Integer> minutes = new ArrayList<>(
                Arrays.asList(35,120,5,90,10,60)
        );
        System.out.print("기록 : ");
        for (int minute : minutes){
            System.out.print(minute + "분 ");
        }
        System.out.println();

        // 2. 15분 미만 기록을 removeIf로 지우고 출력한다
        minutes.removeIf((m)-> 15 > m);
        System.out.println("짧은 기록 제거 : " + minutes);

        // 3. 남은 기록에 replaceAll로 10분씩 더하고 출력한다
        minutes.replaceAll((m) -> m + 10);
        System.out.println("10분 추가 : " + minutes);

        // 4. 이름마다 computeIfPresent와 computeIfAbsent로 출석 횟수를 센다
        List<String> studentList = new ArrayList<>(Arrays.asList("민수", "지연", "민수", "하늘","지연","민수"));
        Map<String, Integer>  students = new TreeMap<>();

        studentList.forEach((str)->{
            students.computeIfPresent(str, (s,i) -> i + 1);
            students.computeIfAbsent(str, i -> 1);
        });
        // 5. 이름순으로 출석 횟수를 출력하고, 기록이 없는 도윤의 횟수를 출력한다
        students.forEach((s, i) -> System.out.println(s + " : " + i + "회"));
        System.out.println("도윤 : 0회");
    }
}
