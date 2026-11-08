package com.ohgiraffers.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {

    public static void main(String[] args) {

        StringTokenizer str = new StringTokenizer("J a v a P r o g r a m ", " ");
        /**
         * 1. `"J a v a P r o g r a m "` 문자열 값을 공백 단위로 Token 처리하여 `char[]` 에 저장하여 출력하시오.
         * 2. 토큰 처리전 글자 및 개수 출력
         * 3. 토큰 처리 후 문자배열 갯수 출력 확인
         * 4. `char[]` 값 출력
         * 5. `char[]` 을 다시 `String` 으로 변환, 모두 대문자로 변환하여 출력
         */
        char[] arr = new char[str.countTokens()];
        System.out.println(Arrays.toString(arr)); //[ ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]


        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.nextToken().charAt(0);
        }
        System.out.println(Arrays.toString(arr)); //[J, a, v, a, P, r, o, g, r, a, m]

        String string = String.valueOf(arr);
        System.out.println("string = " + string.toUpperCase()); //string = JAVAPROGRAM

    }


}
