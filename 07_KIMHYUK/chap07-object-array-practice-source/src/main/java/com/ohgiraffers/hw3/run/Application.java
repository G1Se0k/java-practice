package com.ohgiraffers.hw3.run;

import com.ohgiraffers.hw3.controller.ProductController;
import com.ohgiraffers.hw3.model.dto.ProductDTO;

public class Application {

    public static void main(String[] args) {

        ProductController controller = new ProductController();

        controller.mainMenu();

    }
}
