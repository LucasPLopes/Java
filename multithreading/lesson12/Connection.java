import java.util.concurrent.Semaphore;

public class Connection {// Singleton
    private static Connection instConnection = new Connection();
    private Semaphore sem = new Semaphore(10, true);

    private int connections = 0;

    private Connection() {
    };

    public static Connection getConnection() {
        return instConnection;
    }

    public void connect() {
        try {
            sem.acquire();

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            doConnect();
        } finally{
            sem.release();
        }
    }

    public void doConnect() {
        synchronized (this) {
            connections++;
            System.out.println("Currents connections: " + connections);
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        synchronized (this) {
            connections--;
        }
    }
}