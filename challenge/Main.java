
// get a number from user and show it in words
// eg user gave 832 => eight three two 
// steps  
// 1 get a num from user
// 2 reverese the number
// 3 convert that reversed num to string 
// 4 get char one by one and pass to switch case and show the matching number one by one
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        System.out.print("In words: ");

        while (number > 0) {
            int digit = number % 10;
            System.out.print(words[digit] + " ");
            number /= 10;
        }
    }
}
