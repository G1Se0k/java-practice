package com.ohgiraffers.level01.basic.discount.run;

import com.ohgiraffers.level01.basic.discount.model.DiscountCalculator;
import com.ohgiraffers.level01.basic.discount.model.TenPercentDiscount;

public class Application {
    public static void main(String[] args) {
        int price = 25000;
        // 1. 구현 클래스 TenPercentDiscount로 할인 가격을 출력한다
        TenPercentDiscount discount = new TenPercentDiscount();
        System.out.println("구현 클래스 : " + discount.calculate(price));
        // 2. 익명 클래스로 같은 할인을 구현해 출력한다
        DiscountCalculator discount1 = new DiscountCalculator() {
            @Override
            public int calculate(int price) {
                return (int)(price * 0.9f);
            }
        };
        System.out.println("익명 클래스 : " + discount1.calculate(price));
        // 3. 람다식으로 같은 할인을 구현해 출력한다
        DiscountCalculator discount2 = (p) -> (int)(p * 0.9f);
        System.out.println("람다식 : " + discount2.calculate(price));
        // 4. 3000원을 빼는 람다식을 하나 더 만들어 출력한다
        DiscountCalculator discount3000 = (p) -> p - 3000;
        System.out.println("3000원 할인 : " + discount3000.calculate(price));
    }
}
