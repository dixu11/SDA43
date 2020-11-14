package reflection;

import java.util.Objects;
import java.util.Random;

public final class Car {

    public static final String METRIC = "km";

    private String brand;
    private int mileage;


    public Car(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    public Car() {
        brand = "";
        mileage = 1;
    }


    public void run() {
        Random random = new Random();
        int distance = random.nextInt(10);
        System.out.println("Car running on distance: " + distance);
        mileage += distance;
    }

    void run(int distance) {
        System.out.println("Car running on distance: " + distance);
        mileage += distance;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return mileage == car.mileage &&
                Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, mileage);
    }
}
