package oop.simpleExample;

public class PersonDemo {
    public static void main(String[] args) {

        //prymitywne
        int number = 1034534545;
        String text = "asdadasdffgdfgdfgewrwerwetetyret";
        //referencja
        Person person1 = new Person("Roman",25);
//        person1.name = "Roman";
//        person1.age = 25;
        Person person2 = new Person("Ola",30);
//        person2.name = "Ola";
//        person2.age = 30;
        System.out.println(person1);
        System.out.println(person2);

//        Person person3 = person1;
//        person3.name = "Wojtek";

        person1.sayHello();
        person2.sayHello();
        System.out.println(person1);
        System.out.println(person2);

        person1.birthday();
        person1.sayHello();


        if (person1.getAge() > 18) {
            System.out.println("adult!");
        } else {
            System.out.println("not adult");
        }

    }
}
