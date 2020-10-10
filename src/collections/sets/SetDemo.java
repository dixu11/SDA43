package collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        //sety:
        //tylko unikalne wartości
        //brak zachowania kolejności

        //Set<Integer> numbers = new HashSet<>(); //HashSet -> Kolejność nieustalona
        //Set<Integer> numbers = new LinkedHashSet<>(); //LinkedHashSet -> pamieta kolejnosc dodawania
        Set<Integer> numbers = new TreeSet<>(); //TreeSet -> pamieta kolejnosc dodawania
        numbers.add(1000);
        numbers.add(10);
        numbers.add(20);
        numbers.add(100);
        numbers.add(10);

        System.out.println(numbers);

        if (numbers.contains(20)) {
            System.out.println("Jest!");
        }

        for (Integer number : numbers) {
            if (number > 10) {
                System.out.println(number);
            }
        }

        //numbers.get(0);





    }


}
