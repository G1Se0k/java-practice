package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {

    private ProductDTO[] pro;
    public static int count;
    Scanner sc;

    {
        // 초기화 블럭을 이용하여 10개의 Product 배열 크기 할당
        pro = new ProductDTO[10];
        sc = new Scanner(System.in);
        count = 0;

    }

    public void mainMenu() {
        do {
            String str = """
                    ===== 제품 관리 메뉴 =====
                    1. 제품 정보 추가
                    2. 제품 전체 조회
                    9. 프로그램 종료
                    """;
            System.out.println(str);
            System.out.print("선택 입력: ");
            int input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 1:  productInput(); break;
                case 2:  productPrint(); break;
                case 9:  System.out.println("프로그램을 종료"); return;
            }
        } while (true);
    }

    public void productInput() {
        // 키보드로 도서 정보를 입력 받아 객체 생성
        System.out.print("제품번호 입력: ");
        int pId = sc.nextInt();
        sc.nextLine();
        System.out.print("제품명 입력: ");
        String pName = sc.nextLine();
        System.out.print("제품 가격 입력: ");
        int price = sc.nextInt();
        System.out.print("제품 세금 입력: ");
        double tax = sc.nextDouble();
        pro[count] = new ProductDTO(pId, pName, price, tax);
        // -> Product 생성자 내부에서 ProductController의 count 클래스 변수 값이 1씩 증가

        // 현재 카운트 인덱스에 생성한 주소 저장
    }

    public void productPrint() {
        // 현재까지 기록된 도서 정보 모두 출력
        for (int i = 0; i < count; i++) {
            System.out.println(pro[i].information());
        }
    }
}
