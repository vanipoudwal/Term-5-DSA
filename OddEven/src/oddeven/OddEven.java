
package oddeven;

import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter Any Number :: ");
        num = sc.nextInt();

        if(num%2==0)
        {
            System.out.println("Even Number..");
        }
        else
            System.out.println("Odd Number..");
    }
}
