
package primenumber;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        int num=6,i;
            for(i=2;i<=num/2;i++)
            {
                if(num%i==0)
                {
                    System.out.println("Number is NOT PRIME..");
                    break;
                }
            }
            if(num%i!=0)
            {
                System.out.println("Number is PRIME..");
            }
    }
}
