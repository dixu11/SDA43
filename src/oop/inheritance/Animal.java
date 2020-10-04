package oop.inheritance;

public class Animal {

    private String name;
    private int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void goToSleep() {
        System.out.println(name + " idzie spać");  // co zrobić żeby odnieść się do imienia?
    }

    public void makeSound() {
       // System.out.println("Zwierze wydaje dźwięk");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
