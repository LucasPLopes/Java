import java.util.concurrent.Semaphore;
public class SemaphoreApp{
    public static void main(String[] args) throws Exception{
        Semaphore sem  = new Semaphore(1);
        
        
        sem.acquire();
        sem.release();
        System.out.println("Available permits: "+ sem.availablePermits());
    }
}    