package com.ohgiraffers.level02.normal.word.run;

import com.ohgiraffers.level02.normal.word.controller.WordCounter;

import java.util.Map;

public class Application {

    public static void main(String[] args) {

        // 1. WordCounter로 문장의 단어별 횟수를 센다
        WordCounter wordCounter = new WordCounter();

        // 2. 단어별 횟수를 한 줄씩 출력하면서 가장 많이 나온 단어를 찾는다
        Map<String, Integer> count = wordCounter.count("java is fun and java is powerful java");
        int maxCount = 0;
        String mostFrequentWord = "";
        for(Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        // 3. 가장 많이 나온 단어와 횟수를 출력한다
        System.out.println("가장 많이 나온 단어: " + mostFrequentWord + ", 횟수: " + maxCount);
    }
}
