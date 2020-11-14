package oop.interfaces;

public class DbRepository implements  Repository {

    public void load() {
        System.out.println("Wczytuje pliki z bazy danych");
    }

    public void save() {
        System.out.println("Zapisuje pliki w bazie danych");
    }
}
