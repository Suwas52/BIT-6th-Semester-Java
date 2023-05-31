import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatApp extends JFrame {

    private JPanel messagePanel;
    private JTextField messageField;
    private JButton sendButton;
    public ChatApp() {
        super("Chat App");

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        messagePanel = new JPanel();
//        getContentPane().add(messagePanel, BorderLayout.CENTER);
        messageField = new JTextField(20);
        sendButton = new JButton("Send");

        JPanel inputPanel = new JPanel();
        inputPanel.add(messageField);
        inputPanel.add(sendButton);

        getContentPane().add(inputPanel, BorderLayout.CENTER);

        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message = messageField.getText();
//                System.out.println(message);

            }
        });


    }


    private void addMessage(String message) {

        JLabel label = new JLabel(message);
        messagePanel.add(label);
        messagePanel.revalidate();
        messagePanel.repaint();
    }


    public static void main(String[] args) {

        ChatApp chatApp = new ChatApp();
        chatApp.setVisible(true);
    }
}

