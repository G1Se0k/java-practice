package com.ohgiraffers.level02.normal.word.controller;

import java.util.Map;
import java.util.TreeMap;

public class WordCounter {

    public Map<String, Integer> count (String sentence) {

        Map<String, Integer> map = new TreeMap<>();

        String[] words = sentence.split(" ");

        for (String word : words) {

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        return map;
    }
}
