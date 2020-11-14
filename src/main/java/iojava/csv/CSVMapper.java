package iojava.csv;

import java.time.LocalDate;

public class CSVMapper {

    public String convertCarToCSV(Car car){
        return car.getBrandAndModel() + "," + car.getMileageInKm() + "," + car.getProductionDate();
    }

    public Car covertCSVToCar(String carCSV){
        String[] carCSVArray = carCSV.split(",");
        String brand = carCSVArray[0];
        int mileage = Integer.parseInt(carCSVArray[1]);
        LocalDate productionDate = LocalDate.parse(carCSVArray[2]);
        return new Car(brand, mileage, productionDate);
    }


}
