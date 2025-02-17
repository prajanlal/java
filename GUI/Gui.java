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
  
    public static void main(String args[]){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.add(panel);
          
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

}
