package com.ohgiraffers.api.token;

import java.util.Arrays;
import java.util.Locale;
import java.util.StringTokenizer;

public class TokenTest {

    public static void main(String[] args) {

        //    - 요구사항
//    1. `"J a v a P r o g r a m "` 문자열 값을 공백 단위로 Token 처리하여 `char[]` 에 저장하여 출력하시오.
//    2. 토큰 처리전 글자 및 개수 출력
//    3. 토큰 처리 후 문자배열 갯수 출력 확인
//    4. `char[]` 값 출력
//    5. `char[]` 을 다시 `String` 으로 변환, 모두 대문자로 변환하여 출력

        String java = "J a v a P r o g r a m ";

        StringTokenizer st1 = new StringTokenizer(java, " ");
        System.out.println(st1.countTokens());
        char[] arr = new char[st1.countTokens()];
        int num = 0;
        while (st1.hasMoreTokens()) {  // hasMoreTokens: 현재 꺼낼 토큰이 있는지 없는지 체크
//            System.out.print(st1.nextToken() + " "); // nextToken(): 현재값을 빼서 반납
            arr[num] = st1.nextToken().charAt(0);
            num++;
        }
        System.out.println(arr);
        System.out.println(Arrays.toString(arr).toUpperCase());
    }
}
