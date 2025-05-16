package java;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui {

    private ArrayList<String> tasks;
    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;
    private JTextField taskField;

    public void TaskManager() {
        tasks = new ArrayList<>();

        JFrame frame = new JFrame("Task Manager");
        JTextField textField = new JTextField(20);
        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
    
        taskField = new JTextField(20);
        frame.add(taskField);

        JButton addButton = new JButton("Add Task");
        frame.add(addButton);

        JButton listButton = new JButton("List Tasks");
        frame.add(listButton);
               
        JButton  deleteButton = new JButton("Delete Task");
        frame.add(deleteButton);

        JButton startButton = new JButton("Start Task");
        frame.add(startButton);

        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(task);
        frame.add(new JScrollPane(taskList));

        addButton.addActionListener(e -> addTask());
        listButton.addActionListener(e -> listTasks());
        deleteButton.addActionListener(e -> deleteTask());
        startButton.addActionListener(e -> startApp);
         frame.setVisible(true);

        
    }
    private Object addTask() {
        throw new  UnsupportedOperationException("Unimplemented method 'addtask'  ");
        
    }
    private Object listTasks() {
        throw new UnsupportedOperationExcption("Unimplemented method 'listTasks' ");
