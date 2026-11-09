package com.ohgiraffers.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {

    public static void main(String[] args) {

        String str = "J a v a P r o g r a m ";
        System.out.println(str);
        StringTokenizer st = new StringTokenizer(str);
        int length = st.countTokens();
        System.out.println(length);
        char[] chArr = new char[length];

        int idx = 0;
        while(st.hasMoreTokens()){
            chArr[idx] = st.nextToken().charAt(0);
            idx++;
        }
        System.out.println(chArr);
        String str1 = String.valueOf(chArr).toUpperCase();
        System.out.println(str1);
    }
}
