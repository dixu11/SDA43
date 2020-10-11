package collections.zad20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Restaurant {

    private Set<Dish> dishes = new HashSet<>();

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void removeDish(Dish dish) {
        dishes.remove(dish);
    }

    public Dish findDishByName(String name) {
        for (Dish dish : dishes) {
            if (dish.getName().equals(name)) {
                return dish;
            }
        }
        throw new RestaurantException("Nie odnaleziono potrawy: " + name);
    }

    public List<Dish> findDishesByType(DishType type) {
        List<Dish> specifiedTypeDishes = new ArrayList<>();
        for (Dish dish : dishes) {
            if (dish.getDishType() == type) {
                specifiedTypeDishes.add(dish);
            }
        }
        return specifiedTypeDishes;
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "dishes=" + dishes +
                '}';
    }
}
