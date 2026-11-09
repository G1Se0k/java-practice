package com.ohgiraffers.level02.normal.pizza.run;

import com.ohgiraffers.level02.normal.pizza.model.Topping;

import java.util.EnumSet;

public class Application {

    public static void main(String[] args) {

        System.out.println("== 전체 토핑 ==");
        EnumSet<Topping> allToppings = EnumSet.allOf(Topping.class);
        printToppings(allToppings);

        System.out.println("== 고른 토핑 ==");
        EnumSet<Topping> chooseToppings = EnumSet.of(Topping.CHEESE, Topping.OLIVE);
        printToppings(chooseToppings);
        System.out.println("고른 토핑 합계 : " + totalPrice(chooseToppings) + "원");

        System.out.println("== 고르지 않은 토핑 ==");
        EnumSet<Topping> complement = EnumSet.complementOf(chooseToppings);
        printToppings(complement);
    }

    private static void printToppings(EnumSet<Topping> toppings) {
        for (Topping topping : toppings) {
            System.out.println(topping.getLabel() + " : " + topping.getPrice() + "원");
        }
    }

    private static int totalPrice(EnumSet<Topping> toppings) {
        int totalPrice = 0;
        for (Topping topping : toppings) {
            totalPrice += topping.getPrice();
        }
        return totalPrice;
    }
}
