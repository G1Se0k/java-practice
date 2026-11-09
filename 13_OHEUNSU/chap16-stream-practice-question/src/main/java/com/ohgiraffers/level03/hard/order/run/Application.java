package com.ohgiraffers.level03.hard.order.run;

import com.ohgiraffers.level03.hard.order.controller.OrderAnalyzer;
import com.ohgiraffers.level03.hard.order.model.dto.OrderDTO;
import com.ohgiraffers.level03.hard.order.model.dto.OrderItem;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        OrderAnalyzer orderAnalyzer = new OrderAnalyzer(List.of(
                new OrderDTO(1, "한지민", List.of(
                        new OrderItem("키보드", 35000, 1),
                        new OrderItem("마우스패드", 8000, 2))),
                new OrderDTO(2, "오세훈", List.of(
                        new OrderItem("볼펜", 1500, 10))),
                new OrderDTO(3, "서다은", List.of(
                        new OrderItem("노트", 3000, 4),
                        new OrderItem("형광펜", 2000, 3),
                        new OrderItem("파일철", 2500, 2))),
                new OrderDTO(4, "문태윤", List.of(
                        new OrderItem("모니터암", 42000, 1),
                        new OrderItem("USB 허브", 18000, 1)))
        ));

        System.out.println("전체 수량 : " + orderAnalyzer.totalQuantity() + "개");
        System.out.println("총매출 : " + orderAnalyzer.totalSales() + "원");
        System.out.println("5만 원 이상 주문 있음 : " + orderAnalyzer.hasBigOrder(50000));
        System.out.println("모든 주문에 품목 있음 : " + orderAnalyzer.allHaveItems());
        System.out.println("상위 2명 : " + orderAnalyzer.topCustomers(2));
    }
}
