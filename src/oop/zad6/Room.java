package oop.zad6;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private Bed bed = new Bed();
    private List<Window> windows = new ArrayList<>();

    public Room(int windowsCount){
        for (int i = 0; i < windowsCount; i++) {
            Window window = new Window();
            windows.add(window);
        }
    }

    public void cleanUp() {
        bed.make();
        for (Window window : windows) {
            window.open();
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "bed=" + bed +
                ", windows=" + windows +
                '}';
    }

    /* Aby
    stworzyć pokój należy podać ile ma mieć okien (okna mają tworzyć się automatycznie jako zamknięte),
    natomiast łóżko ma stworzyć się samo jako niepościelone.*/

}
