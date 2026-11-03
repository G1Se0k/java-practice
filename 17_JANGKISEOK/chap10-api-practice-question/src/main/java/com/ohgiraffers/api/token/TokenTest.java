package com.ohgiraffers.api.token;

import java.util.StringTokenizer;

public class TokenTest {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("J a v a P r o g r a m ", " ");
        char[] chars = new char[st.countTokens()];
        int count = 0;
        while(st.hasMoreTokens()){
            chars[count++] = st.nextToken().charAt(0);
        }
        System.out.println("문자배열 갯수 : " + count);

        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            sb.append(c);
        }
        System.out.println(sb);

    }
}
