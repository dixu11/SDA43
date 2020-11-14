package java8.stream;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public void add(Order order){
        orders.add(order);
    }

    public boolean hasOrdersOnSunday(){
       return orders.stream()
                .map(order -> order.getTransactionDate())
                .filter(date -> date.getDayOfWeek() == DayOfWeek.SUNDAY)
                .findAny()
                .isPresent();
    }

    //same
   /* public boolean hasOrdersOnSunday(){
        return orders.stream()
                .map(order -> order.getTransactionDate())
                .anyMatch(date -> date.getDayOfWeek() == DayOfWeek.SUNDAY);
    }*/

    public int howManyProductSold(String productName){
      return   orders.stream()
                .flatMap(order -> order.getProducts().stream())
                //flat map zrobi nam z 2 orderow 3 produkty
                .filter( product -> product.getName().equals(productName))
                .mapToInt(product -> product.getAmount())
                .sum();
    }

}
