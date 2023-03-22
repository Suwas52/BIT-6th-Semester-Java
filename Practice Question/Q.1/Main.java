import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write the program fo find whether the number is prime or not

        System.out.println("Enter the number for check prime number");
        Scanner inputObj = new Scanner(System.in);
        int userInput = inputObj.nextInt();

        int count = 0;
        for (int i = 1; i <= userInput; i++) {
            if (userInput % i == 0) {
                count++;
            }

        }
        if (count <= 2) {
            System.out.println("This is prime number");
        } else {
            System.out.println("This is not prime number");
        }

    }

}