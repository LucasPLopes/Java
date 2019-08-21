public class App{
    public static void main(String[] args) throws InterruptedException {
        final Processor processor = new Processor();


        Thread t1 = new Thread(new Runnable(){
        
            @Override
            public void run() {
                try {
                    processor.produce();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        Thread t2 = new Thread(new Runnable(){
        
            @Override
            public void run() {
                try {
                    processor.consume();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        t1.start();
        t2.start();
        
        try {
            Thread.sleep(30000);
        } catch (Exception e) {
            
        }
        System.exit(0);
    }
}