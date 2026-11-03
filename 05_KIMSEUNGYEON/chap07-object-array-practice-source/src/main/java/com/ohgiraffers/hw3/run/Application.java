package com.ohgiraffers.hw3.run;

import com.ohgiraffers.hw3.controller.ProductController;

public class Application {

    private static ProductController controller = new ProductController();

    public Application(ProductController controller) {
        Application.controller = controller;
    }

    public static void main(String[] args) {

        controller.meinManu();

    }
}
