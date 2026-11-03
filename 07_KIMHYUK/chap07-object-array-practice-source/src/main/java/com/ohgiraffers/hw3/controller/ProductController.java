package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
        private ProductDTO[] pro = null;

        public static int count;

        Scanner sc = new Scanner(System.in);

        {
        pro = new ProductDTO[10];
        }

        public void mainMenu() {


        int menu = 1;

        do {
        System.out.println("===== 제품 관리 메뉴 =====");
        System.out.println("1. 제품 정보 추가");
        System.out.println("2. 제품 전체 조회");
        System.out.println("9. 프로그램 종료");

        System.out.print("메뉴 번호를 입력하세요 : ");
        menu = sc.nextInt();

        if (menu == 1) {
            productInput();
        } else if (menu == 2) {
            productPrint();
        } else if (menu == 9) {
            System.out.println("프로그램을 종료합니다.");
        } else {
            System.out.println("잘못된 번호입니다.");
        }

        } while (menu != 9);

        }

        public void productInput() {
            System.out.print("제품 번호를 입력하세요 : ");
            int pId = sc.nextInt();
            sc.nextLine();

            System.out.print("제품명을 입력하세요 : ");
            String pName = sc.nextLine();

            System.out.print("제품 가격을 입력하세요 : ");
            int price = sc.nextInt();

            System.out.print("제품 세금을 입력하세요 : ");
            double tax = sc.nextDouble();

            pro[count] = new ProductDTO(pId,pName,price,tax);

        }

        public void productPrint() {
            for (int i = 0; i < count; i++) {
                System.out.println(pro[i].information());
            }
        }
    }

