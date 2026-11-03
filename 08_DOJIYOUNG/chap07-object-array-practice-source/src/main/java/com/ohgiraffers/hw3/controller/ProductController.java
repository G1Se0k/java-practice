package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    private ProductDTO[] pros; // = null
    public int count; // 현재 추가된 객체 수
    Scanner sc = new Scanner(System.in);


    // 초기화 블록을 이용하여 10개 배열
    {
        pros = new ProductDTO[10];
    }

    public void mainMenu(){
        int user =0;

        do{
            String menu = """
                       ===== 제품 관리 메뉴 =====
                       1. 제품 정보 추가 
                       2. 제품 전체 조회 
                       9. 프로그램 종료
                    """;
            System.out.println(menu);
            System.out.print("메뉴보고 고르기 : ");
            user = sc.nextInt();

            switch (user){
                case 1:
                    productInput();
                    break;
                case 2:
                    productPrint();
                    break;
                case 9:
                    System.out.println("9 눌러서 종료.");
                    break;
                default:
                    System.out.println("1,2,9 중에서만 누르세요");
                    break;
            }

        }while(user!=9 && count<10);
    }

    public void productInput(){
        int pId;
        String pName;
        int price;
        double tax;
        System.out.print("pId : ");
        pId = sc.nextInt();
        System.out.print("pName : ");
        pName = sc.next();
        System.out.print("price : ");
        price = sc.nextInt();
        System.out.print("tax : ");
        tax = sc.nextDouble();

        pros[count] = new ProductDTO(pId,pName,price,tax);
        count++;


    }

    public void productPrint(){
        for(int i=0; i<count; i++ ){
            System.out.println(pros[i].information());
        }

    }

}
