package com.ohgiraffers.section02.demesional_array.level03;

public class Application1 {

    public static void main(String[] args) {


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
        int[][] arr1 = new int[4][4];

        int cur = 1;
        for(int i =0 ; i<arr1.length; i++){
            for(int j= 0; j< arr1[i].length; j++){
                arr1[i][j] = cur;
                cur++;
            }
        }

        print(arr1);
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
        int[][] arr1 = new int[4][4];
        int cur = 1;

        for(int i =0 ; i<arr1.length; i++){
            cur-=11;
            for(int j= 0; j< arr1[i].length; j++){
                arr1[i][j] = cur;
                cur+=4;
            }
        }

        print(arr1);

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
        int[][] arr1 = new int[4][4];
        int cur =0;

        for(int i =0 ; i<arr1.length; i++){
            cur= 4*(i+1);
            for(int j= 0; j< arr1[i].length; j++){
                arr1[i][j] = cur;
                cur--;
            }
        }

        print(arr1);


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
        int[][] arr1 = new int[4][4];
        int cur =5;

        for(int i =0 ; i<arr1.length; i++){
            cur+=11;
            for(int j= 0; j< arr1[i].length; j++){
                arr1[i][j] = cur;
                cur-=4;
            }
        }

        print(arr1);


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

        int[][] arr1 = new int[4][4];
        int cur =20;

        for(int i =0 ; i<arr1.length; i++){
            cur-=7;
            for(int j= 0; j< arr1[i].length; j++){
                arr1[i][j] = cur;
                cur+=1;
            }
        }

        print(arr1);
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
        int[][] arr1 = new int[4][4];
        int cur= 0;

        for(int i =0 ; i<arr1.length; i++){
            cur+=13;
            for(int j= 0; j< arr1[i].length; j++){
                arr1[i][j] = cur;
                cur-=4;
            }
        }

        print(arr1);

    }

    /**
     * 4 8 0(12) 16
     * 0(3) 7 11 0(15)
     * 2 0(6) 10 14
     * 1 5 0 13
     *
     *  3의 배수인 경우 continue;
     * @param arr
     */
    public void arrayTest7(int[][] arr) {
        int[][] arr1 = new int[4][4];
        int cur =4;

        for(int i =0 ; i<arr1.length; i++){
            cur=13;
            for(int j= 0; j< arr1[i].length; j++){
                if(cur%3==0){
                    arr1[i][j] =0;
                }else {
                    arr1[i][j] = cur;
                }
                cur+=4;
            }
        }

        print(arr1);

    }

    /***
     * 이차원 배열을 전달받아서 출력하는 메소드
     * @param arr
     */
    public void print(int[][] arr) {
        int l = arr.length;
        for(int i=0; i<l; i++){
            for(int j : arr[i]){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}