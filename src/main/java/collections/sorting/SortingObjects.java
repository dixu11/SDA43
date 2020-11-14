package collections.sorting;

import oop.inheritance.Animal;
import oop.inheritance.Cat;
import oop.inheritance.Dog;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingObjects {

    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        Animal animal3 = new Dog("Reksio",5);
        Animal animal4 = new Cat("Filemon",7);
        Animal animal5 = new Cat("Filemon",5);


        List<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);
        System.out.println(animals);


        animals.sort(new Comparator<Animal>() {
            @Override
            public int compare(Animal animal1, Animal animal2) {
                int result = animal1.getName().compareTo(animal2.getName());
                if (result == 0) {
                    result = animal1.getAge() - animal2.getAge();
                }
                return result;
            }
        });

        System.out.println(animals);

    }

}
