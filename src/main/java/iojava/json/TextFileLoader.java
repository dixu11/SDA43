package iojava.json;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TextFileLoader {

    public List<String> loadFromFile(String filePath) {
        try {
            File file = new File(filePath);
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
