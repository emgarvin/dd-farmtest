public class Pig implements Animal {
    private String name;
    private double weightInKg;

    public Pig(String name, double weightInKg) {
        this.name = name;
        this.weightInKg = weightInKg;
    }

    @Override public void speak() {
        System.out.println("Oink oink.");
    }
    @Override public void breath() {
        System.out.println("Snort.");
    }
    @Override public void eat() {
        System.out.println("Snarf snarfle.");    }
    @Override public void sleep() {
        System.out.println("Zzzzzzzz.");
    }

    public String getName(){ return name; }
    @Override public double getWeightInKg() {
        return weightInKg;
    }
}
