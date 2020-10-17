package java8;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Repository repository = new Repository();
        List<String> names = new ArrayList<>();
        names.add("Dawid");
        names.add("Dagmara");
        names.add("Filip");
        names.add("Wojtas");
        System.out.println(repository.getNamesStartingOf('D',names));

    }
}
