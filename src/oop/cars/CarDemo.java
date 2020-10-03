package oop.cars;

import java.util.Scanner;

public class CarDemo {

    public static void main(String[] args) {
        Car car = new Car("Fiat",50_000);

        Car car2 = new Car("BMW", 100_000);

        Car car3 = new Car();

//        car.showCar();
//        car2.showCar();
        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);

        car.drive(100);
        car2.drive(200);

        System.out.println(car);
        System.out.println(car2);

//        car.showCar();
//        car2.showCar();

       int distance = car.howManyKmToService();
        System.out.println("To service: " + distance);
        System.out.println("To service: " + car.howManyKmToService());


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

        int toService = yourCar.howManyKmToService();
        if (toService > 0) {
            System.out.println("Do przeglądu: " + toService);
        } else {
            System.out.println("Przegląd trzeba było zrobić " + -toService + "km temu!!");
        }

    }

}

   /* Stwórz klasę typu Car. Obiekty typu Car mają mieć dwie
   cechy - marka i przebieg.
        Stwórz również pole informujące o tym przy jakim
         przebiegu powinniśmy zrobić przegląd. W klasie do
          testów (np. CarDemo) przygotuj metodę main, a w niej
           stwórz dwa obiekty typu Car.

        Dla obiektów typu Car przygotuj następujące
        funkcjonalności oraz przetestuj je w main:

        Stwórz metodę wyświetlającą markę samochodu
        oraz przebieg
        Stwórz metodę przyjmującą odległość do przejechania i
         zwiększającą przebieg samochodu o tę odległość
        Stwórz metodę zwracającą ilość kilometrów jakie można
         przejechać przed zrobieniem przeglądu.
          Jeśli przebieg aktualny przekracza przebieg
          do przeglądu możesz zwrócić ujemną wartość
*/
