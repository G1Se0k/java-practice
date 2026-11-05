package com.ohgiraffers.level02.normal.word.controller;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class WordCounter {

    public Map<String, Integer> count(String sentence){
        Map<String, Integer> resMap = new TreeMap<>();

        String[] splitSen = sentence.split(" ");

        for(String word: splitSen){
            if(!resMap.containsKey(word)){
                int cnt = 0;
                int idx = 0;
                while(true){
                    idx = sentence.indexOf(word, idx);
                    if (idx == -1) break;
                    idx++;
                    cnt++;
                }
                resMap.put(word, cnt);
            }
        }

        return resMap;
    }
}
