package org.example;

public class Bike {
    String model;
    String color;
    int power;

    @Override
    public String toString() {
        return "Bike{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }
    public Bike(String model, String color, int power) {
        this.model = model;
        this.color = color;
        this.power = power;
    }
}
