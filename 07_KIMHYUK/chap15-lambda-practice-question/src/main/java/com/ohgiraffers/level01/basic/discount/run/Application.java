package com.ohgiraffers.level01.basic.discount.run;

import com.ohgiraffers.level01.basic.discount.model.DiscountCalculator;
import com.ohgiraffers.level01.basic.discount.model.TenPercentDiscount;

public class Application {

    public static void main(String[] args) {

        int price = 25000;

        DiscountCalculator calculator = new TenPercentDiscount();
        System.out.println("구현 클래스 : " + calculator.calculate(price) + "원");

        DiscountCalculator secretDiscount = new DiscountCalculator() {
            @Override
            public int calculate(int price) {
                return (int) (price * 0.9);
            }
        };
        System.out.println("익명 클래스 : " + secretDiscount.calculate(price) + "원");

        DiscountCalculator lambdaDiscount = p -> (int) (p * 0.9);
        System.out.println("람다식 : " + lambdaDiscount.calculate(price) + "원");

        DiscountCalculator minus3000 = p -> p - 3000;
        System.out.println("3000원 할인 : " + minus3000.calculate(price) + "원");
    }
}
