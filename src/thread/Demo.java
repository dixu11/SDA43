package thread;

public class Demo {
    public static void main(String[] args) {
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

        pracownik.start();
        pracownik2.start();




    }
}
