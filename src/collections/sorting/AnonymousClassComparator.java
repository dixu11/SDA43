package collections.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassComparator {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("pies");
        animals.add("małpa");
        animals.add("zebra");
        animals.add("kot");
        animals.add("krowa");

        Comparator<String> lengthComparator = new Comparator<>(){
            public int compare(String text1, String text2) {
                return text2.length() - text1.length();
            }
        };

        animals.sort(lengthComparator);

        //na szybko:
        animals.sort(new Comparator<>(){
            public int compare(String text1, String text2) {
                return text2.length() - text1.length();
            }
        });
        System.out.println(animals);
    }
}

