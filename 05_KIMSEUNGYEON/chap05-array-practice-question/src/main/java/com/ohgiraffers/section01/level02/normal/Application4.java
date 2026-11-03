package com.ohgiraffers.section01.level02.normal;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */

        int[] lottoNumbers = new int[6];
        int count = 0;

        while (count < 6) {
            int randomNum = (int) (Math.random() * 45) + 1; // 1~45 사이의 난수 생성

            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (lottoNumbers[i] == randomNum) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                lottoNumbers[count] = randomNum;
                count++;
            }
        }

        // 오름차순 정렬
        for (int i = 0; i < lottoNumbers.length - 1; i++) {
            for (int j = i + 1; j < lottoNumbers.length; j++) {
                if (lottoNumbers[i] > lottoNumbers[j]) {
                    int temp = lottoNumbers[i];
                    lottoNumbers[i] = lottoNumbers[j];
                    lottoNumbers[j] = temp;
                }
            }
        }

        // 결과 출력
        System.out.print("생성된 로또 번호: ");
        for (int num : lottoNumbers) {
            System.out.print(num + " ");
        }
    }
}
