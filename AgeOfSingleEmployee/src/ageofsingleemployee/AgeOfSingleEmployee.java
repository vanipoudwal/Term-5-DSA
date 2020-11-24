
package ageofsingleemployee;

public class AgeOfSingleEmployee 
{
    public static void main(String[] args)
    {
        String data[] = {"ram,21,32000", "sumit,23,23000", "manish,24,18000"};
        for(int i=0; i<=data.length-1; i++)
        {
            String arr[] = data[i].split(",");
            String name = arr[0];
                if(name.equals("ram"))
                {
                    System.out.println(arr[1]);
                }
                else if(name.equals("sumit"))
                {
                    System.out.println(arr[1]);
                }
                else if(name.equals("manish"))
                {
                    System.out.println(arr[1]);
                }
        }
    }
}
