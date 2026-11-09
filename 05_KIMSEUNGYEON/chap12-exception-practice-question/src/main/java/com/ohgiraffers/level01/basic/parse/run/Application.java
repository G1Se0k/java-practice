package com.ohgiraffers.level01.basic.parse.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        // 1. 정수로 바꿀 문자열 배열을 만든다
        List<String> strings = new ArrayList<>(Arrays.asList("10", "abc", "30", "4.5"));

        // 2. 합계와 실패 건수를 담을 변수를 만든다
        int sum = 0;
        int failureCount = 0;

        // 3. 값마다 정수로 바꿔 더하고, 바꿀 수 없는 값은 알린 뒤 건너뛴다
        for(String num : strings) {
            try {
                int changeNum = Integer.parseInt(num);
                sum += changeNum;
            } catch (Exception e) {
                System.out.println("변환 실패 : " + num);
                failureCount++;
            }
        }

        // 4. 합계와 실패 건수를 출력한다
        System.out.println("합계 : " + sum);
        System.out.println("실패 건수 : " + failureCount);
    }
}
