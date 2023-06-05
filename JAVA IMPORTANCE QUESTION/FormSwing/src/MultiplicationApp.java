import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplicationApp extends JFrame {
    private JTextField number1Field;
    private JTextField number2Field;
    private JButton okButton;
    private JButton exitButton;
    private JTextField resultField;

    public MultiplicationApp() {
        // Set up the JFrame
        setTitle("Multiplication App");

        setLayout(new GridLayout(4,2));

        // Create the input fields
        number1Field = new JTextField();

        number2Field = new JTextField();


        // Create the OK button
        okButton = new JButton("OK");

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the values from the input fields
                int number1 = Integer.parseInt(number1Field.getText());
                int number2 = Integer.parseInt(number2Field.getText());

                // Perform the multiplication
                int result = number1 + number2;

                // Display the result in the result field
                resultField.setText(String.valueOf(result));
            }
        });

        // Create the Exit button
        exitButton = new JButton("Exit");

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exit the program
                System.exit(0);
            }
        });

        // Create the result field
        resultField = new JTextField();
        resultField.setEditable(false);


        // Add the components to the JFrame
        add(new JLabel("Number 1:"));
        add(number1Field);
        add(new JLabel("Number 2:"));
        add(number2Field);
        add(okButton);
        add(exitButton);
        add(new JLabel("Result:"));
        add(resultField);

        // Set the size and make the JFrame visible
        setSize(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the MultiplicationApp
        MultiplicationApp app = new MultiplicationApp();
    }
}
