
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        JTextField textField = new JTextField();
        JPanel panel = new JPanel();

        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        frame.setVisible(true);

        textField.setLayout(null);
        textField.setBounds(20, 30, 400, 50);

    }
}
