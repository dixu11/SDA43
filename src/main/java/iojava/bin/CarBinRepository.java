package iojava.bin;

import java.io.*;

public class CarBinRepository {

    private String fileName;

    public CarBinRepository(String fileName) {
        this.fileName = fileName + ".bin";
    }

    public void saveCar(Car car) {

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(car);
            oos.flush();
            oos.close();

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Car loadCar(){
        try {
            ObjectInputStream oos = new ObjectInputStream(new FileInputStream(fileName));
           Car car =(Car) oos.readObject();
           oos.close();
            return car;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}
