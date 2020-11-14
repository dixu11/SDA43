package oop.zad6;

public class Bed {

    private boolean made = false;

    public boolean isMade() {
        return made;
    }

    public void make() {
        made = true;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "made=" + made +
                '}';
    }
}
