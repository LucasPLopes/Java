import java.util.LinkedList;

public class GetTheTiles implements Runnable {

    @Override
    public void run() {
        Singleton2 instance = Singleton2.getInstance();
        
        System.out.println("Instance ID: " + System.identityHashCode(instance));
        System.out.println(instance.getLetterList());

        LinkedList<String> list = instance.getTiles(7);
        System.out.println("Player : " + list);
        System.out.println("Got Tiles");
    }
    
}