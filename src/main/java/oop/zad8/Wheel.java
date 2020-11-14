package oop.zad8;

public class Wheel {
    private int pressure = 220;
    private boolean pierced = false;


    public void pierce() {
        pierced = true;
        pressure = 0;
    }

    public void repair(int newPressure) {
        pressure = newPressure;
        pierced = false;
    }

    public boolean isPierced() {
        return pierced;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "pressure=" + pressure +
                ", pierced=" + pierced +
                '}';
    }
}
