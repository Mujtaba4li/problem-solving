import java.util.*;


public class program{
    public static void main(String[] args)
    {
        
      
        int[] arr=new int[]{3,4,1,4,2,1,0,8,1,4};
        for(int n=0;n<arr.length;n++)
        {
      
            for(int i=0;i<arr.length-n-1;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
             
                }
            }
        
        }
      
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}