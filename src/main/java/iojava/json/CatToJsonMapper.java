package iojava.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CatToJsonMapper {


    public Cat mapJsonToCat(String json) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            Cat cat = mapper.readValue(json, Cat.class);  // drugi argument -> informacja z jakiej klasy ma zbudowac obiekt
            return cat;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }



}
