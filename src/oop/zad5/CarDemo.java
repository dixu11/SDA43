package oop.zad5;

public class CarDemo {

    public static void main(String[] args) {
        Car car1 = new Car("Fiat", 50_000);
        Car car2 = new Car("BMW", 100_000);
        Car car3 = new Car();
        CarService carService = new CarService();
        Car yourCar = carService.createCar();

        Car[] cars = {car1,car2,car3,yourCar};
        int total = carService.countTotalMileage(cars);
        System.out.println("Laczny przebieg: " + total);
    }

}

