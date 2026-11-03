package com.ohgiraffers.api.token;

import java.util.StringTokenizer;

public class TokenTest {

    public static void main(String[] args) {

        String str = "J a v a P r o g r a m ";

        // 공백 단위로 토큰 처리
        StringTokenizer st = new StringTokenizer(str, " ");

        // 토큰 처리 전 글자 및 개수 출력
        System.out.println("토큰 처리 전 글자 : [" + str + "]");
        System.out.println("토큰 처리 전 글자 수 : " + str.length());

        // 토큰 처리 후 문자배열 갯수 출력
        char[] chars = new char[st.countTokens()];
        System.out.println("토큰 처리 후 char[] 개수 : " + chars.length);

        // 토큰을 하나씩 꺼내 char[]에 저장
        for (int i = 0; i < chars.length; i++) {
            chars[i] = st.nextToken().charAt(0);
        }

        // char[] 값 출력
        System.out.print("char[] 값 : ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // char[]을 String으로 변환 후 대문자로 출력
        String result = new String(chars);
        System.out.println("String 변환 후 대문자 변환 : " + result.toUpperCase());
    }
}