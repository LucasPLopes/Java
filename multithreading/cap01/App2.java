
class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class App2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner()), 
            t2 = new Thread(new Runner());

            t1.start();
            t2.start();
    }
}