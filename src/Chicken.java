public class Chicken implements Animal {
    private String name;
    private double weightInKg;

    public Chicken(String name, double weightInKg) {
        this.name = name;
        this.weightInKg = weightInKg;
    }

    @Override public void speak() {
        System.out.println("Bawk bawk.");
    }
    @Override public void breath() {
        System.out.println("[Breathing noises.]");
    }
    @Override public void eat() {
        System.out.println("Peck peck");
    }
    @Override public void sleep() {
        System.out.println("Zzzz.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeightInKg() {
        return weightInKg;
    }

    public void fly() {System.out.println("I'm freeeeeeeee! ... oh wait. [Icarusmoment].");}
}
