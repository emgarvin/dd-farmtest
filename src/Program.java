import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args){
    System.out.println("Old McDel had a farm.");

    // initialising
    List<Animal> farm = new ArrayList<Animal>();

    Pig napoleon = new Pig("Napoleon",70.3);
    Cow daisy = new Cow("Daisy",110.6);
    Cow ironbull = new Cow("The Iron Bull",150.4);
    Sheep dolly = new Sheep("Dolly",60.8);
    Chicken little = new Chicken("Chicken Little",7.2);
    Chicken attila = new Chicken("Attila the Hen",6.7);
    Chicken eggbert = new Chicken("Eggbert Eggstein",3.142);
    Chicken bokNorris = new Chicken("Bok Norris",4.2);
    Donkey eeyore = new Donkey("Eeyore",69.9);

    farm.add(napoleon);
    farm.add(daisy);
    farm.add(ironbull);
    farm.add(dolly);
    farm.add(little);
    farm.add(attila);
    farm.add(eggbert);
    farm.add(bokNorris);
    farm.add(eeyore);

    //getavgweight

   double averageWeight =  farm.stream().mapToDouble(Animal::getWeightInKg)
                .average()
            .getAsDouble();
   System.out.println(averageWeight);

   boolean allAnimals = farm.stream().allMatch(a -> a.getWeightInKg() > 1);
   System.out.println("All? " + allAnimals);
   boolean anyAnimal = farm.stream().anyMatch(a -> a.getWeightInKg() > 30);
   System.out.println("Any? " + anyAnimal);

   Stream<Animal> heavy = farm.stream()
           .map(a->{a.speak(); return a;})
           .filter(a->a.getWeightInKg() > 30);
        System.out.println("Got the heavy animals.");
        heavy.forEach(Animal::eat);
    }

    public static void tellWeightInKg(Animal animal) {System.out.println(animal.getName() + " weighs " + animal.getWeightInKg() + "kg.");}
}
