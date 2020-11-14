package oop.interfaces;

public class App {

    private Repository repository;

    public App(Repository repository) {
        this.repository = repository;
    }

    public void start() {
        System.out.println("Start aplikacji");
        repository.load();
    }


    public void exit() {
        System.out.println("Zamknięcie aplikacji");
        repository.save();
    }
}
