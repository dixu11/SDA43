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


        System.out.print( "Osoba o imieniu " +
                person1.getName() + " to ");

        if (person1.getName().endsWith("a")) {
            System.out.println("kobieta");
        } else {
            System.out.println("mężczyzna");
        }

        if (person1.getAge() > 18) {
            System.out.println("osoba pełnoletnia!");
        } else {
            System.out.println("osoba niepełnoletnia");
        }






        //CD
        System.out.println(person1.toString());
        System.out.println(person1);

        System.out.println("------------");
        PersonService personService = new PersonService();
        Person myNewPerson = personService.createPerson();
        System.out.println("Powstaje: " + myNewPerson);
        personService.readPersonInfo(myNewPerson);
        System.out.println("Czy może pić?");
        System.out.println(personService.isAllowedDrinkAlcohol(myNewPerson));













    /*    Zadbaj o dobre praktyki projektowania obiektów,
        ustaw pola jako prywatne i dawaj do nich dostęp
        za pomocą getterów i setterów tylko jeśli jest
        to konieczne. Zamień metodę wyświetlającą na
        przysłoniętą metodę toString().
                Przygotuj dwa konstruktory. Pierwszy
        pozwalający stworzyć domyślny samochód bez
        przekazywania żadnych parametrów np. “Fiat 126p
    przebieg 300 000tyś”. Drugi konstruktor pozwalający
        ustawić dowolną markę i przebieg.*/




    }
}
