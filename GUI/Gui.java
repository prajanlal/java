import javax.swing.*;

public class Gui  {  
  public static void main(String[] args) {
     
  
       JFrame frame = new JFrame("Calculator");
       JPanel panel = new JPanel();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(420,550);
       frame.setLayout(null);
             frame.add(panel);

                  JTextField textfield = new JTextField();
                  textfield.setBounds(50, 60, 160, 80);
                  panel.add(textfield);
     
             frame.setVisible(true);
  }
          }