package com.ohgiraffers.level02.normal.pizza.run;

import com.ohgiraffers.level02.normal.pizza.model.Topping;

import java.util.EnumSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        // 1. 전체 토핑을 EnumSet으로 만들어 출력한다
        EnumSet<Topping> toppings = EnumSet.allOf(Topping.class);

        System.out.println("== 전체 토핑 ==");
        printToppings(toppings);
        // 2. 올리브와 치즈만 담은 EnumSet을 만들어 출력하고 합계를 출력한다
        EnumSet<Topping> selectedToppings = EnumSet.of(Topping.OLIVE, Topping.CHEESE);
        System.out.println("== 고른 토핑 ==");
        printToppings(selectedToppings);
        System.out.println("고른 토핑 합계 : " + totalPrice(selectedToppings) + "원");
        // 3. 고르지 않은 토핑을 EnumSet으로 만들어 출력한다
        System.out.println("== 고르지 않은 토핑 ==");
        EnumSet<Topping> unSelectedToppings = EnumSet.complementOf(selectedToppings);
        printToppings(unSelectedToppings);

    }
    private static void printToppings(EnumSet<Topping> toppings){
        for (Topping topping : toppings){
            System.out.println(topping.getLabel() + " : " + topping.getPrice() + "원");
        }
    }
    private static int totalPrice(EnumSet<Topping> toppings){
        int totalPrice = 0;
        for (Topping topping : toppings){
            totalPrice += topping.getPrice();
        }
        return totalPrice;
    }
}
