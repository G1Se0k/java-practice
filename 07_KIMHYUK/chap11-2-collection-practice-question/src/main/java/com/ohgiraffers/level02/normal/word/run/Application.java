package com.ohgiraffers.level02.normal.word.run;

import com.ohgiraffers.level02.normal.word.controller.WordCounter;

import java.util.Map;

public class Application {

    public static void main(String[] args) {

        WordCounter wc = new WordCounter();

        String sentence = "java is powerful and java is fun java";

        Map<String, Integer> result = wc.count(sentence);

        String maxWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            }
        }

        System.out.println("가장 많이 나온 단어 : " + maxWord + " (" + maxCount + "번)");
    }
}
