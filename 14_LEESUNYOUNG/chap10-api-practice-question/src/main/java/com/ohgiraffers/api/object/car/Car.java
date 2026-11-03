package com.ohgiraffers.api.object.car;

public class Car {
    private String carName;
    private String carColor;
    private int engineCC;

    public Car(String carName, String carColor, int engineCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Car)) return false;

        Car other = (Car) obj;
        return java.util.Objects.equals(carName, other.carName)
                && java.util.Objects.equals(carColor, other.carColor);
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(carName,carColor);
    }
}


