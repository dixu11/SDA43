package oop.zad6;

public class Window {

    private boolean open = false;

    public boolean isOpen() {
        return open;
    }

    public void open() {
        open = true;
    }

    @Override
    public String toString() {
        return "Window{" +
                "open=" + open +
                '}';
    }
}
