package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
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
            System.out.println("3. 제품 검색");
            System.out.println("4. 제품 수정");
            System.out.println("5. 제품 삭제");
            System.out.println("9. 프로그램 종료");

            input = sc.nextInt();
            sc.nextLine();

            switch (input){
                case 1: productInput(); break;
                case 2: productPrint(); break;
                case 3: searchProduct(); break;
                case 4: modifyProduct(); break;
                case 5: dropProduct(); break;
                case 9: break;
                default:
                    System.out.println("올바른 값을 입력해주세요. (1, 2, 3, 4, 5, 9)");
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

    // 제품 삭제
    public void dropProduct(){
        if (count == 0){
            System.out.println("등록된 제품이 없습니다.");
            return;
        }

        for(int i=0; i<count;i++){
            System.out.println(i +". " + pro[i].information());
        }
        int input;
        while(true){
            System.out.print("삭제할 제품의 번호를 입력해주세요 : ");
            input = sc.nextInt();
            sc.nextLine();

            if(input < 0 || input > count){
                System.out.println("존제하지않는 제품 번호입니다.");
                continue;
            }
            break;
        }

        pro[input] = null;

        for (int i = input; i < pro.length - 1; i++){
            pro[i] = pro[i+1];
        }
        count--;
        System.out.println("정상적으로 제품이 삭제되었습니다.");
    }

    // 제품 수정
    public void modifyProduct(){
        if (count == 0){
            System.out.println("등록된 제품이 없습니다.");
            return;
        }

        for(int i=0; i < count;i++){
            System.out.println(i +". " + pro[i].information());
        }
        int input;

        while(true){
            System.out.print("수정할 제품의 번호를 입력해주세요 : ");
            input = sc.nextInt();
            sc.nextLine();

            if(input < 0 || input > count){
                System.out.println("존제하지않는 제품 번호입니다.");
                continue;
            }
            break;
        }

        ProductDTO selectedProduct = pro[input];
        boolean isSuccess = false;

        while(true){
            System.out.println(selectedProduct.information());
            System.out.println("수정할 항목을 선택해주세요.");
            System.out.println("1. ID | 2. 제품명 | 3. 가격 | 4. 세율");
            int select = sc.nextInt();
            sc.nextLine();

            switch (select){
                case 1: {
                    System.out.println("수정 후 ID를 입력해주세요 : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    selectedProduct.setPid(id);
                    isSuccess=true;
                }break;
                case 2: {
                    System.out.println("수정 후 제품명을 입력해주세요 : ");
                    String name = sc.nextLine();
                    selectedProduct.setPName(name);
                    isSuccess=true;
                }break;
                case 3: {
                    System.out.println("수정 후 가격을 입력해주세요 : ");
                    int price = sc.nextInt();
                    sc.nextLine();
                    selectedProduct.setPrice(price);
                    isSuccess=true;
                }break;
                case 4: {
                    System.out.println("수정 후 세율을 입력해주세요 : ");
                    double tax = sc.nextDouble();
                    sc.nextLine();
                    selectedProduct.setTax(tax);
                    isSuccess=true;
                }break;
                default:
                    System.out.println("올바른 값을 입력해주세요. (1, 2, 3, 9)");
                    break;
            }
            if(isSuccess){
                System.out.println("정상적으로 제품이 수정되었습니다.");
                break;
            }
        }
    }

    // 제품 검색
    public void searchProduct(){
        if (count == 0){
            System.out.println("등록된 제품이 없습니다.");
            return;
        }

        while(true){
            System.out.println("검색할 방식을 선택해주세요.");
            System.out.println("1. ID | 2. 제품명");
            int select = sc.nextInt();
            sc.nextLine();

            int searched = 0;
            boolean isSuccess = false;
            switch(select){
                case 1: {
                    System.out.print("ID로 검색 : ");
                    int input = sc.nextInt();
                    sc.nextLine();

                    for(ProductDTO e : pro){
                        if (e == null) break;
                        if(e.getPid() == input){
                            System.out.println(e.information());
                            searched++;
                        }
                        isSuccess = true;
                    }
                }break;
                case 2: {
                    System.out.print("제품명으로 검색 : ");
                    String input = sc.nextLine();

                    for(ProductDTO e : pro){
                        if (e == null) break;
                        if(e.getPName().contains(input)){
                            System.out.println(e.information());
                            searched++;
                        }
                        isSuccess = true;
                    }
                }break;
                default:
                    System.out.println("올바른 값을 입력해주세요. (1, 2)");
                    break;
            }

            if(isSuccess && searched == 0){
                System.out.println("결과가 없습니다.");
            }
            if(isSuccess) break;
        }
    }
}
