package hu.webler.domain;

import java.util.Arrays;

public class Herbivore extends Animal {

    public Herbivore() {

    }

    public Herbivore(String name, int age, String[] colors, String gender) {
        super(name, age, colors, gender);
    }

    @Override
    public void feed() {
        System.out.println("Eating plants!");
    }

    @Override
    public void move() {
        System.out.println("Rabbit jumps!");
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "name='" + super.getName() + '\'' +
                ", age='" + super.getAge() + '\'' +
                ", color='" + Arrays.toString(this.getColors()) + '\'' +
                ", gender='" + super.getGender() + '\'' +
                '}';
    }
}
