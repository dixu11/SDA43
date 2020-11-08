package iojava;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {

    private List<Car> cars = new ArrayList<>();
    private static final String FILE_NAME = "carData";

    private CsvFileRepository csvFileRepository = new CsvFileRepository();
    private CSVMapper csvMapper = new CSVMapper();

    public CarRepository() {
        loadCars();
    }

    private void loadCars() {
        List<String> stringCars = csvFileRepository.loadFromFile(FILE_NAME);
        for (String stringCar : stringCars) {
            Car car = csvMapper.covertCSVToCar(stringCar);
            cars.add(car);
        }
    }

    public void saveCar(Car car) {
        cars.add(car);
        String stringCsv = csvMapper.convertCarToCSV(car);
        csvFileRepository.saveToFile(FILE_NAME,stringCsv);
    }


    public List<Car> getCars() {
        return cars;
    }
}
