
package linearsearch;

import java.util.Scanner;

public class LinearSearch 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {13,98,34,26,19,90};
        int i, search, flag=0;
        System.out.print("Entee the no. that you want to search :: ");
        search = sc.nextInt();
        
        for(i=0;i<arr.length;i++)
        {
            if(search==arr[i])
            {
                flag = 1;
                break;
            }
        }
        
        if(flag==1)
        {
            System.out.println("ID Found..");
        }
        else
        {
            System.out.println("ID Not Found..");
        }
    }
}
