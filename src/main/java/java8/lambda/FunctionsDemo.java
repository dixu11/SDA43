package java8.lambda;

public class FunctionsDemo {
    public static void main(String[] args) {
        MyConsumer krzykacz =  (String text)  -> {
            System.out.println(text.toUpperCase() + "!");
        };

        krzykacz.consume("Hello");

        MyConsumer firstLetterSelectior = text -> System.out.println(text.charAt(0));

        firstLetterSelectior.consume("Abcd");

        TextChanger first5asLower =  (String text) -> {
            return text.substring(0, 5).toLowerCase();
        };

        //skrocona wersja
        TextChanger first5asLower2 =  text -> text.substring(0, 5).toLowerCase();

        System.out.println(first5asLower.changeText("Co tam słychać?"));



    }
}
