import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

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

        for (int i = 1; i < 6; i++) {
            executorService.submit(new Processor(i));
        }
        
        System.out.println("All tasks submitted.");
        executorService.shutdown();
        try {
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("All tasks completed.");

    }
}