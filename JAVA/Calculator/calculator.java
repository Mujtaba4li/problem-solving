import java.util.*;

class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value a :");
        int a = scanner.nextInt();
        System.out.print("Enter value b :");
        int b = scanner.nextInt();
        int enterAgain,ans;
        do {

            System.out.print("\nEnter + to Add \n - to Subtract \n / to divide \n * to multipy: ");
            char operation = scanner.next().charAt(0);
            switch (operation) {
                case '+':
                    ans=a+b;
                    System.out.println("Addition is is "+ans);
                    break;
                case '-':
                    System.out.println("Subtract :" + (a - b));
                    break;
                case '/':
                    System.out.println("Divide :" + (a / b));
                    break;
                case '*':
                    System.out.println("Multiply :" + (a * b));
                    break;
                default:
                    System.out.println("You enter wrong input");
                    break;
            }

            System.out.print("\n Enter 0 to perform operation again :");
            enterAgain = scanner.nextInt();
        } while (enterAgain == 0);

    }
}