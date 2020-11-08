package thread;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Runnable zadanie =  new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000; i++) {
                    System.out.println(i + " Pozdrowienia z osobnego wątku 1");
                }
            }
        };

        Runnable zadanie2 =   () -> {
            for (int i = 0; i < 1_000; i++) {
                System.out.println(i + " Pozdrowienia z osobnego wątku 2");
            }
        };

        Thread pracownik = new Thread(zadanie);
        Thread pracownik2 = new Thread(zadanie2);

        pracownik.start(); // przygotuj nowy wątek i zleć na nim uruchomienie run z runnable
        pracownik2.start();

       // pracownik.run(); // uruchom run z runnable  // BLAD!
      //  pracownik2.run();

        System.out.println("Wystartowani");
        pracownik.join();
        pracownik2.join();
        System.out.println("Koniec programu");
    }
}
