package java8.stream;

import java.time.LocalDate;

public class StreamDemo3 {

    public static void main(String[] args) {

        Product product1 = new Product("chleb",4.5,1);
        Product product2 = new Product("bułka",2.5,6);
        Product product3 = new Product("masło",3.5,1);

        Order order1 = new Order("Zenek", LocalDate.now().minusDays(3));
        Order order2 = new Order("Grażyna", LocalDate.now().minusDays(6));

        order1.add(product1);
        order1.add(product2);
        order2.add(product3);

        Shop shop = new Shop();
        shop.add(order1);
        shop.add(order2);
        System.out.println(shop.hasOrdersOnSunday());
        System.out.println(shop.howManyProductSold("bułka"));
    }
}
