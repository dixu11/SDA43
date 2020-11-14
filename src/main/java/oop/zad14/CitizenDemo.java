package oop.zad14;

import java.util.ArrayList;
import java.util.List;

public class CitizenDemo {
    public static void main(String[] args) {

        King king = new King("Artur");
        Peasant peasant = new Peasant("Ronin");
        Soldier soldier = new Soldier("Wiktor");
        Townsman townsman = new Townsman("Arianna");

        List<Citizen> citizens = new ArrayList<>();
        citizens.add(king);
        citizens.add(peasant);
        citizens.add(soldier);
        citizens.add(townsman);

       // Town town = new Town(citizens); // sposob 1 przez dostarczenie listy
        Town town = new Town(king, peasant, soldier, townsman); // sposob 2 przez varargs (tworzy z nich tablice)

        System.out.println(town);
        System.out.println(town.howManyCanVote());
        town.whoCanVote();


    }
}

 /*   Stwórz klasę abstrakcyjną Citizen oraz klasy dziedziczące:
        Peasant(Chłop),
        Townsman(Mieszczanin),
        King(Król),
        Soldier(Żołnierz)
        Wszystkie klasy posiadają pole imie (przemyśl gdzie powinno się znajdować to pole).
        Citizen powinien być klasą abstrakcyjną która posiada metodę abstrakcyjną 'canVote'
         która zwraca true dla townsman'a i soldier'a, ale false dla chłopa i króla.

        Stwórz klasę Town która posiada zbiór obiektów typu Citizen.
        Dodaj do niej kilku citizenów (tworząc ich w main).
        Obiekt klasy Town ma mieć metody:
        howManyCanVote -  które zwracają ilość osób które mogą głosować
        whoCanVote -  która wypisuje imiona osób które mogą głosować*/
