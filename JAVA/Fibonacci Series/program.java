import java.util.*;

class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number till Fibonacci series run :");
        int end = scanner.nextInt();
        int num1 = 0, num2 = 1;
        int sum = 0;
        System.out.print(num1 + " " + num2);
        for (int i = 2; i < end; i++) {
            sum = num1 + num2;
            System.out.print(" "+sum);
            num1 = num2;
            num2 = sum;
           if(sum>=end)
           {
            break;
           }
        }
    }
}