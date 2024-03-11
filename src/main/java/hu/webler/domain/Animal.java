package hu.webler.domain;

import java.util.Arrays;

public class Animal extends LivingCreature implements AnimalActivity, CommonActivity{

    private String gender;

    public Animal() {

    }

    public Animal(String name, int age, String[] colors, String gender) {
        super(name, age, colors);
        this.gender = gender;
    }

    @Override
    void feed() {
        System.out.println("Animal is being fed.");
    }

    @Override
    public void makeSound() {
        //implements
        System.out.println("Animal sound");
    }

    @Override
    public void move() {
        System.out.println("Waving");
    }

    @Override
    public void sleep() {
        System.out.println("Laying");
    }

    public  String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + super.getName() + '\'' +
                ", age='" + super.getAge() + '\'' +
                ", color='" + Arrays.toString(this.getColors()) + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
