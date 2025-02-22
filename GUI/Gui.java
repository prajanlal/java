import javax.swing.*;
<<<<<<< HEAD
//import java.awt.Container;
//import java.awt.event.*;
public class Gui   { 
=======
import java.awt.*;
import java.awt.event.*;

public class Gui implements ActionListener {  
  
    private static JLabel label;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText; 
    private static JLabel Success;
   
>>>>>>> 5763c9e370af961851231e07bb0bcd21db325ca3
    //https://beginnersbook.com/2015/07/java-swing-tutorial
    public static void main(String args[]){ 
        JFrame frame = new JFrame("Calculator"); 
        frame.setSize(450,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
<<<<<<< HEAD
      
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

          JButton buttonmod  = new JButton("%");
          buttonmod.setBounds(110,115,200,50);
          panel.add(buttonmod);

          JButton buttondiv = new JButton("/");
          buttondiv.setBounds(120,125,200,50);
          panel.add(buttondiv);
          
          JButton Delete = new JButton("Delete");
          Delete.setBounds(145, 155, 200, 50);
         
          JButton Clear = new JButton();
          Clear.setBounds(165, 175, 200, 50);
    }
          }
           
          
         

   
=======
          
         panel.setLayout(null);
  
        label = new JLabel("User");
        label.setBounds(10,20,80,25);
        panel.add(label);
     
         userText =new JTextField(50);
         userText.setBounds(100,20,165,25);
         panel.add(userText);
        
        passwordLabel= new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);
        
        passwordText = new JPasswordField(50);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);
         
       JButton button = new JButton("LOGIN");
       button.addActionListener(new GUI());
       button.setBounds(10,80,80,25);
       panel.add(button); 
  
        JLabel Success = new JLabel("");
        Success.setBounds(10,110,300,25);
        panel.add(Success);
         
        frame.setVisible(true);
    }
  
    @Override
    public void actionPerformed(ActionEvent e) { 
          String user = userText.getText();      
         
      
          System.out.println(user + " "); 
         
           if(user.equals("Prajan Lal")){
             Success.setText("Login Successful!");
           }
      }
>>>>>>> 5763c9e370af961851231e07bb0bcd21db325ca3

