package iojava.json;

public class Demo {
    public static void main(String[] args) {
       // Cat cat = new Cat("Parszywek", 7);

        TextFileLoader loader = new TextFileLoader();
      String json =  loader.loadFromFile("src/main/resources/cat.json");
        System.out.println(json);

        CatJsonMapper mapper = new CatJsonMapper();
        Cat cat = mapper.mapJsonToCat(json);
        System.out.println(cat);
    }
}
