import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App{
    public static void main(String[] args) throws Exception {
        Connection  conn = Connection.getConnection();
        
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 200; i++) {
            executorService.submit(new Runnable(){
            
                @Override
                public void run() {
                    Connection.getConnection().connect();
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination( 5, TimeUnit.SECONDS);

    }
}