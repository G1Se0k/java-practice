package com.ohgiraffers.api.string;

public class StringProcess {
    public String preChar(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

        return sb.toString();
    }
    public int charSu(String s, char ch){
        int count = 0;
        for(int i =0; i< s.length();i++){
            if(s.charAt(i) == ch) count++;
        }
        return count;
    }
}
