public class Gui {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Calculator");
    JPanel panel = new JPanel();

    frame.setSize(450,450);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(True);
    frame.add(panel);

    JTextField textField = new JTextField();
    textField.setBounds(20,30,400,30);
    panel.add(textField);

    panel.setLayout(null);

    JButton Addbutton = new JButton();
    button.setBounds(30,20,400,30);
    panel.add(Addbutton);

    

    
