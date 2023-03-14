import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        //This is a try catch block
        // try {
        // int divider = 10;
        // int value = 50;
        // int result = value / divider;
        // System.out.println("Result>>" + result);
        // } catch (ArithmeticException e) {
        // System.out.println("Error message"+e);
        // }finally {
        // System.out.println("This is the part of finally");
        // }

        // throws can completely terminate the entire code after error

        int divider = 0;
        int value = 50;
        int result = value / divider;
        System.out.println("Result>>" + result);

        if (divider == 0) {
            throw new Exception("Divided by zero error");
        }

        // catch(Exception e){
        // System.out.println(e);
        // }

        // other works
        anotherWork();
        anotherWork();
        anotherWork();

    }

    static void anotherWork() {
        System.out.println("another work");
    }
}