
//javax meaning java extension
//.* meaning all extension enable
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello world");

        // button add
        JButton button = new JButton("Click me!");
        button.setBounds(200, 200, 100, 50);

        frame.add(button);

        JLabel label = new JLabel("Subash Danuwar");
        label.setBounds(300, 300, 100, 200);

        frame.add(label);

        frame.setSize(2000, 2000);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}