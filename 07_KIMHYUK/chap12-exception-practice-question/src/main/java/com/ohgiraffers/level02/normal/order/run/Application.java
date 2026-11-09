package com.ohgiraffers.level02.normal.order.run;

import com.ohgiraffers.level02.normal.order.controller.OrderController;
import com.ohgiraffers.level02.normal.order.model.dto.Inventory;

public class Application {

    public static void main(String[] args) {

        Inventory inventory = new Inventory(5);

        OrderController controller = new OrderController(inventory);

        controller.placeOrder(3);

        controller.placeOrder(10);
    }
}
