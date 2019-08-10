public class MainSingleton2Thread{
    public static void main(String[] args) {
        Runnable getTiles = new  GetTheTiles(); 
        Runnable getTiles2  = new GetTheTiles();

        new Thread(getTiles).start();
        new Thread(getTiles2).start();
    }
}