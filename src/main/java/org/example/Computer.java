package org.example;

public class Computer {
    String model;
    String processorModel;
    int ram;
    int ssd;

    private void startComp() {
        System.out.println("Computer is started");
    }

    public Computer(String model, String processorModel, int ram, int ssd) {
        this.model = model;
        this.processorModel = processorModel;
        this.ram = ram;
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", processorModel='" + processorModel + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                '}';
    }
}
