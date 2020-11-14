package oop.arraysPerson;

import oop.simpleExample.Person;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        Person person1 = new Person("Roman", 25);
        Person person2 = new Person("Ola", 30);
        Person person3 = new Person("Magda", 33);
        Person person4 = new Person("Wojtek", 20);

        Person[] people = new Person[4];
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        people[3] = person4;

        System.out.println(Arrays.toString(people));

        PersonService personService = new PersonService();
        System.out.println(personService.countTotalAge(people));
    }


}
