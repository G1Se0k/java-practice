package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    // 위의 클래스 다이어그램을 보고 필드 작성
    private ProductDTO[] pro;
    public static int count;
    Scanner sc = new Scanner(System.in);
    // 초기화 블럭을 이용하여 10개의 Product 배열 크기 할당
    {
        pro = new ProductDTO[10];
    }

    public void mainMenu() {
        // 메뉴 출력 --> do~while 문으로 반복 실행 처리함
        /*===== 제품 관리 메뉴 =====
        1. 제품 정보 추가 // productInput() 메소드 실행
        2. 제품 전체 조회 // productPrint() 메소드 실행
        9. 프로그램 종료*/

        int input;
        do{
            System.out.println("===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");

            input = sc.nextInt();
            sc.nextLine();

            switch (input){
                case 1: productInput(); break;
                case 2: productPrint(); break;
                case 9:
                default:
                    System.out.println("올바른 값을 입력해주세요. (1, 2, 9)");
                    break;
            }
        }while(input != 9);
    }
    public void productInput() {
        if(count > 10){
            System.out.println("제품 DB가 가득 찼습니다.");
            System.out.println("새 상품을 추가하려면 DB를 확장하여주세요.");
            return;
        }
        // 키보드로 도서 정보를 입력 받아 객체 생성
        System.out.println("===== 제품 정보를 입력해주세요. =====");
        System.out.print("ID : ");
        int pid = sc.nextInt();
        sc.nextLine();

        System.out.print("제품명 : ");
        String pName = sc.nextLine();

        System.out.print("가격 : ");
        int price = sc.nextInt();
        sc.nextLine();

        System.out.print("세율 : ");
        double tax = sc.nextDouble();
        sc.nextLine();

        ProductDTO newProduct = new ProductDTO(pid, pName, price,tax);
        // -> Product 생성자 내부에서 ProductController의 count 클래스 변수 값이 1씩 증가
        // 현재 카운트 인덱스에 생성한 주소 저장
        pro[count - 1] = newProduct;

        System.out.println(count + "에 추가");
    }
    public void productPrint() {
        // 현재까지 기록된 도서 정보 모두 출력
        for(int i=0; i<count;i++){
            System.out.println(pro[i].information());
        }
    }
    // 추가적으로 제품 삭제, 수정, 검색 등등의 메소드를 응용해서 추가해보세요~

}
