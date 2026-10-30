package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application6 {

    public static void main(String[] args) {

        /*
         * 사용자가 입력한 값이 배열에 있는지 검색하여
         * 있으면 "OOO 치킨 배달 가능", 없으면 "OOO 치킨은 없는 메뉴입니다."를
         * 출력하세요.
         * 단, 치킨메뉴가 들어가 있는 배열은 본인이 스스로 정하세요
         *
         * ex.
         * 치킨 이름을 입력하세요 : 양념     치킨 이름을 입력하세요 : 불닭
         * 양념치킨 배달 가능              불닭치킨은 없는 메뉴입니다.
         * */
        String[] arrStr = {"양념", "간장", "바베큐", "치즈", "마늘", "허니"};
        Scanner sc = new Scanner(System.in);
        System.out.print("치킨 이름을 입력하세요 : ");
        String input = sc.nextLine();
        boolean find = false;
        for (String string : arrStr) {
            if (string.equals(input)) {
                find = true;
                break;
            } else {
                find = false;
            }
        }
        if (find) {
            System.out.println(input + "치킨 배달 가능");
        } else {
            System.out.println(input + "치킨 없는 메뉴입니다.");
        }
    }
}
