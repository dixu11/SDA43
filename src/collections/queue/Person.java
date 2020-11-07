package collections.queue;

public class Person implements Comparable<Person>{
    private String name;
    private boolean vip;

    public Person(String name, boolean vip) {
        this.name = name;
        this.vip = vip;
    }

    @Override
    public int compareTo(Person o) {
        if (vip) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vip=" + vip +
                '}';
    }
}
