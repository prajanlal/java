
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Gui implements ActionListener {

    private static JLabel label;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JLabel Success;

    //https://beginnersbook.com/2015/07/java-swing-tutorial
    public static void main(String args[]) {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        frame.add(panel);

        frame.setVisible(true);

        panel.setLayout(null);

        JTextField textField = new JTextField();
        textField.setBounds(20, 30, 400, 50);
        textField.setBackground(Color.LIGHT_GRAY);
        panel.add(textField);

        JButton buttonadd = new JButton("+");
        buttonadd.setBounds(95, 105, 200, 50);
        buttonadd.setBackground(Color.CYAN);
        panel.add(buttonadd);

        JButton buttonsub = new JButton("-");
        buttonsub.setBounds(75, 95, 200, 50);
        buttonsub.setBackground(Color.cyan);
        panel.add(buttonsub);

        JButton buttonmul = new JButton("*");
        buttonmul.setBounds(95, 105, 200, 50);
        buttonmul.setBackground(Color.cyan);
        buttonmul.setBorderPainted(true);
        panel.add(buttonmul);

        JButton buttonmod = new JButton("%");
        buttonmod.setBounds(110, 115, 200, 50);
        buttonmod.setBackground(Color.cyan);
        panel.add(buttonmod);

        JButton buttondiv = new JButton("/");
        buttondiv.setBounds(120, 125, 200, 50);
        buttondiv.setBackground(Color.cyan);
        panel.add(buttondiv);

        JButton Delete = new JButton("Delete");
        Delete.setBounds(145, 155, 200, 50);
        Delete.setBackground(Color.cyan);

        JButton Clear = new JButton();
        Clear.setBounds(165, 175, 200, 50);
        Clear.setBackground(Color.cyan);
        panel.add(Clear);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
