package com.ohgiraffers.level02.normal.order.run;

import com.ohgiraffers.level02.normal.order.controller.OrderController;
import com.ohgiraffers.level02.normal.order.exception.OutOfStockException;
import com.ohgiraffers.level02.normal.order.model.dto.Inventory;

public class Application {
    public static void main(String[] args) {
        // 1. 재고 5개인 Inventory와 OrderController를 만든다
        Inventory inventory = new Inventory(5);
        OrderController orderController = new OrderController(inventory);
        // 2. 3개를 주문하고, 성공·실패를 출력한 뒤 finally로 처리 끝 줄을 출력한다
        order(orderController,3);
        // 3. 10개를 주문하고, 성공·실패를 출력한 뒤 finally로 처리 끝 줄을 출력한다
        order(orderController,10);
    }

    public static void order(OrderController orderController, int qty){
        try {
            orderController.placeOrder(qty);
            System.out.println("주문 성공");
        } catch (OutOfStockException e) {
            System.out.println("주문 실패 : " + e.getMessage());
        }
        finally {
            System.out.println("주문 처리 끝");
        }
    }
}
