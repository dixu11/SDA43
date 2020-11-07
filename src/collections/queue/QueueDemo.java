package collections.queue;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {

        //ArrayList // LinkedList

        //kolejka -> FIFO
        //stos -> FILO

        //Kolejki:
        //List<String> peopleList = new LinkedList<>();
//        Queue<String> peopleQueue = new LinkedList<>();
        Queue<String> peopleQueue = new ArrayBlockingQueue<>(3); // kolejka z ograniczonym rozmiare
        peopleQueue.add("Rafał"); // dodaje element
        peopleQueue.add("Roman");
        peopleQueue.add("Renata");
        peopleQueue.offer("Róża"); // offer -> nie spowoduje błędu
        System.out.println(peopleQueue);
        String person = peopleQueue.remove(); // zwraca referencje i wywala obiekt z kolejki
        System.out.println(person);
        String person2 = peopleQueue.element(); // zwraca referencje do elementu
        System.out.println(person2);

        System.out.println(peopleQueue);
        peopleQueue.remove();
        peopleQueue.remove();
        // peopleQueue.remove();
        System.out.println(peopleQueue);
        // peopleQueue.element();

        peopleQueue.offer("Tekst");  //
        String person3 = peopleQueue.peek(); // pobieranie elementu - zwraca null jeśli nie znajdzie
        String person4 = peopleQueue.poll(); // skasuje element jeśli jest jakiś element, jesli nie zwraca null


        Queue<Person> guests = new PriorityQueue<>(); // sortuje wg natural order
        guests.offer(new Person("Donald", false));
        guests.offer(new Person("Samanta", true));
        guests.offer(new Person("Sam", false));
        System.out.println(guests);


        //tak implementujemy aktualnie stosy w java
        Deque<Integer> numbers = new LinkedList<>();
        numbers.addLast(23);
        numbers.addLast(30);
        numbers.addLast(5);
        numbers.addLast(512);

        System.out.println(numbers.removeLast());
        System.out.println(numbers.removeLast());
        System.out.println(numbers.removeLast());
    }
}
