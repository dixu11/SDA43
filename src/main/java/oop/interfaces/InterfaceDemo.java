package oop.interfaces;

public class InterfaceDemo {

    public static void main(String[] args) {
        App app = new App(new DbRepository());
        app.start();
        app.exit();
    }


}
