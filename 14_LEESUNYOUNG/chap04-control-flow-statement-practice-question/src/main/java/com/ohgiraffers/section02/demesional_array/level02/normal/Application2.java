package com.ohgiraffers.section02.demesional_array.level02.normal;

public class Application2 {

    public static void main(String[] args) {

        /* 길이 12의 문자열 배열을 생성하여 12명의 학생들을 출석부 순으로 1차원 배열에 할당하고,
         * 2열 3행 2차원 배열을 2개 할당하여 각 1분단 2분단이라고 칭한다.
         * 순차적으로  1분단 부터, 왼쪽부터 오른쪽, 1행에서 아래 행으로 번호 순으로 자리를 배치하고 출력하세요
         *
         * -- 출석부 --
         * 1. 홍길동
         * 2. 이순신
         * 3. 유관순
         * 4. 윤봉길
         * 5. 장영실
         * 6. 임꺽정
         * 7. 장보고
         * 8. 이태백
         * 9. 김정희
         * 10. 대조영
         * 11. 김유신
         * 12. 이사부
         *
         * -- 출력 예시 --
         * == 1분단 ==
         * 홍길동 이순신
         * 유관순 윤봉길
         * 장영실 임꺽정
         *
         * == 2분단 ==
         * 장보고 이태백
         * 김정희 대조영
         * 김유신 이사부
         */

        String[] arr = { "홍길동", "이순신", "유관순", "윤봉길", "장영실", "임꺽정", "장보고", "이태백", "김정희", "대조영", "김유신", "이사부"};
        String[][] first = new String[3][2];
        String[][] second = new String[3][2];

        for(int i= 0; i< arr.length; i++ ) {
            int localIndex = i % 6;
            int row = localIndex / 2;
            int col = localIndex % 2;

            if (i < 6) {
                first[row][col] = arr[i];
            } else {
                second[row][col] = arr[i];
            }
        }
        System.out.println(" == 1분단 ==");

        for(int row = 0; row < first.length; row++){
            for (int col = 0; col <first[row].length; col++){
                System.out.print(first[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(" == 2분단 ==");

        for(int row = 0; row < second.length; row++) {
            for (int col = 0; col < second[row].length; col++) {

                System.out.print(second[row][col] + " ");
            }
            System.out.println();
        }

    }
}
