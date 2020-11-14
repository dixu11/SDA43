package iojava.json;

import java.util.List;
import java.util.Objects;

public class Person {

    private String name;
    private String address;
    private List<Cat> cats;

    public Person(String name, String address, List<Cat> cats) {
        this.name = name;
        this.address = address;
        this.cats = cats;
    }

    private Person() {

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Cat> getCats() {
        return cats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(address, person.address) &&
                Objects.equals(cats, person.cats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, cats);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cats=" + cats +
                '}';
    }
}
