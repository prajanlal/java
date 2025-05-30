import java.panel;
import java.scrollPane;
import java.BorderLayout;
import java.JscrollPane;
import java.
public class Gui {
    private DefaultListModel<String> taskListModel;
    private ArrayList<String> tasks;
    
  public static void main(String[] args) {
      
  //  JFrame frame = new JFrame("Calculator");
 //   JPanel panel = new JPanel();

  //  frame.setSize(450,450);
  //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  //  frame.setVisible(True);
 //   frame.add(panel);

   // JTextField textField = new JTextField();
    textField.setBounds(20,30,400,300);

    public void TaskManagerGUI() {
        tasks = new ArrayList<>();                        //Main method of this Gui program
        taskListModel = new DefaultListModel<>();
        createUI();
    }
    
    private void createUI() {
        JFrame frame = new JFrame("Task Manager");                           //Creating a parent/Main method 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        JList<String> taskList = new JList<>(taskListModel);
        JScrollPane scrollPane = new JScrollPane(taskList);
        panel.add(scrollPane, BorderLayout.CENTER);
        
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        
        inputPanel.add(taskField);
        inputPanel.add(addButton);
        inputPanel.add(listButton);
        inputPanel.add(deleteButton);
        
        panel.add(inputPanel, BorderLayout.SOUTH);
        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = taskField.getText();
                if (!task.isEmpty()) {
                    tasks.add(task);
                    taskListModel.addElement(task);
                    taskField.setText("");
                }
            }
        });
        
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Tasks:\n" + String.join("\n", tasks));
            }
        });
        
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    tasks.remove(selectedIndex);
                    taskListModel.remove(selectedIndex);
                }
            }
        });
        
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TaskManagerGUI();
    }
}, +, -};

    
    

    

    
    

    
