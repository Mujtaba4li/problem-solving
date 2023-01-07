import java.util.*;

class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        int output[] = new int[arr.length];
        System.out.print("\nEnter number of Rotation: ");
        int numberOfRotation = scanner.nextInt();
        int rotatingPoint=numberOfRotation;
        int i = 0;
        while(rotatingPoint<arr.length)
        {
            output[i]=arr[rotatingPoint];
            rotatingPoint++;
            i++;

        }
        rotatingPoint=0;
        while(rotatingPoint<numberOfRotation)
        {
            output[i]=arr[rotatingPoint];
            rotatingPoint++;
            i++;
        }


        System.out.print("\nOriginal array is:");
        for(int j=0;j<output.length;j++)
        {
          System.out.print(" "+arr[j]);
        }
        System.out.print("\nOutput of array is:");
        for(int j=0;j<output.length;j++)
        {
          System.out.print(" "+output[j]);
        }

    }
}