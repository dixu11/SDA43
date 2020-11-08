package iojava;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<String> loadFromFile(String filePath) {
        try {
            File file = new File(filePath + ".csv");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            List<String> lines = bufferedReader.lines()
                    .collect(Collectors.toList());
            bufferedReader.close();
            return lines;
        } catch (FileNotFoundException exception) {
            System.out.println("Nie zaczytano startowych plików - brak zapisanych smochodów");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
