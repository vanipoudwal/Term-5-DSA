
package insertionsort;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int arr[] = {70,80,30,10,20};
        
        int n = arr.length;
        for(int i=1; i<n; i++)
        {
            int vani = arr[i];
            int j = i-1;
            
            while(j>=0 && arr[j]>vani)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = vani;
        }
        
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }  
}
