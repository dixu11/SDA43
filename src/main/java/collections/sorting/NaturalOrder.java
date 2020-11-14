package collections.sorting;

import oop.inheritance.Animal;
import oop.inheritance.Cat;
import oop.inheritance.Dog;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NaturalOrder {
    public static void main(String[] args) {



        Set<Integer> numbers = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        numbers.add(34);
        numbers.add(11);
        numbers.add(22);
        numbers.add(50);

        System.out.println(numbers);


        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        Animal animal3 = new Dog("Reksio",5);
        Animal animal4 = new Cat("Filemon",7);
        Animal animal5 = new Cat("Filemon",5);

        Set<Animal> animals = new TreeSet<>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);

        System.out.println(animals);

    }
}
