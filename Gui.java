import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JTextField textField = new JTextField();
        
        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();                                          // CONSISTENCY
        
        frame.add(panel);

        placeComponents(panel);
       // panel.setBackground(Color.yellow);
    
        frame.setVisible(true);
        
    }
    
    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

       JLabel userLabel = new JLabel();

       userLabel.setBounds(10,20,80,25);
       panel.add(userLabel);


       JTextField userText = new JTextField(20);
       
       userText.setBounds(100,20,165,25);
       panel.add(userText);

       
    }

}
