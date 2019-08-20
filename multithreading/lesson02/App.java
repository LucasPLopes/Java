import java.util.Scanner;

class Processor extends Thread {
    //the keyword volatile is  used to prevent thread cached variables
    //there is no way that variable running be ignored by thread
    private volatile boolean running = true;
    public void run(){g
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void shutdown(){
        running = false;
    }
}
public class App{
    public static void main(String[] args) {
        //two threads are running, main and processor
        Processor processor = new Processor();
        processor.start();
        System.out.println("Press return to stop ...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        processor.shutdown();
    }
}