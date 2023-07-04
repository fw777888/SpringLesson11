package org.example;

public class Dog {
    String name;
    String color;
    int age;
    boolean isHome;

    private void voice() {
        System.out.println("Rrrrrrrrrr!!!!");
    }

    public Dog(String name, String color, int age, boolean isHome) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.isHome = isHome;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", isHome=" + isHome +
                '}';
    }
}
