package com.ohgiraffers.level01.basic.parse.run;

public class Application {
    public static void main(String[] args) {
        // 1. 정수로 바꿀 문자열 배열을 만든다
        String[] strArr = new String[]{"10","abc","30","4.5"};
        // 2. 합계와 실패 건수를 담을 변수를 만든다
        int success = 0;
        int fail = 0;
        // 3. 값마다 정수로 바꿔 더하고, 바꿀 수 없는 값은 알린 뒤 건너뛴다
        for(String str : strArr){
            try {
                success += Integer.parseInt(str);
            }catch (Exception e){
                System.out.println("변환 실패 : " + str);
                fail++;
            }
        }
        // 4. 합계와 실패 건수를 출력한다
        System.out.println("합계 : " + success);
        System.out.println("실패 건수 : " + fail);
    }
}
