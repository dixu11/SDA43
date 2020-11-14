package iojava.bin;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class Car implements Serializable {

    private String brandAndModel;
    private int mileageInKm;
    private LocalDate productionDate;
    private transient Scanner scanner = new Scanner(System.in); // pole jest ignorowane w trakcie serializacji
    public static final long serialVersionUID = 6945180879528203380L;



    public Car(String brandAndModel, int mileageInKm, LocalDate productionDate) {
        this.brandAndModel = brandAndModel;
        this.mileageInKm = mileageInKm;
        this.productionDate = productionDate;
    }

    public Car() {
        System.out.println("Jaki model?");
        brandAndModel = scanner.nextLine();
        //... itd
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
