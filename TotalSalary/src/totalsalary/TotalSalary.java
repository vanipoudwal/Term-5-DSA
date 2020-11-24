
package totalsalary;

public class TotalSalary
{
    public static void main(String[] args) 
    {
        String data[] = {"ram,21,32000", "sumit,23,23000", "manish,24,18000"};
        int sum=0;
        for(int i=0;i<=data.length-1;i++)
        {
            String arr[] = data[i].split(",");
            int sal = Integer.parseInt(arr[2]);
            sum=sum+sal;
        }
        System.out.println(sum);
    }
}
