package thread;

public class TreeDemo {
    public static void main(String[] args) throws InterruptedException {
        DrawTriangleTask task = new DrawTriangleTask(1000);
        Thread thread = new Thread(task);
        thread.start();


        Thread.sleep(1000);
        //thread.stop(); // nieprawidlowy sposob zamykania wątku
        //prawidłowy sposób -> pozwolić żeby metoda run naturalnie zakończyła działanie (wykorzystać if)
        task.setRunning(false);







//        task.start();
    }
}
