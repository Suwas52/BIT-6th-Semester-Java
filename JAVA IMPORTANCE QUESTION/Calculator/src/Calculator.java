import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    JTextField text1 ;
    JTextField text2 ;

    JButton Add;
    JButton Clear;
    JTextField Result;

    public Calculator() {
        setTitle("Calulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(4,2));
//        setLayout(null);

        setSize(300,250);

        text1 = new JTextField();
        text2 = new JTextField();

        Result = new JTextField();
        Result.setEditable(false);

        Add = new JButton("Add");
        Add.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int number1 = Integer.parseInt(text1.getText());
                int number2 = Integer.parseInt(text2.getText());

                int result = number1 +number2;

                Result.setText(String.valueOf(result));


            }
        });

        Clear = new JButton("Clear");
        Clear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

//        add(new JLabel("Number 1:")).setBounds(10,30,100,25);
        add(new JLabel("Number 1:"));

//        text1.setBounds(100,30,150,25);
        add(text1);

//        add(new JLabel("Number 2:")).setBounds(10,60,100,25);
        add(new JLabel("Number 2:"));

//        text2.setBounds(100,60,150,25);
        add(text2);

//        add(new JLabel("Result:")).setBounds(10,90,100,25);
        add(new JLabel("Result:"));

//        Result.setBounds(100,90,150,25);
        add(Result);

//        Add.setBounds(100,120,70,25);
        add(Add);

//        Clear.setBounds(180,120,70,25);
        add(Clear);











        setVisible(true);

    }



    public static void main(String[] args) {
        Calculator cal = new Calculator();
    }
}
