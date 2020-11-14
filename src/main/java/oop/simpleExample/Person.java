package oop.simpleExample;

public class Person{

    //cechy - pola
    private String name;
    private int age;

    //konstruktory
    public Person(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    //zachowania - metody
    public void sayHello() {
        System.out.println("My name is " + name + " and i am " + age);
    }

    public void birthday() {
        System.out.println(name + " has birthday!");
        age++;
    }

    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    @Override // opcjonalne
    public String toString(){
        return "name: "+ name +" age: "+  age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
