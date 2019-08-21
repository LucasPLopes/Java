import java.util.LinkedList;

public class Processor {
    private LinkedList<Integer> list = new LinkedList<Integer>();
    private final Int LIMIT = 10;
    private Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized(lock){
                list.add(value++);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {

            synchronized(lock){
                System.out.print("List.size() = " + list.size());
                int value = list.removeFirst();
                System.out.println(" Value removed = " + value);
            }
        }
    }
}