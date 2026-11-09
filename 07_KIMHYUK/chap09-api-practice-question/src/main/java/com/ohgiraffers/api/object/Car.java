package com.ohgiraffers.api.object;

import java.util.Objects;

public class Car {

        private String carName;
        private String carColor;
        private int engineCC;
        // ...


    public Car(String carName, String carColor, int engineCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName,carColor);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Car)) {
            return false;
        }
        Car other = (Car) obj;
        return this.carName.equals(other.carName) && this.carColor.equals(other.carColor);
    }
}
