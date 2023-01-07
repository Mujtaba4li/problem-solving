import java.util.Scanner;

class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a aphabet :");
        char alphabet = scanner.next().charAt(0);

        switch (alphabet) {
            case 'a':
               
            case 'e':
                System.out.println(alphabet + ":is vowel");
                break;
            case 'i':
                System.out.println(alphabet + ":is vowel");
                break;
            case 'o':
                System.out.println(alphabet + " :is vowel");
                break;
            case 'u':
                System.out.println(alphabet + " :is vowel");
                break;
            default:
                System.out.println(alphabet + " :is Consonants");
                break;
        }
    }
}