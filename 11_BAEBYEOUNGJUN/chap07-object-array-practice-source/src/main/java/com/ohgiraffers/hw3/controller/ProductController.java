package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {

    ProductDTO[] productDTO = new ProductDTO[10];
    public static int count = 0;
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        int input = 0;
        do {
            System.out.println("""
                    ===== 제품 관리 메뉴 =====
                    1. 제품 정보 추가
                    2. 제품 전체 조회
                    9. 프로그램 종료                    """);
            input = sc.nextInt();

            switch(input) {
                case 1: productInput(); break;
                case 2: productPrint(); break;
                case 9:
                    System.out.println("프로그램 종료"); break;
                default :
                    System.out.println("입력 오류, 다시 입력"); break;
            }
        } while (input != 9);
    }

    public void productInput() {

        System.out.print("제품 번호 : ");
        int pld = sc.nextInt();
        sc.nextLine();

        System.out.print("제품 이름 : ");
        String pName = sc.nextLine();

        System.out.print("제품 가격 : ");
        int price = sc.nextInt();

        System.out.print("제품 세금 : ");
        double tax = sc.nextDouble();

        productDTO[count] = new ProductDTO(pld, pName, price, tax);
    }

    public void productPrint() {
        for (int i = 0; i < count; i++) {
            System.out.println(productDTO[i].information());
        }
    }

}
