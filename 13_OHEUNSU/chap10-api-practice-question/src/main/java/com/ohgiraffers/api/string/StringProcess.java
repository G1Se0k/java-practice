package com.ohgiraffers.api.string;

public class StringProcess {

    public String preChar(String s){
        String first = s.substring(0, 1).toUpperCase();
        String other = s.substring(1);

        return first + other;
    }

    public int charSu(String s, char ch){
        int cnt = 0;
        int idx = 0;

        while(true){
            idx = s.indexOf(ch+"", idx);
            if(idx == -1) break;
            cnt++;
            idx++;
        }
        return cnt;
    }
}
