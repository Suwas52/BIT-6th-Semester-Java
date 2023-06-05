import java.io.*;

public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("subash.text");

        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Subash Danuwar");
            fileWriter.close();
            System.out.println("Successuly");
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = reader.readLine();

            while(line!= null){
                System.out.println(line);
                line = reader.readLine();
            }
        }
        catch(IOException e){
            throw new RuntimeException();
        }

    }
}