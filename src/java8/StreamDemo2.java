package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Dawid");
        names.add("Dagmara");
        names.add("Filip");
        names.add("Wojtas");
        names.add("Anna");




        long count = names.stream()
                .sorted()
                .distinct()
                .count();


        System.out.println(count);

        names.stream()
                .sorted((name1, name2) -> name1.length()-name2.length())
                .forEach( (String  name) -> System.out.println(name));



        List<Character> firstLetters =  names.stream()
                .map(name -> name.charAt(0))   // wymieniam imie na 1 litere imienia
                .filter(firstLetter -> firstLetter != 'A') // odsiewam litery A
                .collect(Collectors.toList());

        System.out.println(firstLetters);


    }
}
