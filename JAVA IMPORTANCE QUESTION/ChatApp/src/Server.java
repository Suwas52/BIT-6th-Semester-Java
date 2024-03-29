import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Ready");
            Socket socket = serverSocket.accept();


            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            BufferedReader socketInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            OutputStream outStream = socket.getOutputStream();

            PrintWriter printWriter = new PrintWriter(outStream);

            String sendingMessage, receivingMessage;

            while(true){
                sendingMessage = userInput.readLine();
                printWriter.println(sendingMessage);
                printWriter.flush();

                receivingMessage = socketInput.readLine();
                System.out.println("Client: " + receivingMessage);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}