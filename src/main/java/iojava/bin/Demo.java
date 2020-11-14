package iojava.bin;


import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car("Fiat 126p", 200_000, LocalDate.now().minusYears(30));
        // Car car2 = new Car("Mercedes",80_000, LocalDate.now().minusYears(18));
        //Car car3 = new Car();
        CarBinRepository repository = new CarBinRepository("archive");

        // repository.saveCar(car3);
        Car loadedCar = repository.loadCar();
        System.out.println(loadedCar);


        //serializacja - zapis obiektu do skompresowanej formy
    }
}
