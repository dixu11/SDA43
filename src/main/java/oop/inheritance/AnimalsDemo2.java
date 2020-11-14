package oop.inheritance;

import java.util.ArrayList;
import java.util.List;

public class AnimalsDemo2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        Animal cat2 = new Cat("Mruczek", 10);
        Object cat3 = new Cat("Maurycy", 9);

        cat.attack();
        cat.makeSound();
        cat.goToSleep();
        cat.chaseMice();

        cat2.attack();
        cat2.makeSound();
        cat2.goToSleep();
       // cat2.chaseMice(); // nie działa dlatego że nie każdy animal to ma

        cat3.toString(); // tylko metody z Object widoczne

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);

        cat2.attack(); // rodzaj obiektu decyduje o ostatecznym działaniu (przez nadpisywanie)

        if (cat2 instanceof Cat) { //czy tam w środku jest coś co możemy nazwać kotem?
            Cat animalAsCatRefference = (Cat) cat2; //downcasting
            animalAsCatRefference.chaseMice();
        }
    }
}
//   <<<Konkret                                     Abstrakcja>>>
//    Klasa           Klasa Abstrakcyjna             Interfejs


