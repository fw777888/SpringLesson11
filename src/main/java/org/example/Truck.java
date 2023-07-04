package org.example;

public class Truck {
    String model ;
    String color;
    int power;

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }

    public Truck(String model, String color, int power) {
        this.model = model;
        this.color = color;
        this.power = power;
    }
}
