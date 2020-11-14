package iojava.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat("Parszywek", 7);

        TextFileLoader loader = new TextFileLoader();
      String json =  loader.loadFromFile("src/main/resources/cat.json");
        System.out.println(json);
    }
}
