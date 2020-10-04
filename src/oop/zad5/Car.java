package oop.zad5;

public class Car {

  private  String brand;
  private  int mileage;
  private static final int SERVICE_ON_MILEAGE = 200_000;  //static final wielkimi literami


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
        int kmToService = SERVICE_ON_MILEAGE - mileage;
        return kmToService;
    }

    public int getMileage() {
        return mileage;
    }

    public String toString(){
      return "Car: brand- " + brand + " mileage: " + mileage;
    }



}
