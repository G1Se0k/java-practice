package com.ohgiraffers.level02.normal.word.controller;

import java.util.Map;
import java.util.TreeMap;

public class WordCounter {


    /// 문장을 공백으로 나눠 단어마다 나온 횟수를 센다.
    /// 단어가 알파벳순으로 정렬되도록 TreeMap에 담아 반환한다.
    /// static 메소드가 아니므로 new WordCounter()로 만들어 부른다.


    public Map<String, Integer> count(String sentence) {

        Map<String, Integer> counts = new TreeMap<>();

        for (String string : sentence.split(" ")) {
            counts.put(string, counts.getOrDefault(string, 0) + 1); /// getOrDefault() 기존값 -> 0 +1(증가)
        }
        return counts;
    }

}
