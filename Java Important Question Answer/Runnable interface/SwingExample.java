import javax.swing.*;
import java.awt.event.*;

public class SwingExample {
    
    public static void main(String[] args) {
        
        // Create a new JFrame
        JFrame frame = new JFrame("Swing Example");
        
        // Create a new JLabel
        JLabel label = new JLabel("Enter two numbers:");
        label.setBounds(50, 50, 150, 20);
        
        // Create two new JTextFields
        JTextField textField1 = new JTextField();
        textField1.setBounds(50, 80, 100, 20);
        
        JTextField textField2 = new JTextField();
        textField2.setBounds(50, 110, 100, 20);
        
        // Create a new JButton
        JButton button = new JButton("Multiply");
        button.setBounds(50, 140, 100, 20);
        
        // Create a new JCheckBox
        JCheckBox checkBox = new JCheckBox("Show result");
        checkBox.setBounds(50, 170, 100, 20);
        
        // Add an ActionListener to the JButton
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the values from the JTextFields
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                int result = num1 * num2;
                
                // Set the result in a JLabel
                if (checkBox.isSelected()) {
                    label.setText("Result: " + result);
                } else {
                    label.setText("Enter two numbers:");
                }
            }
        });
        
        // Add the components to the JFrame
        frame.add(label);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(button);
        frame.add(checkBox);
        
        // Set the size and visibility of the JFrame
        frame.setSize(250, 250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
