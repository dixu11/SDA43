package oop.inheritance;

public class Cat extends Animal {

    public Cat() {
        super("Puszek",2);
    }

    public Cat(String name, int age) {
        super(name, age);
    }


   /* public Cat() {
        name = "Puszek";
        age = 2;
    }*/

    public void makeSound() {
        System.out.println(" miałczy, miał! ");
    }

    @Override
    public void attack() {
        System.out.println("kot drapie");
    }

    public void chaseMice() {
        System.out.println("Kot goni mysz");
    }

}
