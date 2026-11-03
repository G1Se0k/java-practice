package com.ohgiraffers.section02.demesional_array.level03;

public class Application1 {

    public static void main(String[] args) {

        Application1 app = new Application1();

        int[][] arr = new int[4][4];

        app.arrayTest1(arr);
        app.arrayTest2(arr);
        app.arrayTest3(arr);
        app.arrayTest4(arr);
        app.arrayTest5(arr);
        app.arrayTest6(arr);
        app.arrayTest7(arr);

    }

    /**
     * 1 2 3 4
     * 5 6 7 8
     * 9 10 11 12
     * 13 14 15 16
     *
     * @param arr
     */
    public void arrayTest1(int[][] arr) {

        int num = 1;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num++;
            }
        }
        print("1.",arr);
    }

    /**
     * 1 5 9 13
     * 2 6 10 14
     * 3 7 11 15
     * 4 8 12 16
     *
     * @param arr
     */
    public void arrayTest2(int[][] arr) {

        int num = 1;
        for(int j = 0; j < arr.length; j++) {
            for(int i = 0; i < arr.length; i++) {
                arr[i][j] = num++;
            }
        }
        print("2.",arr);
    }

    /**
     * 4 3 2 1
     * 8 7 6 5
     * 12 11 10 9
     * 16 15 14 13
     *
     * @param arr
     */
    public void arrayTest3(int[][] arr) {

        int num = 1;
        for(int i = 0; i < arr.length; i++) {
            for(int j = arr.length - 1; j >= 0; j--) {
                arr[i][j] = num++;
            }
        }
        print("3.",arr);
    }

    /**
     * 16 12 8 4
     * 15 11 7 3
     * 14 10 6 2
     * 13 9 5 1
     *
     * @param arr
     */
    public void arrayTest4(int[][] arr) {

        int num = 1;
        for(int j = arr.length - 1; j >= 0; j--) {
            for(int i = arr.length - 1; i >= 0; i--) {
                arr[i][j] = num++;
            }
        }
        print("4.",arr);
    }

    /**
     * 13 14 15 16
     * 9 10 11 12
     * 5 6 7 8
     * 1 2 3 4
     *
     * @param arr
     */
    public void arrayTest5(int[][] arr) {

        int num = 1;
        for(int i = arr.length - 1; i >= 0; i--) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num++;
            }
        }
        print("5.",arr);
    }

    /**
     * 13 9 5 1
     * 14 10 6 2
     * 15 11 7 3
     * 16 12 8 4
     *
     * @param arr
     */
    public void arrayTest6(int[][] arr) {

        int num = 1;
        for(int i = arr.length - 1; i >= 0; i--) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[j][i] = num++;
            }
        }
        print("6.",arr);
    }

    /**
     * 4 8 0 16
     * 0 7 11 0
     * 2 0 10 14
     * 1 5 0 13
     *
     *  3의 배수인 경우 continue;
     * @param arr
     */
    public void arrayTest7(int[][] arr) {

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < arr.length; j++) {

                int value = arr[i][j];

                if(arr[3-i][3-j] % 3 == 0) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = arr[3 - i][3 - j];
                }

                if(value % 3 == 0) {
                    arr[3-i][3-j] = 0;
                    continue;
                }
                arr[3-i][3-j] = value;
            }
        }
        print("7.",arr);
    }

    /***
     * 이차원 배열을 전달받아서 출력하는 메소드
     * @param arr
     */
    public void print(String order, int[][] arr) {
        System.out.println("==============================");
        System.out.println(order + " 배열 출력 결과 : ");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
