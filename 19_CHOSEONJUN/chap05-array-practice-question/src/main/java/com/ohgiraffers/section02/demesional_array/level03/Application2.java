package com.ohgiraffers.section02.demesional_array.level03;

public class Application2 {

    public static void main(String[] args) {

        /*
         * System.arraycopy를 사용하여 배열 복사 합치기
         * */
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = {7, 8, 9, 10};
        int[] d = new int[10];

        // 향상된 for문을 이용하여 위의 a, b, c의 배열의 값을 d의 배열에 합치기한 후 출력
        int start = 0;
        /**
         * • src: 복사할 원본 배열 (Object 타입이므로 기본형 배열 및 객체 배열 모두 가능)
         * • srcPos: 원본 배열에서 복사를 시작할 인덱스 (0부터 시작)
         * • dest: 붙여넣을 대상(새로운) 배열
         * • destPos: 대상 배열에서 데이터가 쓰여질 시작 인덱스
         * • length: 복사할 요소의 개수
         */
        System.arraycopy(a, 0, d, start, a.length);
        start += a.length; // 총길이 10의 배열에서 >> 복사 배열 구간 나누기.
        System.arraycopy(b,0 , d, start, b.length);
        start += b.length;
        System.arraycopy(c, 0, d, start , c.length);
        for (int i : d) {
            System.out.print(i+ " "); //1 2 3 4 5 6 7 8 9 10
        }
    }
}
