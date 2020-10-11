package collections.sorting;

import java.util.Comparator;

public class SortindDescending implements Comparator<Integer> {


    @Override
    public int compare(Integer number1, Integer number2) {
        System.out.println("Porownuje: " + number1 + " i " + number2);
        if (number1<number2) {
            System.out.println("Stawiam " + number1 + " dalej");
            return 1;
        } else if (number1 > number2) {
            System.out.println("Stawiam " + number1 + " wcześniej");
            return -1;
        } else {
            System.out.println("takie same!");
            return 0;
        }
    }
}
