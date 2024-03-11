package hu.webler.domain;

import java.util.Arrays;

public class Human extends LivingCreature implements HumanActivity, CommonActivity{


    private String gender;

    public Human() {

    }

    public Human(String name, int age, String[] colors, String gender) {
        super(name, age, colors);
        this.gender = gender;
    }
    @Override
    void feed() {
        System.out.println("Human is being fed.");
    }

    @Override
    public void speak() {
        System.out.println("Greetings");
    }

    @Override
    public void think() {
        System.out.println("Thoughts");
    }

    @Override
    public void move() {
        System.out.println("Human is running.");
    }

    @Override
    public void sleep() {
        System.out.println("Human sleeps for 8 hours everyday.");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + super.getName() + '\'' +
                ", age='" + super.getAge() + '\'' +
                ", color='" + Arrays.toString(this.getColors()) + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
