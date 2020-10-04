package oop.inheritance;

public class Dog extends Animal{

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
        name = "Fafik";
        age = 3;
    }

    public void bark() {
        System.out.println(name + " barks! Woof! Wrrr");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
