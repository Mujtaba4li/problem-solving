import java.util.*;

class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enterAgain;
        do {
            System.out.print("Enter range number1:");
            int input1 = scanner.nextInt();
            System.out.print("Enter range number2:");
            int input2 = scanner.nextInt();
            for (int j = input1; j <= input2; j++) {
                boolean isPrime = true;
                if (j == 1) {
                    continue;

                }
                for (int i = 2; i <= j / 2; i++) {

                    if (j % i == 0) {

                        /// System.out.println(i);
                        isPrime = false;
                    }

                }
                if (isPrime == true) {
                    System.out.print(j + " ");
                }
            }
         
            System.out.print("\nEnter 0 to re-run program :");
            enterAgain=scanner.nextInt();

        } while (enterAgain == 0);

    }
}