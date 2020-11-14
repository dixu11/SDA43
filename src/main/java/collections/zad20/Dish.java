package collections.zad20;

import java.util.Objects;

public class Dish {

    private String name;
    private double price;
    private int energy;
    private DishType dishType;

    public Dish(String name, double price, int energy, DishType dishType) {
        this.name = name;
        this.price = price;
        this.energy = energy;
        this.dishType = dishType;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getEnergy() {
        return energy;
    }

    public DishType getDishType() {
        return dishType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return Double.compare(dish.price, price) == 0 &&
                energy == dish.energy &&
                Objects.equals(name, dish.name) &&
                dishType == dish.dishType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, energy, dishType);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
