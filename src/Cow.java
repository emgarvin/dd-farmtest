public class Cow implements Animal {
    private String name;
    private double weightInKg;

    public Cow(String name, double weightInKg) {
        this.name = name;
        this.weightInKg = weightInKg;
    }

    @Override public void speak() {
        System.out.println("Moo moo mooamooers.");
    }

    @Override public void breath() {
        System.out.println("[Breathing noises.]");
    }

    @Override public void eat() {
        System.out.println("Nyom nyom.");
    }

    @Override public void sleep() {
        System.out.println("Zzzzzzzzzzz.");
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
