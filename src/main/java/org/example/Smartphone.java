package org.example;

public class Smartphone {
    String model;
    String os;
    int ram;
    int memory;
    boolean isOled;

    private void switchOn() {
        System.out.println("Phone is switched");
    }
    private void charge() {
        System.out.println("Charged 100%");
    }

    public Smartphone(String model, String os, int ram, int memory, boolean isOled) {
        this.model = model;
        this.os = os;
        this.ram = ram;
        this.memory = memory;
        this.isOled = isOled;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", os='" + os + '\'' +
                ", ram=" + ram +
                ", memory=" + memory +
                ", isOled=" + isOled +
                '}';
    }
}
