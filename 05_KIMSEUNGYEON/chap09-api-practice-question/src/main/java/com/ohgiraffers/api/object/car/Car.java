package com.ohgiraffers.api.object.car;

public class Car {

    private String carName;
    private String carColor;
    private int engineCC;

    public Car() {
    }

    public Car(String carName, String carColor, int engineCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Car car = (Car) obj;

        if (!carName.equals(car.carName)) {
            return false;
        }
        return carColor.equals(car.carColor);
    }

    @Override
    public int hashCode() {
        int result = carName.hashCode();
        result = 31 * result + carColor.hashCode();
        return result;
    }
}
