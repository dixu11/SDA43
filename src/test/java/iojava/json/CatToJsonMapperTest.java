package iojava.json;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CatToJsonMapperTest {

    @Test
    public void should_create_object_from_json_string(){
        //given
        String jsonCat =  "{  \"name\":\"Parszywek\",  \"age\": 7}";
        CatJsonMapper mapper = new CatJsonMapper();
        Cat expectedCat = new Cat("Parszywek", 7);

        //when
        Cat cat = mapper.mapJsonToCat(jsonCat);

        //than
        Assertions.assertEquals(expectedCat,cat);
    }



}
