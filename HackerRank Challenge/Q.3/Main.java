import java.util.*;
public class Main{
    public static void main(String[] args){
        System.out.println("Enter the number you want to                        multiplication of that number");
        Scanner inputObj = new Scanner(System.in);
        int n = inputObj.nextInt();
        
        for(int i=1; i<=10; i++){
            System.out.println(n +" x "+ i+ " = "+ n*i);
        }
        
    }
}