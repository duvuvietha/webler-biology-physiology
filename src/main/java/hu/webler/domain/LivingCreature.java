package hu.webler.domain;

public abstract class LivingCreature {

    public static int creatureCounter;
    private String name;
    private int age;
    private String[] colors;

    public LivingCreature() {
        this("", 0, null);
    }

    public LivingCreature(String name, int age, String[] colors) {
        creatureCounter++;
        this.name = name;
        this.age = age;
        this.colors = colors;
    }

    abstract void feed();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public  void setAge(int age) {
        this.age = age;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }


}
