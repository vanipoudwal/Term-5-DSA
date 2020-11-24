
package primeapplication;

public class PrimeApplication
{
    public static void main(String[] args)
    {
        int n,i;
        for(n=1;n<=100;n++)
        {
            for(i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    System.out.println("Number is NOT PRIME..");
                    break;
                }
            }
            if(n%i!=0)
            {
                System.out.println(n+"\t");
            }
        }
    }
}