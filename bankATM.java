import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

class bankATM {

    private static JFrame mainFrame, areaRound;
    private static JPanel mainPanel, areaRPanel;
    private static JProgressBar progBar;
    private static JSlider slider;
    private static JColorChooser colorChooser;
    private static JTextPane textArea;
    private static JTextArea textPane;
    private static JToolBar tool;
    private static JLabel user;
    private static JButton logExit, confirm;
    private static JPasswordField password;
    private static JTextField textField;



    public static void main (String[] args){

        System.out.println("Test Message");
        GUI();
    }

    private static void GUI () {

        mainFrame = new JFrame();
        mainPanel = new JPanel();

        textField = new JTextField(20);
        password = new JPasswordField(20);
        logExit = new JButton();
        confirm = new JButton();
        ImageIcon imageIcon = new ImageIcon("iWut Import (01-28-2016) 125.jpg");

        mainFrame.setVisible(true);
        mainPanel.setVisible(true);
        mainFrame.add(mainPanel);
        mainPanel.setBackground(new Color(0x123456));
        mainFrame.setBounds(50, 50, 400, 200);
        mainPanel.setBounds(50, 50, 100, 100);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel.add(textField);
        mainFrame.setTitle("Hypo Bank, LLC");
        textField.setText("Username");
        String userName = textField.getText();
        password.setText("Password");
        password.setEditable(true);
        mainPanel.add(password);
        mainPanel.add(confirm);
        confirm.setText("Sign in");

        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                servSelect();
            }
        });

        logExit.setText("Cancel");
        logExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            System.exit(0);
            }
        });

        mainPanel.add(logExit);
        mainPanel.setLayout(null); //This will allow customization of rows, columns, etc.

        confirm.setBounds(100, 100, 75, 25);
        logExit.setBounds(180, 100, 75, 25);
        textField.setBounds(100,40,180,25);
        password.setBounds(100,70,180, 25);


    }

    public static void servSelect (){

        mainFrame = new JFrame();
        mainPanel = new JPanel();
        textArea = new JTextPane();
        textPane = new JTextArea();


        mainFrame.setVisible(true);
        mainPanel.setVisible(true);
        mainFrame.add(mainPanel);
        mainFrame.setBounds(50, 50, 400, 200);
        mainPanel.setBounds(50, 50, 400, 200);
        mainPanel.setBackground(new Color(0x123456));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.setTitle("Hypo Bank, LLC");
        mainFrame.add(textArea);
        textArea.setText("Howdy!");
        textArea.setBounds(50,50,180,25);
        textArea.setSelectedTextColor(Color.blue);



    }
}
