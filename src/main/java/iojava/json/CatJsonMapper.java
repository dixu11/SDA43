package iojava.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CatJsonMapper {

    private ObjectMapper mapper = new ObjectMapper();

    public Cat mapJsonToCat(String json) {

        try {
            Cat cat = mapper.readValue(json, Cat.class);  // drugi argument -> informacja z jakiej klasy ma zbudowac obiekt
            return cat;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String mapCatToJson(Cat cat) {
        try {
            return mapper.writeValueAsString(cat);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }


}
