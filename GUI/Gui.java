import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Gui implements ActionListener {  
  
    private static JLabel label;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText; 
    private static JLabel Success;
    JButton addButton,subButton,mulButton,decButton;
    JButton equButton,clrButton,delButton,divButton;
   static JButton[] functionButtons = new JButton[8];
   static JButton[] numberButtons = new JButton[10];
    
    
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
       button.addActionListener(new Gui());
       button.setBounds(10,80,80,25);
       panel.add(button); 
  
        JLabel Success = new JLabel("");
        Success.setBounds(10,110,300,25);
        panel.add(Success);
         
          JButton addButton = new JButton();
          addButton.setBounds(40, 60, 160, 100);
          panel.add(addButton);

         JButton subButton = new JButton();
         subButton.setBounds(60, 90, 160, 100);
         panel.add(subButton);

         JButton mulButton = new JButton();
         mulButton.setBounds(80, 120, 160, 100);
         panel.add(mulButton);
  
         
         JButton decButton = new JButton();
         decButton.setBounds(100, 150, 160, 100);
         panel.add(decButton);

         JButton equButton = new JButton();
         equButton.setBounds(120, 180, 160, 100);
         panel.add(equButton);

         JButton clrButton = new JButton();
         clrButton.setBounds(140,210,160,100);
         panel.add(clrButton);

         JButton delButton = new JButton();
         delButton.setBounds(160,240,160,100);
         panel.add(delButton);

         JButton divButton = new JButton();
         divButton.setBounds(180,270,160,100);
         panel.add(divButton);


         
         functionButtons[0] =addButton;
        frame.setVisible(true);
    }
  
    @Override
    public void actionPerformed(ActionEvent e) { 
          String user = userText.getText();      
          String password = passwordchar.getText();
      
          System.out.println(user + " , " + password); 
         
           if(user.equals("Prajan Lal") && password.equals("p123456789p")){
             Success.setText("Login Successful!");
           }
      }

}
