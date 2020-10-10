package oop.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsDemo3 {

    public static void main(String[] args) {
        File file = new File("files/products.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String content = scanner.nextLine();
                System.out.println(content);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Plik nie odnaleziony");
        }



    }

}
