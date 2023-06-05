import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Client {
    public static void main(String[] args) throws IOException {

        System.out.println("Client");
        DatagramSocket socket = new DatagramSocket(12345);
        byte[] data = new byte[1924];

        DatagramPacket packet = new DatagramPacket(data , data.length);

        socket.receive(packet);
        String Message = new String(packet.getData(),0,packet.getLength());
        System.out.println(Message);
        socket.close();

    }
}