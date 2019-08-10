import java.util.LinkedList;
public class MainSingleton2{
    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();

        System.out.println("Instance ID: " + System.identityHashCode(instance));
        // System.out.println(instance.getLetterList());
        
        LinkedList<String> list1 = instance.getTiles(7);
        System.out.println("Player 1: "+ list1);

        LinkedList<String> list2 = instance.getTiles(7);
        System.out.println("Player 2: "+ list2);

    }
}