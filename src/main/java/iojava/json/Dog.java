package iojava.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Dog {

    @JsonProperty("owner_name") // po stronie json uzywam : owner_name
    private String ownerName;

    public Dog( String ownerName) {
        this.ownerName = ownerName;
    }

    private Dog() {
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return
                Objects.equals(ownerName, dog.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerName);
    }

    @Override
    public String toString() {
        return "Dog{" +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
