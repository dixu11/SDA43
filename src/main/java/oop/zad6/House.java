package oop.zad6;

import java.util.ArrayList;
import java.util.List;

public class House {

    private Door entranceDoor = new Door();
    private List<Room> rooms;

    public House(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void cleanUp(){
        for (Room room : rooms) {
            room.cleanUp();
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "entranceDoor=" + entranceDoor +
                ", rooms=" + rooms +
                '}';
    }

    /*
    * W klasie House przygotuj metodę sprzątającą, której zadaniem będzie pootwieranie wszystkich okien oraz
    pościelenie łóżek.
    *
    *
    * */
}
