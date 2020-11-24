
package selectionsort;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int vani, arr[] = {1,98,12,87,2,8};
        int i,j,n=arr.length,min_index;
         
        for(j=0; j<=n-2; j++)
        {
            min_index = j;
            
            for(i=j+1; i<=n-1; i++)
            {
                if(arr[i]<arr[min_index])
                {
                    min_index = i;
                }
            }
            
            vani = arr[j];
            arr[j] = arr[min_index];
            arr[min_index] = vani;  
        }
        
        for(i=0; i<=n-1; i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
