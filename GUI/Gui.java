import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui implements ActionListener {  
  
    private static JLabel label;
   
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
           
        
   




