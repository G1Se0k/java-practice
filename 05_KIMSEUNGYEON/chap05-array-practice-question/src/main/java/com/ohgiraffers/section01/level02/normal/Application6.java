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

        String[] chickenMenu = {"후라이드", "양념", "간장", "마늘간장", "허니버터", "파닭"};
        Scanner sc = new Scanner(System.in);
        System.out.print("치킨 이름을 입력하세요 : ");
        String inputMenu = sc.nextLine();

        boolean isAvailable = false;
        for(String menu : chickenMenu) {
            if(menu.equals(inputMenu)) {
                isAvailable = true;
                break;
            }
        }

        if(isAvailable) {
            System.out.println(inputMenu + " 치킨 배달 가능");
        } else {
            System.out.println(inputMenu + " 치킨은 없는 메뉴입니다.");
        }
    }
}
