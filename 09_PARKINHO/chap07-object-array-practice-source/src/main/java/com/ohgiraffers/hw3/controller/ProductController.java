package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    // 초기화 블럭을 이용하여 10개의 Product 배열 크기 할당
    ProductDTO[] pro = new ProductDTO[10];
    int count = 0;
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        // 메뉴 출력 --> do~while 문으로 반복 실행 처리함
        int input;
        do {
            System.out.print("""
                    ===== 제품 관리 메뉴 =====
                    1. 제품 정보 추가
                    2. 제품 전체 조회
                    9. 프로그램 종료
                    =======================
                    """);
            System.out.print("메뉴를 선택해주세요 : ");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    productInput();
                    break;
                case 2:
                    productPrint();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다");
                    break;
                default:
                    System.out.println("잘못된 메뉴를 선택했습니다 다시 선택해주세요");
            }
        } while (input != 9);
    }

    public void productInput() {
        // 키보드로 도서 정보를 입력 받아 객체 생성
        System.out.print("제품번호 : ");
        int pid = sc.nextInt();
        System.out.print("제품명 : ");
        String pName = sc.next();
        System.out.print("제품 가격 : ");
        int price = sc.nextInt();
        System.out.print("제품 세금 : ");
        double tax = sc.nextDouble();

        pro[count] = new ProductDTO(pid, pName, price, tax);
        // -> Product 생성자 내부에서 ProductController의 count 클래스 변수 값이 1씩 증가
        count++;

    }

    public void productPrint() {
        // 현재까지 기록된 도서 정보 모두 출력
        for (int i = 0; i < count; i++) {
            System.out.println("===== " + (i + 1) + "번째 제품 정보 =====");
            System.out.println("제품번호 : " + pro[i].getPid());
            System.out.println("제품명 : " + pro[i].getpName());
            System.out.println("제품 가격 : " + pro[i].getPrice());
            System.out.println("제품 세금 : " + pro[i].getTax());
            System.out.println("========================");
        }

    }

}
