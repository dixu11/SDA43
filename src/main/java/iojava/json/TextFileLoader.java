package iojava.json;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TextFileLoader {

    public String loadFromFile(String filePath) {
        try {
            File file = new File(filePath);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String content = bufferedReader.lines()
                    .reduce((l1, l2) -> l1 + l2) // dla kazdych 2 stringow stworz jeden laczac go -> redukuje stream do pojedynczego stringa
                    .orElse("");
            bufferedReader.close();
            return content;
        } catch (FileNotFoundException exception) {
            System.out.println("Nie zaczytano startowych plików - brak zapisanego pliku");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

}
