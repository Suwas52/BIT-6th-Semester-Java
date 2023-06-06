import java.applet.Applet;
import java.awt.*;
public class HelloApplet extends Applet {
    @Override
    public void paint(Graphics g){
     String message =   getParameter("message");

        //If exam ma draw image vanyo vani drawImage halne ani path halne
       g.drawString(message, 20 ,20);
    }
}
