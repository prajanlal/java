import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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

       JLabel userLabel = new JLabel("User");

       userLabel.setBounds(10,20,80,25);
       panel.add(userLabel);

       JTextField userText = new JTextField(20);
       userText.setBounds(100,20,165,25);
       panel.add(userText);
       
       JLabel passwordLabel = new JLabel("Password");
         passwordLabel.setBounds(10,50,80,25);
         panel.add(passwordLabel);

         JPasswordField passwordText = new JPasswordField(20);
         passwordText.setBounds(100,50,165,25);
         panel.add(passwordText);

         JButton loginButton = new JButton("Login");
         loginButton.setBounds(10,80,80,25);
         panel.add(loginButton);




    }

}
