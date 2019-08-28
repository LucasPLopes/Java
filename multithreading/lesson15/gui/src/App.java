
import javax.swing.SwingUtilities;



/**
 *
 * @author lucas
 */
public class App {
      public static void main(String[] args) {
          SwingUtilities.invokeLater(new Runnable() {
              @Override
              public void run() {
                  new MainFrame("SwingWorker Demo");
              }
          });
    }
}
