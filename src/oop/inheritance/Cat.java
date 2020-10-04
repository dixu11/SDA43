package oop.inheritance;

public class Cat extends Animal {

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
        name = "Puszek";
        age = 2;
    }

    public void meow() {
        System.out.println(name +" miałczy, miał! ");
    }

}
