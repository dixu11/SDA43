package oop.zad4;

import java.util.Scanner;

public class CarDemo {

    public static void main(String[] args) {
        CarService carService = new CarService();
        Car car = carService.createCar();
        carService.printServiceInfo(car);
    }

}

