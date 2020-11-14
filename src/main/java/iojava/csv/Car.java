package iojava.csv;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class Car {

    private String brandAndModel;
    private int mileageInKm;
    private LocalDate productionDate;


    public Car(String brandAndModel, int mileageInKm, LocalDate productionDate) {
        this.brandAndModel = brandAndModel;
        this.mileageInKm = mileageInKm;
        this.productionDate = productionDate;
    }



    public String getBrandAndModel() {
        return brandAndModel;
    }

    public int getMileageInKm() {
        return mileageInKm;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return mileageInKm == car.mileageInKm &&
                Objects.equals(brandAndModel, car.brandAndModel) &&
                Objects.equals(productionDate, car.productionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandAndModel, mileageInKm, productionDate);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandAndModel='" + brandAndModel + '\'' +
                ", mileageInKm=" + mileageInKm +
                ", productionDate=" + productionDate +
                '}';
    }
}
