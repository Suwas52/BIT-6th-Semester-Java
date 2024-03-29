import java.io.*;
import java.net.Socket;

public class Client{
    public static void main(String[] args) {
        try {


            Socket socket = new Socket("127.0.0.1",12345);


            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            BufferedReader socketInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            OutputStream outStream = socket.getOutputStream();

            PrintWriter printWriter = new PrintWriter(outStream);

            String sendingMessage, receivingMessage;

            while(true){
                receivingMessage = socketInput.readLine();
                System.out.println("Server: " + receivingMessage);
                sendingMessage = userInput.readLine();
                printWriter.println(sendingMessage);
                printWriter.flush();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}