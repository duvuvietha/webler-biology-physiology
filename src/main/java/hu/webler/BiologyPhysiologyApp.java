package hu.webler;

import hu.webler.domain.Carnivore;
import hu.webler.domain.LivingCreature;
import hu.webler.domain.Omnivore;

public class BiologyPhysiologyApp {

    public static void main(String[] args) {

        Carnivore lion = new Carnivore("Lion", 5, new String[]{"Brown", "Gold", "White"}, "Male");
        System.out.println(lion);

        Omnivore rabbit = new Omnivore("Rabbit", 2, new String[] {"White"}, "Female");
        System.out.println(rabbit);

        int counter = LivingCreature.creatureCounter;
        counter = LivingCreature.creatureCounter;
        System.out.println(counter);
    }
}
