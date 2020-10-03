package oop.zad4;

public class Car {

  private  String brand;
  private  int mileage;
  private  int serviceOnMileage = 200_000;


  public Car(String brand, int mileage){
      this.brand = brand;
      this.mileage = mileage;
  }

  public Car(){
      brand = "Fiat";
      mileage = 300_000;
  }

    public void drive(int distance){
        mileage += distance;
    }

    public int howManyKmToService(){
        int kmToService = serviceOnMileage - mileage;
        return kmToService;
    }

    public String toString(){
      return "Car: brand- " + brand + " mileage: " + mileage;
    }



}
