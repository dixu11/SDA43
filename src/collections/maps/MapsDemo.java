package collections.maps;

import collections.sets.Person;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        Map<String, Person> users = new HashMap<>();

        users.put( "marcin.kowalski44@gmail.com",  new Person("Marcin", LocalDate.of(1995, 10, 1)));
        users.put( "wojtek.nowak123@gmail.com",new Person("Wojtek", LocalDate.of(1997, 11, 1)));
        users.put("ola.jakastam@interia.pl" ,new Person("Ola", LocalDate.of(1996, 10, 2)));
        users.put("ola.jakastam@interia.pl", new Person("Ala", LocalDate.of(1999, 9, 9)));

        System.out.println(users);

        String login = "wojtek.nowak123@gmail.com";
        Person found = users.get(login);
        System.out.println(found);

        for (Person user : users.values()) {
            System.out.println(user);
        }

        System.out.println("------");
        for (String mail : users.keySet()) {
            System.out.println("Mail to: " + mail);
            System.out.println("User: " + users.get(mail));
        }
        System.out.println("------");

        for (Map.Entry<String, Person> mailAndUser : users.entrySet()) {
            System.out.println(mailAndUser.getKey());
            System.out.println(mailAndUser.getValue());
        }

    }
}
