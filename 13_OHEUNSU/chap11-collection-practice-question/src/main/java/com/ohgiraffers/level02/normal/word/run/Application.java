package com.ohgiraffers.level02.normal.word.run;

import com.ohgiraffers.level02.normal.word.controller.WordCounter;

import java.util.Map;

public class Application {

    public static void main(String[] args) {

        WordCounter wc = new WordCounter();

        String sentence = "java is fun and java is powerful java";
        Map<String, Integer> countMap = wc.count(sentence);

        String maxWord = null;
        int maxCount = 0;

        for(String word: countMap.keySet()){
            System.out.println(word + " : " + countMap.get(word));
            if(countMap.get(word) > maxCount){
                maxWord = word;
                maxCount = countMap.get(word);
            }
        }
        System.out.println("가장 많은 단어 : " + maxWord + " (" + maxCount + "번)");
    }
}
