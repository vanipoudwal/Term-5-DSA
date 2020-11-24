
package binarysearch;

import java.util.Scanner;

public class BinarySearch 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {12,17,19,21,27,32,45,53};
        int search, n=arr.length;
        int lb=0, ub=n-1;
        System.out.print("Enter the no. that you want to search :: ");
        search = sc.nextInt();
        int mid = (lb+ub)/2;
        
        while(search!=arr[mid] && lb<=ub)
        {
            if(search>arr[mid])
            {
                lb = mid+1;
            }
            else
            {
                ub = mid-1;
            }
            mid = (lb+ub)/2;
        }
        
        if(search==arr[mid])
        {
            System.out.println("ID Found..");
        }
        else
        {
            System.out.println("ID Not Found..");
        }
    }
}
