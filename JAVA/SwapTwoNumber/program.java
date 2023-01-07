import java.util.Scanner;

class program {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System. in);
        System.out.print("Enter number 1 :");
        int number1=scanner.nextInt();
        System.out.print("Enter number 2 :");
        int number2=scanner.nextInt();
        // int tem=number1;
        // number1=number2;
        // number2=tem;
        number2=number1+number2;
        number1=number2-number1;
        number2=number2-number1;

        System.out.println("Number 1 is :"+number1);
        System.out.println("Number 2 is :"+number2);
    }
}