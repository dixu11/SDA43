package collections.zad20;

public class SetDemo {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Dish dish = new Dish("jajecznica", 19, 333, DishType.BREAKFAST);
        Dish dish2 = new Dish("Ogórkowa", 28.20, 128, DishType.APPETIZER);
        Dish dish3 = new Dish("Schabowy", 33, 421, DishType.DINNER);
        Dish dish4 = new Dish("Wątróbka", 21.55, 301, DishType.BREAKFAST);
        Dish dish5 = new Dish("Kaszanka", 33.20, 218, DishType.BREAKFAST);
        Dish dish6 = new Dish("Kaszanka", 33.20, 218, DishType.BREAKFAST);
        restaurant.addDish(dish);
        restaurant.addDish(dish2);
        restaurant.addDish(dish3);
        restaurant.addDish(dish4);
        restaurant.addDish(dish5);
        restaurant.addDish(dish6);

        System.out.println(restaurant);

        System.out.println(restaurant.findDishByName("Ogórkowa"));
       // System.out.println(restaurant.findDishByName("Carbonara"));
        System.out.println(restaurant.findDishesByType(DishType.BREAKFAST));

    }
}


   /* Stwórz obiekt Dish (potrawa), potrawa ma posiadać nazwę, cenę, wartość kaloryczną oraz enum - typ (np. BREAKFAST, DINNER, APPETIZER).

        Uwaga, żadna z poniższych metod nie powinna drukować
        nic w konsoli. Wykorzystaj metody toString oraz wartości
        zwracane lub obsługę wyjątków :)

        stwórz klasę Restaurant, zawierającą zbiór dań
        stwórz metody pozwalającą dodać danie i usunąć
        dodaj do restauracji 5 różnych dań
        zaimplementuj metody equals i hashCode aby uniknąć duplikatów i upewnij się, że spełniają swoje zadanie
        stwórz metodę pozwalającą wyszukać danie po nazwie, ma ona zwracać obiekt typu Dish, w przypadku nie odnalezienia
        takiego obiektu obiektu ma rzucać wyjątek typu RestaurantException
        stwórz metodę pozwalającą wyszukać dania po typie potrawy, jeśli nie ma żadnej potrawy w danym typie,
         metoda ma zwracać pustą listę.
*/
