package iojava;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car("Fiat 126p",200_000, LocalDate.now().minusYears(30));
        CSVMapper mapper = new CSVMapper();
       String carAsCSV = mapper.convertCarToCSV(car);
        /* System.out.println(carAsCSV);
        Car recreatedCar = mapper.covertCSVToCar(carAsCSV);
        System.out.println(recreatedCar);*/
        CsvFileRepository fileRepository = new CsvFileRepository();
        fileRepository.saveToFile("carData",carAsCSV);

        // do pliku .csv
        //do pliku .bin
        //do formatu json
    }
}


//    marka,przebieg,data
//    fiat,200000,2000-10-22
//    mercedes,110000,2013-9-10
