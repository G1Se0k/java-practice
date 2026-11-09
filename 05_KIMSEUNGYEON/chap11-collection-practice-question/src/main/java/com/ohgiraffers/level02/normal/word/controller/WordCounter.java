package com.ohgiraffers.level02.normal.word.controller;

import java.util.Map;
import java.util.TreeMap;

public class WordCounter {

    public Map<String, Integer> count(String sentence) {
        TreeMap<String, Integer> wordCountMap = new TreeMap<>();

        for(String word : sentence.split(" ")) {
            if(wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        return wordCountMap;
    }
}
