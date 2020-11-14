package oop.zad8;

import java.util.Arrays;
import java.util.Random;

public class Car {
    private Wheel[] wheels = new Wheel[4];

    public Car() {
        wheels[0] = new Wheel();
        wheels[1] = new Wheel();
        wheels[2] = new Wheel();
        wheels[3] = new Wheel();
    }

    public void pierceRandomWheel() {
        Random random = new Random();
        int randomIndex = random.nextInt(wheels.length);
        Wheel randomWheel = wheels[randomIndex];
        randomWheel.pierce();
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + Arrays.toString(wheels) +
                '}';
    }
}
