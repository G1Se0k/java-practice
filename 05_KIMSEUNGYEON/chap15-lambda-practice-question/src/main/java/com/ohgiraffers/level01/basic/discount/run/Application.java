package com.ohgiraffers.level01.basic.discount.run;

import com.ohgiraffers.level01.basic.discount.model.DiscountCalculator;
import com.ohgiraffers.level01.basic.discount.model.TenPercentDiscount;

import java.util.function.IntBinaryOperator;

public class Application {

    public static void main(String[] args) {

        // 1. 구현 클래스 TenPercentDiscount로 할인 가격을 출력한다
        TenPercentDiscount discount = new TenPercentDiscount();
        int price = 25000;
        System.out.println("구현 클래스 : " + discount.calculator(price) + "원");

        // 2. 익명 클래스로 같은 할인을 구현해 출력한다
        DiscountCalculator calculator2 = new DiscountCalculator() {
            @Override
            public int calculator(int price) {
                return price - ((price*10)/100);
            }
        };
        System.out.println("익명 클래스 : " + calculator2.calculator(price) + "원");

        // 3. 람다식으로 같은 할인을 구현해 출력한다
        DiscountCalculator calculator3 = p -> p - ((p*10)/100);
        System.out.println("람다식 : " + calculator3.calculator(price));

        // 4. 3000원을 빼는 람다식을 하나 더 만들어 출력한다
        DiscountCalculator calculator4 = p -> p - 3000;
        System.out.println("3000원 할인 : " + calculator4.calculator(price) + "원");

    }
}
