package oop.interfaces;

public class App {

    public FileRepository fileRepository = new FileRepository();

    public void start() {
        System.out.println("Start aplikacji");
        fileRepository.load();
    }


    public void exit() {
        System.out.println("Zamknięcie aplikacji");
        fileRepository.save();
    }



}
