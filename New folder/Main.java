import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aaja ko Frame");

        JLabel label = new JLabel("Login page");
        label.setBounds(50, 60, 400, 50);

        // window
        frame.setSize(600, 500);
        frame.setVisible(true);

        JTextField username = new JTextField("Enter User Name");
        JTextField email = new JTextField("Enter Email Address");
        username.setBounds(50, 100, 200, 50);
        email.setBounds(50, 160, 200, 50);

        JButton click = new JButton("Click Me");
        click.setBounds(50, 210, 200, 50);

        String[] animals = { "Cat", "Dog", "Lion"};

        JComboBox comboBox = new JComboBox<String>(animals);

        comboBox.setBounds(60, 350, 200, 50);

        frame.setResizable(false);

        frame.add(label);
        frame.add(username);
        frame.add(email);
        frame.add(click);
        frame.add(comboBox);

    }

}