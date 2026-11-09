package com.ohgiraffers.level03.hard.order.run;

import com.ohgiraffers.level03.hard.order.controller.OrderAnalyzer;
import com.ohgiraffers.level03.hard.order.model.dto.OrderDTO;
import com.ohgiraffers.level03.hard.order.model.dto.OrderItem;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        // 1. 주문 4건
        List<OrderDTO> orders = List.of(

                new OrderDTO(
                        1,
                        "한지민",
                        List.of(
                                new OrderItem("키보드", 35000, 1),
                                new OrderItem("마우스패드", 8000, 2)
                        )
                ),

                new OrderDTO(
                        2,
                        "오세훈",
                        List.of(
                                new OrderItem("볼펜", 1500, 10)
                        )
                ),

                new OrderDTO(
                        3,
                        "서다은",
                        List.of(
                                new OrderItem("노트", 3000, 4),
                                new OrderItem("형광펜", 2000, 3),
                                new OrderItem("파일철", 2500, 2)
                        )
                ),

                new OrderDTO(
                        4,
                        "문태윤",
                        List.of(
                                new OrderItem("모니터암", 42000, 1),
                                new OrderItem("USB 허브", 18000, 1)
                        )
                )
        );

        // 2. OrderAnalyzer 생성
        OrderAnalyzer analyzer = new OrderAnalyzer(orders);

        // 3. 전체 수량 / 총매출
        System.out.println("전체 수량 : " + analyzer.totalQuantity() + "개");
        System.out.println("총매출 : " + analyzer.totalSales() + "원");

        // 4. 조건 검사
        System.out.println("5만 원 이상 주문 있음 : " + analyzer.hasBigOrder(50000));
        System.out.println("모든 주문에 품목 있음 : " + analyzer.allHaveItems());

        // 5. 주문 금액 상위 2명
        System.out.println("상위 2명 : " + analyzer.topCustomers(2));
    }
}