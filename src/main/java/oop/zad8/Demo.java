package oop.zad8;

import oop.garden.Garden;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car();
        Garage garage = new Garage();
        System.out.println(car);
        car.pierceRandomWheel();
        car.pierceRandomWheel();
        System.out.println(car);
        garage.repair(car);
        System.out.println(car);
    }
}


  /*  W programie zrealizuj następujący scenariusz: Samochód ma koła, a ich opony mają ustalone ciśnienie i mogą być przebite.
        Warsztat może przyjmować samochód żeby go naprawić.
        W klasie WarsztatDemo stwórz samochód z czterema kołami oraz  warsztat.
        Następnie tworząc i wywołując odpowiednie metody zasymuluj następujące zdarzenia:
        samochód łapie gumę w losowym kole,
        warsztat przyjmuje samochód do naprawy,
        warsztat sprawdza stan kół i wymienia przebite opony,
        warsztat po wykonaniu usługi drukuje ile kół wymienił i ile będzie to kosztowało.*/
