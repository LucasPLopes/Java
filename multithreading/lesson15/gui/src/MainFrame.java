
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingWorker;

public class MainFrame extends javax.swing.JFrame {

    private JLabel count1 = new JLabel("0");
    private JLabel statusLabel = new JLabel("Task not completed");
    private JButton startBtn = new JButton("Start");

    public MainFrame() {

    }

    public MainFrame(String title) {
        super(title);
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.NONE;

        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 1;
        gc.weighty = 1;
        add(count1, gc);
        gc.gridx = 0;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        add(statusLabel, gc);
        gc.gridx = 0;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.weighty = 1;
        add(startBtn, gc);

        startBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                start();
            }
        });

        setSize(500, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    private void start() {
        SwingWorker<Boolean, Void> worker = new SwingWorker<Boolean, Void>() {
            @Override
            protected Boolean doInBackground() throws Exception {
                for (int i = 0; i < 30; i++) {
                    Thread.sleep(100);
                    count1.setText("Hello " + i);
                    System.out.println("Hello " + i);
                }
                return true;
            }

            @Override
            protected void done() {
                try {
                    Boolean status = get();
                    statusLabel.setText("Completed with status: " + status);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            protected void process(List<Void> chunks) {
                super.process(chunks); //To change body of generated methods, choose Tools | Templates.
            }

        };
        worker.execute();
    }
}
