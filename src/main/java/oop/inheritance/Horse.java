package oop.inheritance;

public class Horse  extends Animal{


    public Horse(String name, int age) {
        super(name, age);
    }

    public Horse(){
        super("Freddie", 7);
    }

    @Override
    public void makeSound() {
        System.out.println("ihaha");
    }

    @Override
    public void attack() {
        System.out.println("koń ucieka");
    }
}
