package thread;

public class DrawTriangleTask implements Runnable {

    private int treeSize;
    private Thread thread = new Thread(this);
    private boolean running = true;


    public DrawTriangleTask(int treeSize) {
        this.treeSize = treeSize;
    }

    public void start() {
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < treeSize; i++) {
            for (int j = 0; j < i; j++) {
                if (!running) {
                   return;
                }

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
