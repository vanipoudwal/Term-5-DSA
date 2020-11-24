
package averageage;

public class AverageAge
{
    public static void main(String[] args)
    {
        String data[] = {"ram,21,32000", "sumit,23,23000", "manish,24,18000"};
        int sum=0, avg=1;
        for(int i=0;i<=data.length-1;i++)
        {
            String arr[] = data[i].split(",");
            int age = Integer.parseInt(arr[1]);
            sum=sum+age;
            avg=sum/3;
        }
        System.out.println(avg);
    }
}
