package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public List<String> getNamesStartingOf2(char letter, List<String> names) {
       return names.stream()
               .filter(name ->  name.charAt(0) == letter)
               .collect(Collectors.toList());
    }


    public Optional<String> findNameInNames (List<String> names , String name){
        for (String someName : names) {
            if (name.equals(someName)) {
                return Optional.of(name);
            }
        }
        return Optional.empty();
    }



}
