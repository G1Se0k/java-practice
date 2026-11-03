package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Arrays;
import java.util.Scanner;

public class ProductController {

    ProductDTO[] pd = new ProductDTO[10];
    int pCount = 0;
    Scanner sc = new Scanner(System.in);

    public void meinManu() {

        int menuNum = 0;

        do {
            System.out.println("========= 제품 관리 메뉴 =========");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("3. 제품 정보 수정");
            System.out.println("4. 제품 정보 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.print("원하시는 메뉴 번호를 입력해주세요 : ");
            menuNum = sc.nextInt();
            switch (menuNum) {

                case 1 :
                    System.out.println("제품 정보 추가");
                    productInput();
                    break;

                case 2 :
                    System.out.println("제품 전체 조회");
                    if(checkNoData()) {
                        productPrint();
                        break;
                    }
                    break;

                case 3 :
                    System.out.println("제품 수정");
                    if(checkNoData()) {
                        productUpdate();
                        break;
                    }
                    break;

                case 4 :
                    System.out.println("제품 삭제");
                    if(checkNoData()) {
                        productDelete();
                        break;
                    }
                    break;

                case 9 :
                    System.out.println("제품관리 프로그램을 종료합니다.");
                    break;
            }
        } while (menuNum != 9);

    }

    public void productInput() {
        boolean checkPid = true;
        System.out.print("제품 번호를 입력해주세요 :");
        int pNum = sc.nextInt();

        while(checkPid) {
            if(pCount >= 1) {
                if(findProduct(pNum) != null) {
                    System.out.println("중복되는 제품 번호입니다. 다른 번호를 입력해주세요. :");
                    pNum = sc.nextInt();
                } else {
                    break;
                }
            } else {
                checkPid = false;
            };
        }
        System.out.print("제품명을 입력해주세요 :");
        String pName = sc.next();
        System.out.print("제품 가격을 입력해주세요 :");
        int price = sc.nextInt();
        System.out.print("제품 세금을 입력해주세요 :");
        double tax = sc.nextDouble();

        pd[pCount] = new ProductDTO(pNum, pName, price, tax);
        pCount++;

        System.out.println("제품 등록에 성공했습니다.");
    }

    public void productPrint() {
        if(pCount == 0) {
            System.out.println("등록된 제품이 없습니다. 등록을 먼저 진행해주세요.");
        } else {
            for(int i = 0; i < pCount; i++) {
                System.out.println(pd[i].information());
            }
        }
    }

    public void productUpdate(){
        int updateMenuNum = 0;
        do {
            System.out.println("제품 수정 메뉴 입니다.");
            System.out.println("원하는 메뉴의 번호를 선택해주세요.");
            System.out.println("1. 제품 수정");
            System.out.println("9. 제품 수정 종료 - 메인 메뉴로 이동");
            updateMenuNum = sc.nextInt();
            switch(updateMenuNum) {
                case 1 :
                    System.out.println("=========== 제품 수정을 시작합니다. ===============");
                    System.out.print("수정을 원하는 제품의 번호를 입력하세요 :");
                    int selectedPid = sc.nextInt();
                    ProductDTO selectedProduct = findProduct(selectedPid);
                    if(selectedProduct != null) {

                        // do - while 처리로 반복 수정가능
                        int selectedUpdateInfoNum = 0;
                        System.out.println("수정을 원하시는 정보의 번호를 입력해주세요.");
                        System.out.println("1. 제품명 수정");
                        System.out.println("2. 제품 가격 수정");
                        System.out.println("3. 제품 세금 수정");
                        System.out.println("9. 제품 수정 종료");
                        selectedUpdateInfoNum = sc.nextInt();

                        switch (selectedUpdateInfoNum) {
                            case 1:
                                System.out.print("수정할 제품명 입력:");
                                String inputUpdateName = sc.next();
                                selectedProduct.setpName(inputUpdateName);
                                System.out.println("제품명 수정 완료");
                                System.out.println("다른 수정을 진행하시거나 종료해주세요.");
                                break;
                            case 2:
                                System.out.print("수정할 제품 가격 입력 :");
                                int inputUpdatePrice = sc.nextInt();
                                selectedProduct.setPrice(inputUpdatePrice);
                                System.out.println("제품 가격 수정완료");
                                System.out.println("다른 수정을 진행하시거나 종료해주세요.");
                                break;
                            case 3:
                                System.out.print("수정할 제품 세금 입력 :");
                                double inputUpdateTax = sc.nextDouble();
                                selectedProduct.setTax(inputUpdateTax);
                                System.out.println("제품 세금 수정완료");
                                System.out.println("다른 수정을 진행하시거나 종료해주세요.");
                                break;
                            case 9:
                                System.out.println("========== 제품 수정을 종료합니다. - 수정 메뉴로 이동합니다. ===========");
                                break;
                        }

                    } else {
                        System.out.println("존재하지 않는 제품번호 입니다. 다시 입력하시거나 수정을 종료해주세요.");
                        break;
                    }
                case 9 :
                    System.out.println("=========제품 수정 메뉴 종료. 메인 메뉴로 전환합니다.==========");
                    break;
            }

        } while (updateMenuNum != 9);
    }

    public void productDelete() {
        int deleteMenuNum = 0;
        do {
            System.out.println("제품 삭제 메뉴 입니다.");
            System.out.println("원하는 메뉴의 번호를 선택해주세요.");
            System.out.println("1. 제품 삭제");
            System.out.println("9. 제품 삭제 종료 - 메인 메뉴로 이동");
            deleteMenuNum = sc.nextInt();
            switch(deleteMenuNum) {
                case 1 :
                    System.out.println("=========== 제품 삭제을 시작합니다. ===============");
                    System.out.print("삭제를 원하는 제품의 번호를 입력하세요 :");
                    int selectedPid = sc.nextInt();
                    ProductDTO selectedProduct = findProduct(selectedPid);
                    int selectedProductIndex = 0;
                    if(selectedProduct != null) {
                        for(int i = 0; i < pCount; i++) {
                            if(pd[i].getPid() == selectedPid) {
                                selectedProductIndex = i;
                                break;
                            } else {
                                selectedProductIndex = 11;
                            }
                        }

//                        for(int i = selectedProductIndex; i < pCount - 1; i++) {
//                            pd[i] = pd[i+1];
//                        }

                        System.arraycopy(pd, selectedProductIndex +1, pd, selectedProductIndex,
                                pCount - selectedProductIndex - 1);
                        pd[pCount -1] = null;
                        pCount--;

                    } else {
                        System.out.println("존재하지 않는 제품번호 입니다. 다시 입력하시거나 삭제를 종료해주세요.");
                        break;
                    }

                case 9 :
                    System.out.println("=========제품 수정 메뉴 종료. 메인 메뉴로 전환합니다.==========");
                    break;
            }

        } while (deleteMenuNum != 9);
    }

    public boolean checkNoData() {
        if(pCount == 0) {
            System.out.println("등록된 제품이 없습니다. 등록을 먼저 진행해주세요.");
            return false;
        }
        return true;
    }

    public ProductDTO findProduct(int pId) {

        for(int i = 0; i < pCount; i++) {
            if(pd[i].getPid() == pId) {
                return pd[i];
            }
        }
        return null;
    }
}
