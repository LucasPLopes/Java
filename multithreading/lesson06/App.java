import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor implements Runnable {
    private CountDownLatch latch;

    @Override
    public void run() {
        System.out.println("Started.");
        try {
            Thread.sleep(1500);
        } catch (Exception e) {
            e.printStackTrace();
        }

        latch.countDown();
    }

    public Processor(CountDownLatch latch) {
        this.latch = latch;
    }

}

public class App {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++) {
            executor.submit(new Processor(latch));
        }

        try {
            latch.await();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Completed.");
    }
}