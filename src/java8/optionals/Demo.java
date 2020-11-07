package java8.optionals;

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {


        String text = "abcd";


        Optional<String> pusty = Optional.empty();
        Optional<String> pelny = Optional.of(text);
        Optional<String> watpliwy = Optional.ofNullable(text);





    }
}
