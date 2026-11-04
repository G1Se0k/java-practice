package com.ohgiraffers.api.object.car;

public class App {

    public static void main(String[] args) {

        // 다음 Car클래스를 이용한 App의 실행 코드가 적절히 실행될 수 있도록 메소드를 오버라이드하세요.

        Car myCar = new Car("Sonata", "검정", 2000);
        Car yourCar = new Car("Sonata", "검정", 2500);

        System.out.println(myCar.equals(yourCar)); // true
        System.out.println(myCar.hashCode() == yourCar.hashCode()); // true

        Car hisCar = new Car("Sonata", "화이트", 2000);
        System.out.println(myCar.equals(hisCar)); // false
        System.out.println(myCar.hashCode() == hisCar.hashCode()); // false
    }
}
