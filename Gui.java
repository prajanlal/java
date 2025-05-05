
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui {

    public static void main(String[] args) {

        JLabel label = new JLabel();
        JTextField text = new JTextField();
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        frame.setVisible(true);
        panel.setLayout(null);

    }
}
