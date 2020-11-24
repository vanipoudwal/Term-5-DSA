
package binarysearchchar;

import java.util.Scanner;

public class BinarySearchChar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        int i,n;
        System.out.print("Enter the no. of elements in an array :: ");
        n = sc.nextInt();
        
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the element inside array in sorted manner :: "+"\t");
            arr[i] = sc.nextInt();
        }
        
        char ch = 'y';
        do
        {
            int item;
            System.out.print("Enter item data :: ");
            item = sc.nextInt();
            int lb = 0;
            int ub = n-1;
            int mid = (lb+ub)/2;
            
            while(item!=arr[mid])
            {
                if(item>arr[mid])
                {
                    lb = mid+1;
                }
                else
                {
                    ub = mid-1;
                }
                mid = (lb+ub)/2;
            }
            
            if(item==arr[mid])
            {
                System.out.println("Item Found..");
            }
            else
            {
                System.out.println("Item Not Found..");
            }
            System.out.print("Do You Want To Search Again ?? ");
            ch = sc.next().charAt(0);
        }
        while(ch=='y');
    }
}
