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

    static{
        count = 0;
    }

    public void mainMenu(){

        int button = 0;

        do{
            System.out.println("===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("원하는 메뉴의 번호를 입력해주세요: ");
            button = sc.nextInt();
            switch (button){
                case 1: {
                    this.productInput();
                    break;
                }
                case 2: {
                    this.productPrint();
                    break;
                }
                case 9: {
                    break;
                }
                default: System.out.println("잘못된 번호 입력입니다. 메뉴에 있는 번호를 눌러주세요.");
            }
        }while(button != 9);
    }

    public void productInput(){

        System.out.print("pId: ");
        int pId = sc.nextInt();
        System.out.print("pName: ");
        sc.nextLine();
        String pName = sc.nextLine();
        System.out.print("price: ");
        int price = sc.nextInt();
        System.out.print("tax: ");
        double tax = sc.nextDouble();

        this.pro[count] = new ProductDTO(pId, pName, price, tax);
    }

    public void productPrint(){

        for(int i = 0; i < count; i++){
            System.out.println(this.pro[i].information());
        }
    }
}
