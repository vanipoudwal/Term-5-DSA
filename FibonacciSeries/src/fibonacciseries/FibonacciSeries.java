
package fibonacciseries;

import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num, a=0, b=0, c=1;
        System.out.print("Enter the number :: ");
        num = sc.nextInt();
        
            for(int i=1; i<=num; i++)
            {
                a = b;
                b = c;
                c = a+b;
                System.out.print(a+"\t");
            }
    }
}
