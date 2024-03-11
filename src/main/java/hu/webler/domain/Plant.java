package hu.webler.domain;

import javax.swing.plaf.metal.MetalBorders;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Plant extends LivingCreature {

    public Plant() {

    }

    public Plant(String name, int age, String[] colors) {
        super(name, age, colors);
    }

    @Override
    void feed() {
        System.out.println("Plant is being watering.");
    }

    @Override
    public String toString() {
        return "Omnivore{" +
                "name='" + super.getName() + '\'' +
                ", age='" + super.getAge() + '\'' +
                ", color='" + Arrays.toString(this.getColors()) + '\'' +
                '}';
    }
}
