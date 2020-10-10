package oop.zad17;

import oop.exceptions.NoProductsException;
import oop.exceptions.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileConnection {

    private boolean connected;

    public void connect() throws FileConnectionException {
        double randomNr = Math.random(); //0 - 1.0
        if (randomNr <= 0.25) {
            throw new FileConnectionException();
        }
        connected = true;
    }

    public List<String> downloadFileContent() {
        List<String> books = new ArrayList<>();
        File file = new File("files/ksiazki.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String content = scanner.nextLine();
                books.add(content);
                System.out.println(content);
            }
        } catch (FileNotFoundException exception) {
          throw   new FileDbConnectionException("Brak pliku");
        }

        if (books.isEmpty()) {
            throw   new FileDbConnectionException("Brak książek");
        }
        return books;
    }

    public void disconnect() {
        connected = false;
    }

    public boolean isConnected() {
        return connected;
    }
}

    /*Przygotuj klasę FileConnection, pozwalającą łączyć się z plikiem i pobierać z niego dane.
        Wywołanie metody connect ma ustawiać stan obiektu na połączony, jednak ma istnieć 25% szans
        na to że połączenie się nie powiedzie i zostanie rzucony Twój własny wyjątek FileConnectionException.*/

/* Stwórz również metodę umożliwiającą pobranie danych z obiektu (jako działanie tej metody wykorzystaj
        wcześniej przygotowane czytanie pliku z książkami) wynik zwracaj jako String lub List<String> .
        Jeśli brakuje plików lub plik tekstowy jest pusty należy również rzucić wyjątek
        FileDbConnectionException z odpowiednią wiadomością.

        Zaimplementuj również metodę “disconnect” zmieniający stan obiektu na nie połączony.
        Wywołaj tę metodę w bloku finally w main.*/
