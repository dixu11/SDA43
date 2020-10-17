package java8.functionalInterfaces;

import collections.recup.User;

import java.util.Comparator;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        //consumer
        Consumer<Integer> powerOfNumber = number -> System.out.println(number * number); //nic nie zwraca
        //supplier
        Supplier<Double> getRandomNumber = () -> Math.random(); //nic nie bierze
        //function // coś bierze coś zwraca
        Function<String, Integer> getTextLength = text -> text.length();
        //operator
        UnaryOperator<Integer> powerOfNumber2 = number -> number * number;
        //predicate
        Predicate<Integer> isPositive = number -> number > 0;
        //comparator
        Comparator<User> sortUser = (u1, u2) -> u1.getEmail().length() - u2.getEmail().length();

    }
}
