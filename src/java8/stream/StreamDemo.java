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

       int  count = 0;
        final Counter counterObject = new Counter();
        for (String name : names) {
            System.out.println(name);
            if (name.startsWith("D")) {
                count++;
            }
        }

        names.forEach(name -> System.out.println(name.toUpperCase()+ "!!!") );
        names.forEach(name -> {
            if (name.startsWith("D")) {
              //  count++; // w lambdach i klasach wewnetrznych nie można używać zmiennych lokalnych (z wyjątkiem stałych)
                counterObject.increment();// sposób obejścia
            }
        } );

        names.forEach(name -> System.out.println(name));
    }

}

class Counter{
   private int count;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
