package oop.inheritance;

public abstract class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void goToSleep() {
        System.out.println(name + " idzie spać");  // co zrobić żeby odnieść się do imienia?
    }

    public abstract void makeSound();

    public abstract void attack();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
