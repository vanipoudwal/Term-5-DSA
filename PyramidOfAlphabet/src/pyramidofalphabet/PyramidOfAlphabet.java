
package pyramidofalphabet;

import java.util.Scanner;

public class PyramidOfAlphabet
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text;
        System.out.print("Enter the alphabet :: ");
        text = sc.next();
        
        char i,j;
        for(i='a';i<='e';i++)
            {
                for(j='a';j<=i;j++)
                {
                    System.out.print(i+"\t");
                }
            System.out.println();
            }
    }
}
