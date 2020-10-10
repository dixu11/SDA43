package oop.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionsDemo4 {
    public static void main(String[] args) {
       // throw new MyException();
        Shop shop = new Shop();

        try {
            shop.openShop();
            shop.loadProductsFromFile();

        } catch (NoProductsException exception) {
            System.out.println("Zabrakło produktu w sklepie ");
        } catch (ShopException | NoSuchElementException e) { //blok multicatch
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Niepoprawny format");
        }catch (Exception e){ //wszystkie inne wyjątki
            System.out.println(e.getMessage());
        }
        finally {
            shop.closeShop();
        }

        System.out.println(shop.isOpen());

        try {
            Product chleb = shop.findProductByName("chleb");
            chleb.setPrice(4); //potencjalny null pointer jesli nie znajdzie chleba
            System.out.println(chleb);
        } catch (ShopException e) {
            System.out.println(e.getMessage());
        }
    }
}
