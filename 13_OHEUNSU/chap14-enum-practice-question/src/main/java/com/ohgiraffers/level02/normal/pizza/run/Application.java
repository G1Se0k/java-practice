package com.ohgiraffers.level02.normal.pizza.run;

import com.ohgiraffers.level02.normal.pizza.model.Topping;

import java.util.EnumSet;

public class Application {

    public static void main(String[] args) {
        EnumSet<Topping> allToppings = EnumSet.allOf(Topping.class);
        EnumSet<Topping> chosen = EnumSet.of(Topping.OLIVE, Topping.CHEESE);
        EnumSet<Topping> rejected = EnumSet.complementOf(chosen);
        System.out.println("== 전체 토핑 == ");
        printToppings(allToppings);
        System.out.println("== 고른 토핑 == ");
        printToppings(chosen);
        System.out.println("고른 토핑 합계 : " + totalPrice(chosen) + "원");
        System.out.println("== 고르지 않은 토핑 == ");
        printToppings(rejected);
    }

    private static void printToppings(EnumSet<Topping> toppings){

        toppings.stream().forEach(topping -> System.out.println(topping.getLabel() + " : " + topping.getPrice() + "원"));
    }

    private static int totalPrice(EnumSet<Topping> toppings){

        return toppings.stream().map(Topping::getPrice).reduce(Integer::sum).get();
    }
}
