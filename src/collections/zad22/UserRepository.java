package collections.zad22;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private Map<String, User> users = new HashMap<>();

    public void add(User user) {
        users.put(user.getEmail(), user);
    }

    public void add(String email, String password) {
        User user = new User(email, password);
        users.put(email, user);
    }

    public int countUsers() {
        return users.size();
    }

    public boolean containsEmail(String email) {
        return users.containsKey(email);
    }

    public User get(String email) {
        return users.get(email);
    }

    public User login(String email, String password) {
        if (!containsEmail(email)) {
            throw new LoginException("Nieprawidłowy email");
        }
        User user = get(email);
        if (!user.getPassword().equals(password)) {
            throw new LoginException("Nieprawidłowe hasło");
        }
        return user;
    }

    //alternatywne rozwiąznie
 /*   public User login(String email, String password) {
        for (User user : usersMap.values()) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new WrongLoginException();
    }*/

    public void remove(String email) {
        users.remove(email);
    }

    public boolean containsAdmin() {
        for (User user : users.values()) {
            if (user.getRole() == Role.ADMIN) {
                return true;
            }
        }
        return false;
    }

    public void addPoints(int count) {
        for (User user : users.values()) {
            user.addPoints(count);
        }
    }

    @Override
    public String toString() {
        return "UserRepository{" +
                "users=" + users +
                '}';
    }
}


  /*  Zaimplementuj i przetestuj klasę UserRepository z mapą, w której kluczami będą maile użytkowników
        a wartościami obiekty użytkowników.

        Stwórz metody:
        add - przyjmującą obiekt typu User i dodająca go do mpay
        add - przyjmującą dwie wartości String i tworząca User dodając go do mapy ustalając ilość
        punktów oraz role na domyślne wartości. (wykorzystaj odpowiedni konstruktor)
        countUsers - zwracająca liczbę użytkowników w repozytorium
        containsMail - zwracająca true jeśli na liście znajduje się dany mail
        get - przyjmująca mail i zwracająca obiekt typu User
        login - przyjmującą email i password użytkownika i zwracająca zalogowanego użytkownika lub
        rzucająca wyjątek z odpowiednią wiadomością jeśli podano błędny email lub password
        remove - pozwalająca usunąć użytkownika po mailu
        containsAdmin - zwracająca true jeśli na liście znajduje się przynajmniej jeden obiekt o roli ADMIN
        addPoints - metoda dodaje x punktów wszystkim klientom*/
