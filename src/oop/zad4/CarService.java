package oop.zad4;

import java.util.Scanner;

public class CarService {


    public Car createCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Robimy samochód!");
        System.out.println("Jaka marka?");
        String marka = scanner.nextLine();
        System.out.println("Jaki przebieg?");
        int mileage = scanner.nextInt();
        scanner.close();
        System.out.println("Robimy samochód...");
        Car yourCar = new Car(marka, mileage);
        System.out.println("Powstały samochód: " + yourCar);
        return yourCar;
    }

    public void printServiceInfo(Car car) {
        int toService = car.howManyKmToService();
        if (toService > 0) {
            System.out.println("Do przeglądu: " + toService);
        } else {
            System.out.println("Przegląd trzeba było zrobić " + -toService + "km temu!!");
        }
    }



}
