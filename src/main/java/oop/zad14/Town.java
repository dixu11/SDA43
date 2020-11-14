package oop.zad14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Town {

    private List<Citizen> citizens;

    public Town(List<Citizen> citizens) {
        this.citizens = citizens;
    }

    public Town(Citizen... citizens) {
       // Citizen[] tab = citizens;
        this.citizens = Arrays.asList(citizens);
    }

   // howManyCanVote -  które zwracają ilość osób które mogą głosować
    public int howManyCanVote(){
        int counter = 0;
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                counter++;
            }
        }
        return counter;
    }

    //whoCanVote -  która wypisuje imiona osób które mogą głosować*/
    public void whoCanVote() {
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                System.out.println(citizen.getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Town{" +
                "citizens=" + citizens +
                '}';
    }
}
