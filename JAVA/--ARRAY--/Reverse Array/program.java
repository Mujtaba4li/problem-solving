import java.util.*;

class program {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=5;
        int arr1[] = new int[n];
        System.out.print("\n Enter element of array at '");
        for(int x=0;x<n;x++)
        {
            System.out.print(x+" ' :");
            arr1[x]=scanner.nextInt();
        }
       
       
        System.out.print("Actual array is : ");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.print("\nReverse array is : ");
        for(int j=arr1.length-1;j>=0;j--)
        {
            System.out.print(arr1[j]+" ");
        }
    }
}