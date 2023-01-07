import java.util.*;

class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :");
        int number = scanner.nextInt();
        // }}
      
        int rem = 0,sum=0,temp;
        temp=number;
        for(int i=0;i<=number;i++)
        {
            rem=number%10;
            sum=sum+(rem*rem*rem);
            number=number/10;
        }
        if(temp==sum)
        {
            System.out.println("Armstrong Number");

        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}