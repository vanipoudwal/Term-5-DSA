
package searchbinary;

import java.util.Scanner;

public class SearchBinary 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7};
        int item, n=arr.length;
        int lb=0, ub=n-1;
        int mid = (lb+ub)/2;
        int flag = 0;
        System.out.print("Enter the element :: ");
        item = sc.nextInt();
        while(lb<=ub)
        {
            if(arr[mid]==item)
            {
                flag = 1;
                break;
            }
            if(item<arr[mid])
            {
                ub = mid-1;
            }
            else
            {
                lb=mid+1;
            }
            mid = (lb+ub)/2;
        }
        if(flag==1)
        {
            System.out.println("Item found....");
        }
        else
        {
            System.out.println("Item not found....");
        }
    }
}
