package oop.zad6;

import java.util.ArrayList;
import java.util.List;

public class HouseDemo {

    public static void main(String[] args) {
        Room room = new Room(2);
        Room room2 = new Room(4);
        List<Room> rooms = new ArrayList<>();
        rooms.add(room);
        rooms.add(room2);
        House house = new House(rooms);
        System.out.println(house);
        house.cleanUp();
        System.out.println(house);
    }

}

 /* Zrób osobny pakiet, w którym stworzysz następującą strukturę. Obiekt House posiada jedne drzwi i tablicę
    pokojów (obiekty Door i Room). Pokój posiada łóżko (Bed) oraz tablicę okien (Window).  Łóżko może być
    pościelone lub nie, a okno otwarte lub zamknięte.
    Zadbaj aby program realizował następujące stwierdzenia:
    Aby stworzyć dom należy wstawić tablicę pokojów, a drzwi frontowe powinny utworzyć się automatycznie. Aby
    stworzyć pokój należy podać ile ma mieć okien (okna mają tworzyć się automatycznie jako zamknięte),
    natomiast łóżko ma stworzyć się samo jako niepościelone.
    W programie stwórz dom z dwoma pokojami, jeden z 2 oknami, a drugi, większy z 4.

    W klasie House przygotuj metodę sprzątającą, której zadaniem będzie pootwieranie wszystkich okien oraz
    pościelenie łóżek.
    Wykorzystaj metodę toString domu aby upewnić się, że metoda działa poprawnie.*/
