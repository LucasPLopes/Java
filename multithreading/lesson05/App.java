import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Thread pool
class Processor implements Runnable {
    private int id;

    @Override
    public void run() {
        System.out.println("Starting: " + id);
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Completed: " + id);
    }

    public Processor(int id) {
        this.id = id;
    }
}

public class App {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        
    }
}