import java.util.*;
class program{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in); 
        int con;
        do{
            
        System.out.println("Enter number:");
        int input=scanner.nextInt();
        // System.out.println("User input is:"+input);
        boolean isPrime=true;
        for(int i=2;i<=input/2;i++){
            if(input%i==0){
                isPrime=false;
            }
        }


        if(isPrime==true){
            System.out.println("Entered number is prime");
        }
        else{
            System.out.println("Entered number is not prime");
        }
        System.out.println("Enter 0 to re-enter or press any other key to terminate:");
         con = scanner.nextInt();

    }while(con==0);

    }
}