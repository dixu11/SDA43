package java8.funcionsExemple;

public class HelloAction implements ButtonAction {
    @Override
    public void action() {
        System.out.println("Hello!");
    }
}
