
package quicksort;

class Test
{
    private int arr[] = new int[5];
    
    public void getArray(int str[])
    {
        arr = str;
    }
    
    public void putArray()
    {
        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
    
    public void qs(int low, int high)
    {
        if(low>high)
            return;
        int pivot, i, j, vani;
        pivot = arr[low];
        i = low+1;
        j = high;
        
        while(i<=j)
        {
            while((i<=high)&&(arr[i]<=pivot))
            {
                i++;
            }
            while((j>=low)&&(arr[j]>pivot))
            {
                j--;
            }
            
            if(i<j)
            {
                vani = arr[i];
                arr[i] = arr[j];
                arr[j] = vani;
            }
        }
        
        if(low<j)
        {
            vani = arr[j];
            arr[j] = arr[low];
            arr[low] = vani;
        }
        qs(low, j-1);
        qs(j+1, high);
    }
}

public class QuickSort 
{
    public static void main(String[] args)
    {
        int arr[] = {3,8,43,21,2};
        Test obj = new Test();
        obj.getArray(arr);
        obj.qs(0,4);
        obj.putArray();
    }
}
