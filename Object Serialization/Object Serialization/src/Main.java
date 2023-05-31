import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("Subash.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Person person = new Person();
        objectOutputStream.writeObject(person);

        //Object desereliable
        FileInputStream fileInputStream = new FileInputStream("Subash.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Person p2 = (Person)objectInputStream.readObject();
        p2.displayName();
    }
}