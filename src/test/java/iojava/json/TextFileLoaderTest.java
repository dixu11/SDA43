package iojava.json;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextFileLoaderTest {

    @Test
    public void should_load_correct_content_from_file(){ // tu nie obowiazuje konwencja cammelcase!
        //give
        String filePath = "src/main/resources/cat.json";
        TextFileLoader loader = new TextFileLoader();
        String expectedResult = "{  \"name\":\"Parszywek\",  \"age\": 7}";

        //when
        String result = loader.loadFromFile(filePath);

        //than
        Assertions.assertEquals(expectedResult,result);

    }


}
