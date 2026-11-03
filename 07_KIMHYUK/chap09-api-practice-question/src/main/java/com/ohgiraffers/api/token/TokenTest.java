package com.ohgiraffers.api.token;

import java.util.StringTokenizer;

public class TokenTest {

    public static void main(String[] args) {

        String str = "J a v a P r o g r a m";

        System.out.println("토큰 처리 전 문자 : " + str + ", 개수 : " + str.length());

        StringTokenizer st = new StringTokenizer(str);

        int count = st.countTokens();

        char[] arr = new char[count];

        int index = 0;

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            arr[index] = token.charAt(0);
            index++;
            }

        System.out.println("토큰 처리 후 문자배열 개수 : " + arr.length);


        System.out.print("char[] 값 : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(" ");
                }
            }

        System.out.println();

        String result = new String(arr).toUpperCase();

        System.out.println("대문자 변환 : " + String.join(" ", result.split("")));
        }
}


