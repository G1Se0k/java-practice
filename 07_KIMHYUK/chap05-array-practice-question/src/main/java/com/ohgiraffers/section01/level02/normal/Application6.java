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

        Scanner sc = new Scanner(System.in);

        String[] menu = {"후라이드", "양념", "간장", "뿌링클", "허니콤보" , "파닭"};

        System.out.print("치킨 메뉴를 입력해주세요 : ");
        String name = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(name)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(name + "치킨 배달 가능");
        } else {
            System.out.println(name + "치킨은 없는 메뉴입니다.");
        }

    }
}
