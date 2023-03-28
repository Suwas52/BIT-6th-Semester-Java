import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class box extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);

       

        g.setColor(Color.black);
        g.fillRect(10, 10, 100, 100);

        g.setColor(Color.BLUE);
        g.fillRect(250, 10, 100, 100);

        
    }
}
