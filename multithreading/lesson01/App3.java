
public class App3{
    public static void main(String[] args) {
        //Anonymous class
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Runner "+ i);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();

    }
}