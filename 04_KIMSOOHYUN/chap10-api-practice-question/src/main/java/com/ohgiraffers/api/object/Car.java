package com.ohgiraffers.api.object;

import java.util.Objects;

public class Car {
        private String carName;
        private String carColor;
        private int engineCC;

        public Car() {
                super();
        }

        public Car(String carName, String carColor, int engineCC) {
                this.carName = carName;
                this.carColor = carColor;
                this.engineCC = engineCC;
        }

        public String getCarName() {
                return carName;
        }

        public void setCarName(String carName) {
                this.carName = carName;
        }

        public String getCarColor() {
                return carColor;
        }

        public void setCarColor(String carColor) {
                this.carColor = carColor;
        }

        public int getEngineCC() {
                return engineCC;
        }

        public void setEngineCC(int engineCC) {
                this.engineCC = engineCC;
        }

        @Override
        public String toString() {
                return carName + " " +  carColor + " " + engineCC;
        }

        @Override
        public boolean equals(Object obj) {
                if (obj == null || getClass() != obj.getClass()) return false;
                Car car = (Car) obj;
                return Objects.equals(carName, car.carName) && Objects.equals(carColor, car.carColor);
        }

        @Override
        public int hashCode() {
                return Objects.hash(carName, carColor);
        }
}
