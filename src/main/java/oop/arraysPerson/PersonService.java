package oop.arraysPerson;

import oop.simpleExample.Person;

import java.util.Scanner;

//analizowanie danych obiektów person
public class PersonService {


    public Person createPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        String name = scanner.nextLine();
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();
        scanner.close();
        Person person = new Person(name,age);
        return person;
    }

    public void readPersonInfo(Person person){
        if (person.getName().endsWith("a")) {
            System.out.println("kobieta");
        } else {
            System.out.println("mężczyzna");
        }

        if (person.getAge() > 18) {
            System.out.println("osoba pełnoletnia!");
        } else {
            System.out.println("osoba niepełnoletnia");
        }
    }

    public boolean isAllowedDrinkAlcohol(Person person) {
        return person.getAge() >= 18;
        /*if (person.getAge() >= 18) {
            return true;
        } else {
            return false;
        }*/
    }

    public int countTotalAge(Person[] people){
        int totalAge = 0;
        for (Person person : people) {
            System.out.println(person);
            totalAge += person.getAge();
        }
        return totalAge;
    }



}
