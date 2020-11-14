package thread.zad31;

public class ConcatenationTask implements Runnable{
    private String text;
    private int concatenations;
    private String result = "";
    private Thread thread = new Thread(this);
    private boolean running = true;

    public ConcatenationTask(String text, int concatenations) {
        this.text = text;
        this.concatenations = concatenations;
    }

    public void startTask(){
        thread.start();
    }

    public void waitForEnd() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void abort(){
        running = false;
    }

    @Override
    public void run() {
        for (int i = 0; i < concatenations; i++) {
            if (!running) {
                return;
            }
            result += text;
        }
    }

    public String getResult() {
        return result;
    }
}
