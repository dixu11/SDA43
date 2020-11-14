package java8.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> products = new ArrayList<>();
    private String buyerName;
    private LocalDate transactionDate;

    public Order(String buyerName, LocalDate transactionDate) {
        this.buyerName = buyerName;
        this.transactionDate = transactionDate;
    }

    public void add(Product product) {
        products.add(product);
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", buyerName='" + buyerName + '\'' +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
