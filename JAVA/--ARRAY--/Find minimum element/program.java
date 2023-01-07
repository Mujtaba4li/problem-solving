import java.util.*;
class program{
    public static void main(String[] args)
    {
        int arr[]= new int[]{4,2,5,7,1,8};
        int miniElement=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<miniElement)//Sign then it show greater number
            {
                miniElement=arr[i];
            }
        }
        System.out.println("Mini element is: "+miniElement);

    }
}