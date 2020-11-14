package iojava.json;

import java.util.Objects;

public class Dog {

    private String name;
    private String ownerName;

    public Dog(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
    }

    private Dog() {
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) &&
                Objects.equals(ownerName, dog.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ownerName);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
