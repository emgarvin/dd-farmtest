public class Sheep implements Animal {
    private String name;
    private double weightInKg;

    public Sheep(String name, double weightInKg) {
        this.name = name;
        this.weightInKg = weightInKg;
    }

    @Override public void speak() {
        System.out.println("Baa baa baaaaa baa.");
    }

    @Override public void breath() {
        System.out.println("[Breathing noises.]");
    }

    @Override public void eat() {
        System.out.println("Monch monch.");
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
