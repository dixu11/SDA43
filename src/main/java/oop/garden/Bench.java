package oop.garden;

public class Bench {

    private int size;
    private String material;
    private int peopleSitting = 0;


    public Bench(int size, String material) {
        this.size = size;
        this.material = material;
    }

    public boolean sitOnBench() {
        if (peopleSitting < size) {
            peopleSitting++;
//            System.out.println("Siadasz");
            return true;
        } else {
//            System.out.println("Nie ma miejsca na ławce!");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Bench{" +
                "size=" + size +
                ", material='" + material + '\'' +
                ", peopleSitting=" + peopleSitting +
                '}';
    }
}
