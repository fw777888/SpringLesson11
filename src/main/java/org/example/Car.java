package org.example;

public class Car {
    String model;
    String color;
    Integer power;

    public Car(String model, String color, Integer power) {
        this.model = model;
        this.color = color;
        this.power = power;
    }

    private void init() {
        System.out.println("Car is created");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }
}
