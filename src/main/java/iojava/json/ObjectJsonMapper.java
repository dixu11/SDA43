package iojava.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectJsonMapper<T> {

    private ObjectMapper mapper = new ObjectMapper();

    public T mapJsonToObject(String json, Class<T> tClass) {

        try {
            T cat = mapper.readValue(json, tClass);  // drugi argument -> informacja z jakiej klasy ma zbudowac obiekt
            return cat;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String mapObjectToJson(T cat) {
        try {
            return mapper.writeValueAsString(cat);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }



}
