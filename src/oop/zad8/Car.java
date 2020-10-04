package oop.zad8;

import java.util.Arrays;

public class Car {
    private Wheel[] wheels = new Wheel[4];

    public Car() {
        wheels[0] = new Wheel();
        wheels[1] = new Wheel();
        wheels[2] = new Wheel();
        wheels[3] = new Wheel();
    }


    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + Arrays.toString(wheels) +
                '}';
    }
}
