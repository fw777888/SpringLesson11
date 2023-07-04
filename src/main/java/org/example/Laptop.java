package org.example;

public class Laptop {
    String model;
    String color;
    int ram;
    int ssd;
    boolean isIps;

    private void turnOn() {
        System.out.println("Laptop is started");
    }

    public Laptop(String model, String color, int ram, int ssd, boolean isIps) {
        this.model = model;
        this.color = color;
        this.ram = ram;
        this.ssd = ssd;
        this.isIps = isIps;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", isIps=" + isIps +
                '}';
    }
}
