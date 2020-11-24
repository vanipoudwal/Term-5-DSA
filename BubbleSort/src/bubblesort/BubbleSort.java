
package bubblesort;

public class BubbleSort
{
    public static void main(String[] args)
    {
        //There are Marks of 10 Students in an Array..
        int arr[] = {99,11,77,22,44,33,88,55,66};
        int pass, n=arr.length, j, vani;
        
        for(pass=1; pass<=n-1-pass; pass++)
        {
            for(j=0; j<=n-1-pass; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    vani = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = vani;
                }
            }
        }
        
        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
