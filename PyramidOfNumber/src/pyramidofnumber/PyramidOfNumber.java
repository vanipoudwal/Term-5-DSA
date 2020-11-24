
package pyramidofnumber;

import java.util.Scanner;

public class PyramidOfNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number :: ");
        num = sc.nextInt();
        
        int i,j;
            for(i=1;i<=num;i++)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print(j+"\t");
                }
            System.out.println();
            }
    }
    
}
