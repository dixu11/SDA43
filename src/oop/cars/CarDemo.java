package oop.cars;

public class CarDemo {

    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Fiat";
        car.mileage = 50_000;

        Car car2 = new Car();
        car2.brand = "BMW";
        car2.mileage = 100_000;

        car.showCar();
        car2.showCar();

        car.drive(100);
        car2.drive(200);

        car.showCar();
        car2.showCar();

       int distance = car.howManyKmToService();
        System.out.println("To service: " + distance);
        System.out.println("To service: " + car.howManyKmToService());
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
