import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Server{
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();

        Scanner input =new Scanner(System.in);
        String message = input.nextLine();

        InetAddress address = InetAddress.getByName("localhost");

        DatagramPacket packet = new DatagramPacket(message.getBytes(),message.length(),address,12345);

        socket.send(packet);
        socket.close();
    }
}
