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

        System.arraycopy(a, 0, d, 0, a.length);
        System.arraycopy(b, 0, d, a.length, b.length);
        System.arraycopy(c, 0, d, a.length + b.length, c.length);
        System.out.println("System.arraycopy를 이용한 배열 합치기 결과 : ");
        printArray(d);

        // 향상된 for문을 이용하여 위의 a, b, c의 배열의 값을 d의 배열에 합치기한 후 출력
        int index = 0;
        for (int value : a) {
            d[index++] = value;
        }
        for (int value : b) {
            d[index++] = value;
        }
        for (int value : c) {
            d[index++] = value;
        }

        System.out.println("향상된 for문을 이용한 배열 합치기 결과 : ");
        printArray(d);
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
