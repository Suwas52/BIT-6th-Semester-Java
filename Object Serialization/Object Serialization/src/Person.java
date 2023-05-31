import java.io.Serializable;

public class Person implements Serializable {
    String name = "Subash Danuwar";

    void displayName(){
        System.out.println(name);
    }
}
