package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext
                ("springConfig.xml");
        Car car = context.getBean("car", Car.class);
        System.out.println(car);

        Bike bike = context.getBean("bike", Bike.class);
        System.out.println(bike);

        Truck truck = context.getBean("truck", Truck.class);
        System.out.println(truck);

        Cat cat = context.getBean("cat", Cat.class);
        System.out.println(cat);

        Dog dog = context.getBean("dog", Dog.class);
        System.out.println(dog);

        Smartphone phone = context.getBean("phone", Smartphone.class);
        System.out.println(phone);

        Laptop laptop = context.getBean("laptop", Laptop.class);
        System.out.println(laptop);

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
    }
}