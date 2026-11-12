package agh.po.lab4.zadania;

import agh.po.lab4.animals.Animal;
import agh.po.lab4.animals.Parrot;
import agh.po.lab4.animals.Dog;
import agh.po.lab4.animals.Snake;
import java.util.Random;

public class Zoo {

    private Animal[] animals = new Animal[100];

    public Zoo() {
        Random random = new Random();

        for (int i = 0; i < animals.length; i++) {
            int type = random.nextInt(3);
            Animal animal;

            if (type == 0) {
                animal = new Parrot("Papu" + (i + 1));
            } else if (type == 1) {
                animal = new Dog("Reksio" + (i + 1));
            } else {
                animal = new Snake("Kaa" + (i + 1));
            }

            animals[i] = animal;
        }
    }

    public void showAnimals() {
        for (Animal animal : animals) {
            String description = animal.getDescription(); // B
            System.out.println(description);
            animal.makeSound();
        }
    }

    public int countLegs() {
        int sum = 0;

        for (Animal animal : animals) {
            int legs = animal.getLegs();
            sum += legs;
        }

        return sum;
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.showAnimals();

        int totalLegs = zoo.countLegs();
        System.out.println("Suma nóg wszystkich zwierząt: " + totalLegs);
    }
}