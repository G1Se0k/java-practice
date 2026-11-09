package com.ohgiraffers.level02.normal.pizza.run;

import com.ohgiraffers.level02.normal.pizza.model.Topping;

import java.util.EnumSet;

public class Application {

    public static void main(String[] args) {

        // 1. 전체 토핑
        EnumSet<Topping> allToppings = EnumSet.allOf(Topping.class);

        System.out.println("== 전체 토핑 ==");
        printToppings(allToppings);

        // 2. 올리브와 치즈 선택
        EnumSet<Topping> selectedToppings = EnumSet.of(Topping.OLIVE, Topping.CHEESE);

        System.out.println("== 고른 토핑 ==");
        printToppings(selectedToppings);
        System.out.println("고른 토핑 합계 : " + totalPrice(selectedToppings) + "원");

        // 3. 고르지 않은 토핑
        EnumSet<Topping> unselectedToppings = EnumSet.complementOf(selectedToppings);

        System.out.println("== 고르지 않은 토핑 ==");
        printToppings(unselectedToppings);
    }

    private static void printToppings(
            EnumSet<Topping> toppings) {

        for (Topping topping : toppings) {
            System.out.println(topping.getLabel() + " : " + topping.getPrice() + "원");
        }
    }

    private static int totalPrice(
            EnumSet<Topping> toppings) {

        int total = 0;

        for (Topping topping : toppings) {
            total += topping.getPrice();
        }

        return total;
    }
}