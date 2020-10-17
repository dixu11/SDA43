package collections.recup;

import oop.inheritance.Dog;

import java.util.*;

public class Re {
    public static void main(String[] args) {
        User user1 = new User("abcd@gmail.com");
        User user2 = new User("oleg.koziel@gmail.com");
        User user3 = new User("dcba@gmail.com");
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.sort(new Comparator<>() {
            @Override
            public int compare(User u1, User u2) {
                return u2.getEmail().compareTo(u1.getEmail());
            }
        });
        System.out.println(users);

        Set<User> usersSet = new TreeSet<>();
        usersSet.add(user1);
        usersSet.add(user2);
        usersSet.add(user3);
        System.out.println("Wynik z seta:");
        System.out.println(usersSet);

    }
}
