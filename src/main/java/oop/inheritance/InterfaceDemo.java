package oop.inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InterfaceDemo {

    public static void main(String[] args) {

        Cat cat = new Cat();
        List<Pet> pets = new CopyOnWriteArrayList<>();
        pets.add(cat);
        pets.add(new Dog()); //inny sposób

        for (Pet pet : pets) {
            pet.doTrick();
        }



    }


}
