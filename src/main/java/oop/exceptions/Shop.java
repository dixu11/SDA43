package oop.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Shop {

    private List<Product> products = new ArrayList<>();
    private boolean open = false;


    public void openShop() {
        open = true;
    }

    public void loadProductsFromFile() throws ShopException { // zmiana sygnatury ostrzega ze rzucamy wyjatek typu checked

        if (!open) {
            throw new ShopException("Sklep zamknięty! Nie można załadować");
        }

        File file = new File("files/products.txt");
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String content = scanner.nextLine();
                String[] twoParts = content.split(",");
                Product product = new Product(twoParts[0], Integer.parseInt(twoParts[1]));
                products.add(product);
            }
            if (products.isEmpty()) {
                throw new NoProductsException();
            }
        } catch (FileNotFoundException exception) {

        }
    }

    public void closeShop() {
        open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public Product findProductByName(String name) throws  ShopException{
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println("Znaleziono!");
                return product;
            }
        }
        throw new ShopException("Nie znaleziono: " + name);
    }
}
