package thread.zad31;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        ConcatenationTask task = new ConcatenationTask("D",300_000);
        task.startTask(); // start
        Thread thread = new Thread(() -> {
            //na osobnym watku po sekundzie zatrzymuje
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            task.abort();
        });
        thread.start();

        task.waitForEnd();
        System.out.println(task.getResult().length());

    }


}

//    Stwórz klasę ConcatenationTask w której będziemy X razy kopiować ten sam tekst (wykorzystaj ‘+=’).
//    Tzn. tworząc i uruchamiając ConcatenationTask z parametrami: 3 oraz “D” wynikiem pracy wątku powinno być “DDD” zapisane w polu result.
//        Zadanie powinno być możliwe do rozpoczęcia po wywołaniu metody startTask()
//        Zadbaj o to, aby zadanie można było przerwać za pomocą metody abort()
//        w mainie za pomocą anonimowej klasy stwórz i uruchom inny wątek który przerwie zadanie
//        z poprzedniego wątku po sekundzie
//        W mainie na koniec zaprezentuj ile znaków ma wynik konkatenacji. Przetestuj scenariusz
//        w którym ustawiasz tyle razy doklejanie tekstu aby trwało to dłużej niż sekundę i upewnij
//        się, że Twoja metoda abort() działa poprawnie.
