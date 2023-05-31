//Factorial of given number using recursion
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the number you want to find factorial");
        Scanner inputScan = new Scanner(System.in);

        int num = inputScan.nextInt();

        long value = sum(num);

        System.out.println(value);

    }

    public static long sum(int x){
        if(x>=1){
            return x * sum(x-1);
        }
        else {
            return 1;
        }
    }



}