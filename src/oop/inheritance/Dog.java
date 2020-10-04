package oop.inheritance;

public class Dog extends Animal{

    public Dog() {
        super("Fafik",3);
    }

    public Dog(String name, int age){
        super(name, age);
    }




  /*  public Dog() {
        name = "Fafik";
        age = 3;
    }*/

    public void makeSound() {
        System.out.println(" barks! Woof! Wrrr");
    }

    @Override
    public void attack() {
        System.out.println("Pies gryzie");
    }

}
