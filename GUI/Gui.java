import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Gui  { 
    //https://beginnersbook.com/2015/07/java-swing-tutorial
  public class Gui{
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setSize(350,200);
        frame.setSizeDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
}
         private static void placeComponents(JPanel panel){
          panel.setLayout(null);
          
         }
  }
}