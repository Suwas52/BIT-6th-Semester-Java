import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        System.out.println("Port 12345 is open for connection");
        System.out.println("Enter some message to send client");
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            Socket socket = serverSocket.accept();
            System.out.println("Connection Established");

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream, true);


            Scanner input = new Scanner(System.in);
            while(true){
                String inputString = input.nextLine();
                printWriter.println(inputString);
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}