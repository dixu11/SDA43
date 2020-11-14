package oop.garden;

public class Tree {

    private double sizeInMeters;
    private int number;

    public Tree(double sizeInMeters,int number) {
        this.sizeInMeters = sizeInMeters;
        this.number = number;
    }

    public void grow() {
        sizeInMeters++;
        System.out.println("Drzewo numer: " + number + " rośnie");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "sizeInMeters=" + sizeInMeters +
                ", number=" + number +
                '}';
    }
}
