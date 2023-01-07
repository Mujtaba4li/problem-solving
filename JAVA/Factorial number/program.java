
import java.util.*;
class program{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input=scanner.nextInt();
        for(int i=input-1;i>=1;i--)
        {
            input=input*i;
           
            
            // System.out.println("Factorial is :"+input);
        }
        System.out.println("Factorial is :"+input);
    }
}