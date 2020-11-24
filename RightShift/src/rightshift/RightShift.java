
package rightshift;

import java.util.Scanner;

public class RightShift
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :: ");
        int num;
        num = sc.nextInt();

        System.out.println(num>>2);
    } 
}
