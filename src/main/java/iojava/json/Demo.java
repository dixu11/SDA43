package iojava.json;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
       // Cat cat = new Cat("Parszywek", 7);

        TextFileLoader loader = new TextFileLoader();
      String json =  loader.loadFromFile("src/main/resources/cat.json");
        System.out.println(json);

        ObjectJsonMapper<Cat> mapper = new ObjectJsonMapper<>();
        Cat cat = mapper.mapJsonToObject(json, Cat.class);
        System.out.println(cat);

        Person person = new Person("Radek","wojska polskiego 33",
                List.of(cat, new Cat("Filemon",2)));
        ObjectJsonMapper<Person> personMapper = new ObjectJsonMapper<>();

        String personJson = personMapper.mapObjectToJson(person);
        System.out.println(personJson);

        Person recreatedPerson = personMapper.mapJsonToObject(personJson, Person.class);
        System.out.println(recreatedPerson);







    }
}
