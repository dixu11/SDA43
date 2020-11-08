package thread.synchronization;

import java.util.concurrent.atomic.AtomicInteger;

public class IncrementTask implements Runnable {

    private int counter;
    //specjalna wersja int przygotowana do wielowatkowosci
    private AtomicInteger atomicCounter = new AtomicInteger(0);

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (this){ //blok synchronizacji
                counter++;
            }
            atomicCounter.getAndIncrement();//atomowa operacja -> stanowiaca jedna calosc
            increment();
        }
    }

    //jeden watek na raz
    public synchronized void increment() {
        counter++;
    }


}
