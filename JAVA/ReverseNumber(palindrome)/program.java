import java.util.Scanner;

class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :");
        int number = scanner.nextInt();
        int temp = number;
        int sum = 0, rem = 0;
        while (number > 0) {
            rem = number % 10;
            sum = (sum * 10) + rem;
            number = number / 10;
        }
        System.out.println("Reverse number of '" + temp + "' is : " + sum);

        if(temp==sum)
        {
            System.out.println("Number is palindrome");

        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}