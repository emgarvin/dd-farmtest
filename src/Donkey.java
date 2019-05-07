public class Donkey implements Animal {
    private String name;
    private double weightInKg;

    public Donkey(String name, double weightInKg) {
        this.name = name;
        this.weightInKg = weightInKg;
    }

    @Override public void speak() {
        System.out.println("I'm so depressed.");
    }

    @Override public void breath() {
        System.out.println("[Breathing noises.]");
    }

    @Override public void eat() {
        System.out.println("[Sad chomping.]");
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
}
