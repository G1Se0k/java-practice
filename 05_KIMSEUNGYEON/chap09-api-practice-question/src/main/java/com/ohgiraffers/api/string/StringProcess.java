package com.ohgiraffers.api.string;

public class StringProcess {

    // 1. 문자열을 넘겨 받아, 첫 글자를 대문자로 바꾸는 메서드 작성
    public String preChar(String str) {

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    // 2. 문자열에서 찾는 문자가 몇 개 포함되어 있는지 반환하는 메서드 작성
    public int charSu(String str, char ch) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
