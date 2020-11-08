package thread.synchronization;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        IncrementTask task = new IncrementTask();
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(task.getCounter());
    }
}
