package collections.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortDemo {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(233);
        numbers.add(1);
        numbers.add(10);
        numbers.add(10000);
        System.out.println(numbers);
        Comparator<Integer> myComparator = new SortindDescending();
       // numbers.sort(myComparator);
        sortMyList(numbers,myComparator);

        System.out.println(numbers);


    }

    public static void sortMyList(List<Integer> numbers,Comparator<Integer> comparator) {
        for (int i = 0; i <numbers.size(); i++) {
            for (int j = 0; j <numbers.size() -1; j++) {
                int first = numbers.get(j);
                int sec = numbers.get(j+1);
                if (comparator.compare(first,sec) > 0) {
                    numbers.set(j, sec);
                    numbers.set(j+1, first);
                }
            }
        }
    }
}
