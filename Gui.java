
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JTextField textField = new JTextField();

        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setBackground(Color.yellow);

        panel.setLayout(null);

    }
}
