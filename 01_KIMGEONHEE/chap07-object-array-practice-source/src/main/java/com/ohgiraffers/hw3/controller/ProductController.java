package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {

    private ProductDTO[] pro;

    public static int count;

    Scanner sc = new Scanner(System.in);

    {
        pro = new ProductDTO[10];
    }

    public void mainMenu(){

        int num;

        do{
            System.out.println("""
                    ========= 제품 관리 메뉴 ========
                    1. 제품 정보 추가
                    2. 제품 전체 조회
                    9. 프로그램 종료
                    """);
            num = sc.nextInt();
            switch (num){
                case 1: {
                    this.productInput();
                    break;
                }
                case 2:{
                    this.productPrint();
                    break;
                }
                case 9:{
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                default:{
                    System.out.println("잘못된 입력입니다.");
                    break;
                }
            }
        } while(num!=9);

    }

    public void productInput(){

        int pId;
        String pName;
        int price;
        double tax;

        System.out.print("제품 번호 : ");
        pId =sc.nextInt();
        System.out.print("제품명 : ");
        pName = sc.next();
        System.out.print("제품 가격 : ");
        price = sc.nextInt();
        System.out.print("제품 세금 : ");
        tax = sc.nextDouble();

        pro[count]=new ProductDTO(pId,pName,price,tax);

    }

    public void productPrint(){
        for(int i=0; i<count; i++){
            System.out.println(pro[i].information());
        }

    }



}
