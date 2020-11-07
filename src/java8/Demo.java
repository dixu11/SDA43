package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        Repository repository = new Repository();
        List<String> names = new ArrayList<>();
        names.add("Dawid");
        names.add("Dagmara");
        names.add("Filip");
        names.add("Wojtas");
        System.out.println(repository.getNamesStartingOf('D',names));
        System.out.println(repository.getNamesStartingOf2('D',names));
        Optional<String> result = repository.findNameInNames(names, "Dawi");

        if (result.isPresent()) {
            String content = result.get(); // wyjmowanie z optionala
            System.out.println(content);
        }

        result.ifPresent( content  -> System.out.println(content) ); // funkcja wykona sie jesli optional pelny

        String content2 = result.orElse("BRAK IMIENIA"); // jesli nie ma da "BRAK IMIENIA"
        System.out.println(content2);
        String content3 = result.orElseThrow(); // jeśli nie ma rzuci wyjatek


    }
}
