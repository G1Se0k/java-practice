package com.ohgiraffers.level01.basic.discount.run;

import com.ohgiraffers.level01.basic.discount.model.DiscountCalculator;
import com.ohgiraffers.level01.basic.discount.model.TenPercentDiscount;

import java.util.function.Function;

public class Application {

    public static void main(String[] args) {

        int price = 25000;
        DiscountCalculator implementClass = new TenPercentDiscount();
        int discounted1 = implementClass.calculate(price);
        System.out.println("구현 클래스 : " + discounted1 + "원");

        DiscountCalculator anonymousClass = new DiscountCalculator() {
            @Override
            public int calculate(int price) {
                return (price * 90) / 100;
            }
        };
        int discounted2 = anonymousClass.calculate(price);
        System.out.println("익명 클래스 : " + discounted2 + "원");

        DiscountCalculator lambdaCalc1 = a -> (a * 90) / 100;
        int discounted3 = lambdaCalc1.calculate(price);
        System.out.println("람다식 : " + discounted3 + "원");

        DiscountCalculator lambdaCalc2 = a -> a - 3000;
        int discounted4 = lambdaCalc2.calculate(price);
        System.out.println("3000원 할인 : " + discounted4 + "원");


    }
}
