import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
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


        placeComponents(panel);
        
        panel.setBackground(Color.yellow);

        textField.setBounds(20, 30, 350, 50);
        
        panel.add(textField);
        
    }
    
    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel userLabel -= new JLabel("User");


         userLabel.setBounds(10,20,80,25);


        

        
    }

}
