package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zad36 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(10,32,66,555,953,5,44,777,213,99));
        numbers.forEach(number -> System.out.println(number));

        System.out.println("----");

        numbers.stream()
                .sorted()
                .forEach(number -> System.out.println(number));

        long result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .count();

        List<Integer> filtered = numbers.stream()
                .filter(number -> number <= 50)
                .collect(Collectors.toList());

        System.out.println(result);
        System.out.println(filtered);

      int number =  numbers.stream()
                .sorted( (num1, num2) ->  num2-num1 )
                .findFirst()
                .orElse(-1);

        System.out.println(number);


//        Przygotuj ArrayList z 10 liczbami z przedziału 0-100.
//        za pomocą metody forEach wyświetl wszystkie liczby
//        za pomocą streama posortuj liczby i wyświetl posortowane
//        za pomocą streama odfiltruj liczby nieparzyste i policz ile pozostało elementów funkcją kończącą count()
//        za pomocą streama odfiltruj wszystkie liczby powyżej 50, pozostałe liczby zbierz do nowej listy
//        za pomocą streama posortuj liczby malejąco a następnie pobierz pierwszą z nich metodą findFirst



    }
}
