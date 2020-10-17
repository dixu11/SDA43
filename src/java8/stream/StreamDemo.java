package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StreamDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Dawid");
        names.add("Dagmara");
        names.add("Filip");
        names.add("Wojtas");

        for (String name : names) {
            System.out.println(name);
        }

        names.forEach(name -> System.out.println(name));
    }

}
