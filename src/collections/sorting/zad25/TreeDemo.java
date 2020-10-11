package collections.sorting.zad25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeDemo {

    public static void main(String[] args) {
        List<Tree> forest = new ArrayList<>();
        //fori

        for (int i = 0; i < 100; i++) {
            forest.add(new Tree());
        }

        Tree specialTree = new Tree(){
            @Override
            public void display() {
                System.out.println("trafiłeś na magiczne drzewo!");
            }
        };

        forest.add(specialTree);
        Collections.shuffle(forest);

        //iter
        for (Tree tree : forest) {
            tree.display();
        }
    }

}

/*
    Stwórz obiekt Tree z metodą display() metoda ta ma drukować “wyświetlam zwykłe drzewo”.
        Stwórz listę 100 drzew i nazwij ją forest. Do zbioru, za pomocą anonimowej klasy, dodaj
        jedno specjalne drzewo, które będzie wyświetlać “trafiłeś na magiczne drzewo!”. Dodaj je
        do zbioru a zbiór wmieszaj metodą Collections.shuffle(List). Przeiteruj się po “lesie” i
        wyświetl wszystkie drzewa za pomocą metody display() :)
        Jedno z nich powinno wykazać szczególne zachowanie.*/
