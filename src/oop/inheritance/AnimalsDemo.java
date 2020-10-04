package oop.inheritance;

import java.util.ArrayList;
import java.util.List;

public class AnimalsDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog("Reksio",5);
        //dog.bark();
        //dog.goToSleep();

        Cat cat = new Cat();
        //cat.meow();
        //dog.goToSleep();


        Animal someAnimal = new Dog(); //!!
        //someAnimal.bark(); // metoda nie widoczna



        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(dog2);
        animals.add(cat);

        for (Animal animal : animals) {
            animal.goToSleep();
            animal.makeSound();
        }
    }
}
