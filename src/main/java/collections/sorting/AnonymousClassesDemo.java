package collections.sorting;

import oop.inheritance.Cat;

import java.util.Comparator;

public class AnonymousClassesDemo {

    public static void main(String[] args) {

        //klasa lokalna
        class MyComparator implements Comparator<Integer> {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        }

        MyComparator myComparator = new MyComparator();



        //klasa anonimowa
        Cat cat = new Cat(){
            public void makeSound() {
                System.out.println("Mrau...");
            }
        };
        cat.makeSound();
    }

    //klasa wewnetrzna
    class InnerClass{

    }

}

//klasa pakietowa
class ClassInSameFile{

}
