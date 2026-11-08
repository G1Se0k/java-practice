package com.ohgiraffers.api.object;

public class App {

    public static void main(String[] args) {

        Car myCar = new Car("Sonata", "검정", 2500);
        Car yourCar = new Car("Sonata", "검정", 2500);

        System.out.println(myCar.equals(yourCar));
        System.out.println(myCar.hashCode() == yourCar.hashCode());

        Car hisCar = new Car("Sonata","화이트", 2000);
        System.out.println(myCar.equals(hisCar));
        System.out.println(myCar.hashCode() == hisCar.hashCode());

    }
}
