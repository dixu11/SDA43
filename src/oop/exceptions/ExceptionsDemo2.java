package oop.exceptions;

import java.util.Scanner;

public class ExceptionsDemo2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();

        System.out.println("przez ile podzielić?");
        int number2 = scanner.nextInt();

        try {
            double result = number / number2;
            System.out.println("Wynik to: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Nie wolno dzielić przez 0!");
        }


    }

}
