
class Runner extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner "+ i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class App{
    public static void main(String[] args) {
     Runner runner1 = new Runner(),
        runner2 = new Runner();
     
    runner1.start();
    runner2.start();

    }
}