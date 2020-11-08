package iojava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvFileRepository {


    public void saveToFile(String filePath, String csv) {
        try {
            File file = new File(filePath + ".csv");
            FileWriter fileWriter = new FileWriter(file,true);
            fileWriter.append(csv + "\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Car loadFromFile(String filePath) {
        return null;
    }
}
