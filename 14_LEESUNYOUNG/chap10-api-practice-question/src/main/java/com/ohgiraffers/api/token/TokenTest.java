package com.ohgiraffers.api.token;

import java.util.StringTokenizer;

//- 클래스 : `com.ohgiraffers.api.token.TokenTest.java`
//- 요구사항
//    1. `"J a v a P r o g r a m "` 문자열 값을 공백 단위로 Token 처리하여 `char[]` 에 저장하여 출력하시오.
//    2. 토큰 처리전 글자 및 개수 출력
//    3. 토큰 처리 후 문자배열 갯수 출력 확인
//    4. `char[]` 값 출력
//    5. `char[]` 을 다시 `String` 으로 변환, 모두 대문자로 변환하여 출력
public class TokenTest {
    public static void main(String[] args) {
        String str = "J a v a P r o g r a m ";
        System.out.println("토큰 처리 전 문자열 : " + str);
        System.out.println("문자 개수 : " + str.length());
        StringTokenizer st = new StringTokenizer(str);
        int tokenCount = st.countTokens();
        System.out.println("토큰 개수 : " + tokenCount);
        char[] ch = new char[tokenCount];
        int index = 0;
        while (st.hasMoreTokens()){
            ch[index] = st.nextToken().charAt(0);
            index++;
        }
        System.out.println(ch.length);
        System.out.print("문자 배열 : ");
        System.out.println(ch);

        String result = new String(ch).toUpperCase();
        System.out.println("대문자 변환 : " + result);
    }

}
