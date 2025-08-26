import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui implements ActionListener {  
  
    private static JLabel label;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText; 
    private static JLabel Success;
   
    //https://beginnersbook.com/2015/07/java-swing-tutorial
    public static void main(String args[]) { 
        JFrame frame = new JFrame("Calculator"); 
        frame.setSize(450,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
      
        frame.setVisible(true);

          panel.setLayout(null);

      
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
          }
           
        
   



