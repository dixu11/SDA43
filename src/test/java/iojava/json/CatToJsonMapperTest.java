package iojava.json;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CatToJsonMapperTest {

    @Test
    public void should_create_object_from_json_string(){
        //given
        String jsonCat =  "{  \"name\":\"Parszywek\",  \"age\": 7}";
        ObjectJsonMapper<Cat> mapper = new ObjectJsonMapper<>();
        Cat expectedCat = new Cat("Parszywek", 7);

        //when
        Cat cat = mapper.mapJsonToObject(jsonCat, Cat.class);

        //than
        Assertions.assertEquals(expectedCat,cat);
    }

    @Test
    public void should_create_dog_from_json_string(){
        //given
        TextFileLoader loader = new TextFileLoader();
        String jsonDog =  loader.loadFromFile("src/main/resources/dog.json");
        ObjectJsonMapper<Dog> mapper = new ObjectJsonMapper<>();
        Dog expectedDog = new Dog( "Daniel");

        //when
        Dog dog = mapper.mapJsonToObject(jsonDog, Dog.class);

        //than
        Assertions.assertEquals(expectedDog,dog);
    }



}
