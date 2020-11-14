package collections.zad22;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException() {
        super("Podano zły email lub hasło");
    }
}
