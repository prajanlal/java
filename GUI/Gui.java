import javax.swing.*;
//import java.awt.Container;
//import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
public class Gui implements ActionListener {  
  
    private static JLabel label;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText; 
    private static JLabel Success;
   
    //https://beginnersbook.com/2015/07/java-swing-tutorial
    public static void main(String args[]){ 
        JFrame frame = new JFrame("Calculator"); 
        frame.setSize(450,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);

      
        frame.setVisible(true);

          panel.setLayout(null);

          JTextField textField  = new JTextField();
          textField.setBounds(20, 30, 400, 50);
          panel.add(textField);

          JButton buttonadd = new JButton("+");
          buttonadd.setBounds(95, 105,200, 50);
          panel.add(buttonadd);

          JButton buttonsub = new JButton("-");
          buttonsub.setBounds(75,95,200,50);
          panel.add(buttonsub);

          JButton buttonmul  =new JButton("*");
          buttonmul.setBounds(95,105,200,50);
          panel.add(buttonmul);
      
          JButton buttondiv = new JButton("/");
          buttondiv.setBounds(120,125,200,50);
          panel.add(buttondiv);
          
          JButton Delete = new JButton("Delete");
          Delete.setBounds(145, 155, 200, 50);
         
    }
          }
           
        
   
