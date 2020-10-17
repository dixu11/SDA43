package java8;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    public List<String> getNamesStartingOf(char letter, List<String> names) {
        List<String> selectedNames = new ArrayList<>();
        for (String name : names) {
            if (name.charAt(0) == letter) {
                selectedNames.add(name);
            }
        }
        return selectedNames;
    }



}
