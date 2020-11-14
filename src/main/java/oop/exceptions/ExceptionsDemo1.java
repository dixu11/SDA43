package oop.exceptions;

public class ExceptionsDemo1 {

    private static String textField = null;

    public static void main(String[] args) {
        try{
            System.out.println(textField.charAt(0));
        }catch ( NullPointerException exception ){
            System.out.println("Mamy nulla w textField!");
        }

        System.out.println("Hello");
    }


}
