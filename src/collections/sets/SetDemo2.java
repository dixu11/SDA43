package collections.sets;

import oop.inheritance.Cat;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person("Marcin", LocalDate.of(1995, 10, 1)));
        people.add(new Person("Wojtek", LocalDate.of(1997, 11, 1)));
        people.add(new Person("Ola", LocalDate.of(1996, 10, 2)));
        people.add(new Person("Ola", LocalDate.of(1996, 10, 2)));

        System.out.println(people);

        Person person = new Person("Roman", LocalDate.of(1996, 10, 2));
        System.out.println(person.hashCode());

        //Cat cat = new Cat();
        //System.out.println(person.equals(cat));


    }
}
