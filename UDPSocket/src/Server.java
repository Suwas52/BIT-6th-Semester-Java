import java.io.IOException;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        //connection for data
        DatagramSocket socket = new DatagramSocket();
        String message = "Hello world";
        Inet4Address address = (Inet4Address) InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(),address,12345);

        //send the message
        socket.send(packet);

        socket.close();
    }
}
