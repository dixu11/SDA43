package oop.interfaces;

public class FileRepository implements  Repository {

    public void save() {
        System.out.println("Zapisujemy do pliku na dysku");
    }

    public void load() {
        System.out.println("Odczytujemy z pliku z dysku");
    }


}
