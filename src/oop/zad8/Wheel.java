package oop.zad8;

public class Wheel {
    private int pressure = 220;
    private boolean pierced = false;

    @Override
    public String toString() {
        return "Wheel{" +
                "pressure=" + pressure +
                ", pierced=" + pierced +
                '}';
    }
}
