package oop.cars;

public class Car {

    String brand;
    int mileage;
    int serviceOnMileage = 200_000;

    public void showCar(){
        System.out.println("Car: brand- " + brand + " mileage: " + mileage);
    }

    public void drive(int distance){
        mileage += distance;
    }

    public int howManyKmToService(){
        int kmToService = serviceOnMileage - mileage;
        return kmToService;
    }




}
